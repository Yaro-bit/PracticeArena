package demo.wb.kurs;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JProgressBar;

import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import javax.swing.ImageIcon;

public class AppFenster {

	private JFrame frame;
	private JButton HelloWorld;

	private static Controler controler = new Controler();
	private JButton BuyWorld;
	private JPanel panel;
	private JProgressBar progressBar_Hello;
	private JProgressBar progressBar_Bye;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblByeLabel;
	private JButton btnProceed;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JButton btnCancel;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppFenster window = new AppFenster();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppFenster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(getHelloWorld(), BorderLayout.NORTH);
		frame.getContentPane().add(getBuyWorld(), BorderLayout.SOUTH);
		frame.getContentPane().add(getPanel(), BorderLayout.CENTER);
	}

	private JButton getHelloWorld() {
		if (HelloWorld == null) {
			HelloWorld = new JButton("Hello World !");
			HelloWorld.setBackground(Color.GREEN);
			HelloWorld.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			HelloWorld.setForeground(Color.BLACK);
			HelloWorld.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_HelloWorld_actionPerformed(e);
				}
			});
		}
		return HelloWorld;
	}

	protected static void do_HelloWorld_actionPerformed(ActionEvent e) {
		System.out.println("Button HELLO gedrückt");
		new Thread(new Runnable() {
			public void run() {
				controler.langsameMethode();
			}
		}).start();

	}

	protected static void do_ByeWorld_actionPerformed(ActionEvent e) {
		System.out.println("Button BYE gedrückt");
		try {
			Thread.sleep(5 * 1000);
			System.out.println("Thread BYE beendet");
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

	}

	private JButton getBuyWorld() {
		if (BuyWorld == null) {
			BuyWorld = new JButton("Bye Bye World ! ");
			BuyWorld.setBackground(Color.RED);
			BuyWorld.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					do_ByeWorld_actionPerformed(e);
				}

			});
		}

		return BuyWorld;
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getProgressBar_Hello(), BorderLayout.NORTH);
			panel.add(getProgressBar_Bye(), BorderLayout.SOUTH);
			panel.add(getPanel_1(), BorderLayout.CENTER);
		}
		return panel;
	}

	private JProgressBar getProgressBar_Hello() {
		if (progressBar_Hello == null) {
			progressBar_Hello = new JProgressBar(0, 100);
			progressBar_Hello.setValue(0);
			progressBar_Hello.setStringPainted(true);
		}
		return progressBar_Hello;
	}

	private JProgressBar getProgressBar_Bye() {
		if (progressBar_Bye == null) {
			progressBar_Bye = new JProgressBar(0, 100);
			progressBar_Bye.setStringPainted(true);
			progressBar_Hello.setValue(0);
			progressBar_Hello.setStringPainted(true);
		}
		return progressBar_Bye;
	}

	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new GridLayout(0, 2, 0, 0));
			panel_1.add(getPanel_2());
			panel_1.add(getPanel_3());
			panel_1.add(getRdbtnNewRadioButton());
			panel_1.add(getLblNewLabel());
			panel_1.add(getRdbtnNewRadioButton_1());
			panel_1.add(getLblByeLabel());
			panel_1.add(getBtnProceed());
			panel_1.add(getBtnCancel());
		}
		return panel_1;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Hallo Label - Describtion on flag !");
		}
		return lblNewLabel;
	}

	private JLabel getLblByeLabel() {
		if (lblByeLabel == null) {
			lblByeLabel = new JLabel("Bye Label - Describtion on flag !");
		}
		return lblByeLabel;
	}

	private JButton getBtnProceed() {
		if (btnProceed == null) {
			btnProceed = new JButton("Pause");
		}
		return btnProceed;
	}

	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("Cancel");
		}
		return btnCancel;
	}

	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("New radio button for Hello !");
		}
		return rdbtnNewRadioButton;
	}

	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("New radio button Bye !");
		}
		return rdbtnNewRadioButton_1;
	}

	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(new CardLayout(0, 0));
			panel_2.add(getBtnNewButton(), "name_16287753066600");
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(new GridLayout(1, 0, 0, 0));
			panel_3.add(getBtnNewButton_1());
		}
		return panel_3;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("");
			btnNewButton.setIcon(new ImageIcon(AppFenster.class.getResource("/demo/wb/kurs/icons8-ico-48.png")));
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("");
			btnNewButton_1.setIcon(new ImageIcon(AppFenster.class.getResource("/demo/wb/kurs/icons8-ico-64.png")));
		}
		return btnNewButton_1;
	}
}
