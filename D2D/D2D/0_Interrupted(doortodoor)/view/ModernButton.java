package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ModernButton extends JButton {
    private final Timer animator;
    private float alpha = 1.0f;
    private boolean mouseOver = false;

    public ModernButton(String text, Color bgColor, Color fgColor) {
        super(text);
        setBackground(bgColor);
        setForeground(fgColor);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setOpaque(true);

        animator = new Timer(50, e -> {
            repaint();
            alpha = mouseOver ? Math.min(alpha + 0.1f, 1.0f) : Math.max(alpha - 0.1f, 0.6f);
        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mouseOver = true;
                animator.start();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                mouseOver = false;
                animator.start();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        var g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        super.paintComponent(g2);
        g2.dispose();
    }
}