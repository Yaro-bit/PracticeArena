package view;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.sql.SQLException;

import controller.MainController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class MainView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField zipCodeField;
    private JTextArea notesArea;
    private JButton dbUpdateButton;
    private JButton markStatusButton;
    private JButton logoutButton; // Declare logoutButton at the class level
    private MainController controller;
    private JScrollPane addressScrollPane;
    private JList<String> addressList;
    private DefaultListModel<String> addressListModel;

    // Light Mode Colors
    private static final Color PRIMARY_COLOR = new Color(52, 152, 219); // Modern Blue
    private static final Color SECONDARY_COLOR = new Color(46, 204, 113); // Modern Green
    private static final Color BACKGROUND_COLOR = new Color(236, 240, 241); // Light Gray
    private static final Color PANEL_BACKGROUND = new Color(255, 255, 255); // White
    private static final Color TEXT_COLOR = new Color(44, 62, 80); // Dark Gray

    // Dark Mode Colors
    private static final Color DARK_PRIMARY_COLOR = new Color(41, 128, 185); // Darker Blue
    private static final Color DARK_SECONDARY_COLOR = new Color(39, 174, 96); // Darker Green
    private static final Color DARK_BACKGROUND_COLOR = new Color(44, 62, 80); // Dark Gray
    private static final Color DARK_PANEL_BACKGROUND = new Color(52, 73, 94); // Darker Gray
    private static final Color DARK_TEXT_COLOR = new Color(236, 240, 241); // Light Gray

    // Current theme colors
    private Color currentPrimaryColor = PRIMARY_COLOR;
    private Color currentSecondaryColor = SECONDARY_COLOR;
    private Color currentBackgroundColor = BACKGROUND_COLOR;
    private Color currentPanelBackground = PANEL_BACKGROUND;
    private Color currentTextColor = TEXT_COLOR;
    private boolean isDarkMode = false;

    // Time Label
    private JLabel timeLabel;
    private Timer timer;
    private final SubmissionPublisher<String> addressPublisher = new SubmissionPublisher<>();

    public MainView() {
        controller = new MainController(this);
        initializeFrame();
        createComponents();
        setupAddressSubscription();
    }

    private void initializeFrame() {
        setTitle("DOOR-TO-DOOR SALES");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 750);
        setMinimumSize(new Dimension(1000, 700));

        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        contentPane.setLayout(new BorderLayout(25, 25));
        contentPane.setBackground(currentBackgroundColor);
        setContentPane(contentPane);
    }

    private void setupTimer() {
        timeLabel = new JLabel();
        timeLabel.setForeground(Color.WHITE);
        timeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        updateTime();

        timer = new Timer(1000, e -> updateTime());
        timer.start();
    }

    private void updateTime() {
        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        var currentTime = LocalDateTime.now().format(formatter);
        timeLabel.setText(currentTime);
    }

    private void toggleTheme() {
        isDarkMode = !isDarkMode;

        currentPrimaryColor = isDarkMode ? DARK_PRIMARY_COLOR : PRIMARY_COLOR;
        currentSecondaryColor = isDarkMode ? DARK_SECONDARY_COLOR : SECONDARY_COLOR;
        currentBackgroundColor = isDarkMode ? DARK_BACKGROUND_COLOR : BACKGROUND_COLOR;
        currentPanelBackground = isDarkMode ? DARK_PANEL_BACKGROUND : PANEL_BACKGROUND;
        currentTextColor = isDarkMode ? DARK_TEXT_COLOR : TEXT_COLOR;

        updateTheme();
    }

    private void updateTheme() {
        contentPane.setBackground(currentBackgroundColor);

        // Update all panels
        for (var comp : contentPane.getComponents()) {
            if (comp instanceof JPanel panel) {
                updatePanelTheme(panel);
            }
        }

        // Update specific components
        addressList.setBackground(currentPanelBackground);
        addressList.setForeground(currentTextColor);
        notesArea.setBackground(currentPanelBackground);
        notesArea.setForeground(currentTextColor);
        zipCodeField.setBackground(currentPanelBackground);
        zipCodeField.setForeground(currentTextColor);

        // Update all buttons
        updateButtonTheme(logoutButton);
        updateButtonTheme(markStatusButton);
        updateButtonTheme(dbUpdateButton);

        SwingUtilities.updateComponentTreeUI(this);
    }

    private void updateButtonTheme(JButton button) {
        button.setBackground(isDarkMode ? DARK_PRIMARY_COLOR : currentPrimaryColor);
        button.setForeground(isDarkMode ? DARK_TEXT_COLOR : Color.WHITE);
    }

    private JButton createModernButton(String text, Color bgColor, Color fgColor) {
        var button = new JButton(text);
        button.setBackground(bgColor);
        button.setForeground(fgColor);
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setFocusPainted(false);
        button.setBorder(new EmptyBorder(8, 16, 8, 16));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return button;
    }

    private void updatePanelTheme(JPanel panel) {
        panel.setBackground(currentPanelBackground);
        for (var comp : panel.getComponents()) {
            if (comp instanceof JLabel label) {
                label.setForeground(currentTextColor);
            } else if (comp instanceof JPanel nestedPanel) {
                updatePanelTheme(nestedPanel);
            }
        }
    }

    private void createComponents() {
        createTopPanel();
        createLeftPanel();
        createMiddlePanel();
        createRightPanel();
    }

    private void createTopPanel() {
        var topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.setBackground(currentPrimaryColor);
        topPanel.setBorder(new EmptyBorder(10, 20, 10, 20));

        // Logo/Titel-Bereich
        var titleLabel = new JLabel("D2D SALES");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);

        // Benutzer-Bereich
        var userPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        userPanel.setOpaque(false);

        // Time Label
        setupTimer();

        // Dark Mode Toggle Button
        var darkModeButton = new JButton(isDarkMode ? "C" : "O");
        darkModeButton.setPreferredSize(new Dimension(35, 35));
        darkModeButton.setBackground(isDarkMode ? DARK_SECONDARY_COLOR : SECONDARY_COLOR);
        darkModeButton.setForeground(isDarkMode ? Color.WHITE : Color.BLACK);
        darkModeButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        darkModeButton.setFocusPainted(false);
        darkModeButton.setBorder(new EmptyBorder(5, 5, 5, 5));
        darkModeButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        darkModeButton.addActionListener(e -> {
            darkModeButton.setText(isDarkMode ? "O" : "C");
            darkModeButton.setBackground(isDarkMode ? SECONDARY_COLOR : DARK_SECONDARY_COLOR);
            darkModeButton.setForeground(isDarkMode ? Color.BLACK : Color.WHITE);
            toggleTheme();
        });

        var userLabel = new JLabel("Benutzer: Yaro-bit");
        userLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        userLabel.setForeground(Color.WHITE);

        logoutButton = createModernButton("Logout", Color.WHITE, currentPrimaryColor);
        logoutButton.setPreferredSize(new Dimension(100, 35));

        userPanel.add(timeLabel);
        userPanel.add(Box.createHorizontalStrut(20));
        userPanel.add(darkModeButton);
        userPanel.add(Box.createHorizontalStrut(20));
        userPanel.add(userLabel);
        userPanel.add(Box.createHorizontalStrut(20));
        userPanel.add(logoutButton);

        topPanel.add(titleLabel, BorderLayout.WEST);
        topPanel.add(userPanel, BorderLayout.EAST);

        contentPane.add(topPanel, BorderLayout.NORTH);
    }

    private void createLeftPanel() {
        var leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBackground(currentPanelBackground);
        leftPanel.setBorder(createRoundedBorder());
        leftPanel.setPreferredSize(new Dimension(280, 500));

        var searchPanel = new JPanel();
        searchPanel.setLayout(new BoxLayout(searchPanel, BoxLayout.Y_AXIS));
        searchPanel.setOpaque(false);
        searchPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        var zipCodeLabel = createStyledLabel("Postleitzahl");
        zipCodeField = createStyledTextField("Geben Sie eine Postleitzahl ein");

        var searchButton = createModernButton("Suchen", currentPrimaryColor, Color.WHITE);
        searchButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        var loadButton = createModernButton("DB Aktualisieren", currentSecondaryColor, Color.WHITE);
        loadButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        loadButton.addActionListener(e -> {
            controller.loadAddresses(zipCodeField.getText());
        });

        searchPanel.add(zipCodeLabel);
        searchPanel.add(Box.createVerticalStrut(10));
        searchPanel.add(zipCodeField);
        searchPanel.add(Box.createVerticalStrut(15));
        searchPanel.add(searchButton);
        searchPanel.add(Box.createVerticalStrut(20));
        searchPanel.add(loadButton);

        leftPanel.add(searchPanel);
        contentPane.add(leftPanel, BorderLayout.WEST);
    }

    private void createMiddlePanel() {
        var middlePanel = new JPanel();
        middlePanel.setLayout(new BorderLayout(0, 20));
        middlePanel.setBackground(currentPanelBackground);
        middlePanel.setBorder(createRoundedBorder());

        var addressListLabel = createStyledLabel("Straßenliste");
        addressListLabel.setBorder(new EmptyBorder(20, 20, 10, 20));

        addressListModel = new DefaultListModel<>();
        addressList = new JList<>(addressListModel);
        addressList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        addressList.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        addressList.setBackground(currentPanelBackground);
        addressList.setBorder(new EmptyBorder(10, 10, 10, 10));

        addressList.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value,
                    int index, boolean isSelected, boolean cellHasFocus) {
                var label = (JLabel) super.getListCellRendererComponent(
                        list, value, index, isSelected, cellHasFocus);
                label.setBorder(new EmptyBorder(8, 15, 8, 15));
                if (isDarkMode) {
                    label.setForeground(isSelected ? Color.WHITE : DARK_TEXT_COLOR);
                    label.setBackground(isSelected ? DARK_PRIMARY_COLOR : DARK_PANEL_BACKGROUND);
                }
                return label;
            }
        });

        addressScrollPane = new JScrollPane(addressList);
        addressScrollPane.setBorder(BorderFactory.createEmptyBorder());

        var buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 15));
        buttonPanel.setBackground(currentPanelBackground);

        markStatusButton = createModernButton("→ In Bearbeitung", currentSecondaryColor, Color.WHITE);
        markStatusButton.addActionListener(e -> {
            var selectedAddress = addressList.getSelectedValue();
            if (selectedAddress != null) {
                controller.toggleAddressStatus(selectedAddress);
            } else {
                showErrorMessage("Bitte wählen Sie eine Adresse aus.");
            }
        });

        dbUpdateButton = createModernButton("Status Zurück", currentPrimaryColor, Color.WHITE);
        dbUpdateButton.addActionListener(e -> resetStatus());

        buttonPanel.add(markStatusButton);
        buttonPanel.add(dbUpdateButton);

        middlePanel.add(addressListLabel, BorderLayout.NORTH);
        middlePanel.add(addressScrollPane, BorderLayout.CENTER);
        middlePanel.add(buttonPanel, BorderLayout.SOUTH);

        contentPane.add(middlePanel, BorderLayout.CENTER);
    }

    private void createRightPanel() {
        var rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout(0, 10));
        rightPanel.setBackground(currentPanelBackground);
        rightPanel.setBorder(createRoundedBorder());
        rightPanel.setPreferredSize(new Dimension(300, 500));

        var notesLabel = createStyledLabel("Notizen");
        notesLabel.setBorder(new EmptyBorder(20, 20, 10, 20));

        notesArea = createStyledTextArea("Hier können Notizen hinterlassen werden.");
        var notesScrollPane = new JScrollPane(notesArea);
        notesScrollPane.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));

        rightPanel.add(notesLabel, BorderLayout.NORTH);
        rightPanel.add(notesScrollPane, BorderLayout.CENTER);

        contentPane.add(rightPanel, BorderLayout.EAST);
    }

    private JLabel createStyledLabel(String text) {
        var label = new JLabel(text);
        label.setFont(new Font("Segoe UI", Font.BOLD, 16));
        label.setForeground(currentPrimaryColor);
        return label;
    }

    private JTextField createStyledTextField(String tooltip) {
        var textField = new JTextField(20);
        textField.setToolTipText(tooltip);
        textField.setBackground(currentPanelBackground);
        textField.setForeground(currentTextColor);
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        textField.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(new Color(200, 200, 200)),
            new EmptyBorder(8, 10, 8, 10)
        ));
        return textField;
    }

    private JTextArea createStyledTextArea(String text) {
        var textArea = new JTextArea(text);
        textArea.setBackground(currentPanelBackground);
        textArea.setForeground(currentTextColor);
        textArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBorder(new EmptyBorder(10, 10, 10, 10));
        return textArea;
    }

    private Border createRoundedBorder() {
        return BorderFactory.createCompoundBorder(
            new LineBorder(new Color(220, 220, 220), 1, true),
            new EmptyBorder(10, 10, 10, 10)
        );
    }

    private void showErrorMessage(String message) {
        showThemedErrorMessage(message);
    }

    private void showSuccessMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Erfolg", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showThemedErrorMessage(String message) {
        UIManager.put("OptionPane.background", currentPanelBackground);
        UIManager.put("Panel.background", currentPanelBackground);
        UIManager.put("OptionPane.messageForeground", currentTextColor);
        UIManager.put("Button.background", currentPrimaryColor);
        UIManager.put("Button.foreground", Color.WHITE);

        JOptionPane.showMessageDialog(this, message, "Fehler", JOptionPane.ERROR_MESSAGE);
    }

    private void updateDatabaseAsync() {
        new Thread(() -> {
            try {
                SwingUtilities.invokeLater(() -> showLoadingIndicator(true));
                controller.updateDatabase();
            } finally {
                SwingUtilities.invokeLater(() -> {
                    showLoadingIndicator(false);
                    showSuccessMessage("Datenbank erfolgreich aktualisiert");
                });
            }
        }).start();
    }

    private void showLoadingIndicator(boolean show) {
        // Implement a loading indicator, such as a progress bar or a spinner
        // Example using a simple label
        var loadingLabel = new JLabel(show ? "Loading..." : "");
        loadingLabel.setForeground(currentTextColor);
        contentPane.add(loadingLabel, BorderLayout.SOUTH);
        contentPane.revalidate();
        contentPane.repaint();
    }

    private void handleError(Exception e) {
        String message;
        if (e instanceof SQLException) {
            message = "Datenbankfehler: " + e.getMessage();
        } else if (e instanceof IOException) {
            message = "Netzwerkfehler: " + e.getMessage();
        } else if (e == null) {
            message = "Unbekannter Fehler";
        } else {
            message = "Ein Fehler ist aufgetreten: " + e.getMessage();
        }
        showThemedErrorMessage(message);
    }

    public void displayAddresses(String[] addresses) {
        addressListModel.clear();
        for (var address : addresses) {
            addressListModel.addElement(address);
        }
    }

    public void updateStatusButton(String status) {
        markStatusButton.setText(switch (status) {
            case "In Bearbeitung" -> "→ Erledigt";
            case "Erledigt" -> "→ Verschwinden";
            case "Verschwinden" -> "";
            case "Offen" -> "→ In Bearbeitung";
            default -> markStatusButton.getText();
        });
        markStatusButton.setBackground(switch (status) {
            case "In Bearbeitung" -> new Color(255, 215, 0);
            case "Erledigt" -> currentSecondaryColor;
            default -> markStatusButton.getBackground();
        });
        markStatusButton.setVisible(!status.equals("Verschwinden"));
    }

    public void updateNotes(String notes) {
        notesArea.setText(notes);
    }

    public void resetStatus() {
        markStatusButton.setText("→ In Bearbeitung");
        markStatusButton.setBackground(currentSecondaryColor);
        markStatusButton.setVisible(true);
    }

    private void setupAddressSubscription() {
        addressPublisher.subscribe(new Flow.Subscriber<>() {
            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                this.subscription = subscription;
                subscription.request(1);
            }

            @Override
            public void onNext(String address) {
                SwingUtilities.invokeLater(() -> addressListModel.addElement(address));
                subscription.request(1);
            }

            @Override
            public void onError(Throwable t) {
                handleError(new Exception(t));
            }

            @Override
            public void onComplete() {}
        });
    }

    @Override
    public void dispose() {
        if (timer != null) {
            timer.stop();
        }
        super.dispose();
    }
}