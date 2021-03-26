package com.new_currency;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

// Add panels
public class Gui extends JFrame implements ActionListener {
	/**
	 *  New Currency Converter APP
	 */
	private static final long serialVersionUID = 1L;
	JComboBox<Object> from;
	JComboBox<Object> to;
	
	JTextField inputField;
	JButton btn;
	JLabel result;
	JLabel headerLabel;
	JLabel footerLabel;
	JLabel infoLabel;
	
	ImageIcon file;
	ImageIcon about;
	ImageIcon share;
	ImageIcon logo;
	ImageIcon add;
	ImageIcon exit;
	ImageIcon arrow;
	
	JPanel panelHeader;
	JPanel panelFooter;
	JPanel panelContent;
	JPanel insideContent1;
	JPanel insideContent2;
	JPanel insideContent3;
	
	JMenuBar menuBar;
	JMenu menu1;
	JMenu menu2;
	
	JMenuItem item1;
	JMenuItem item2;
	JMenuItem item3;
	JMenuItem item4;
	
	double ans = 0;

	Gui() {
		
		String aboutMe = "Currency Converter App is fast growing app that can convert currency of any type. Give it a try";
		logo = new ImageIcon("bitcoin.png");
		
		this.setTitle("Currency Converter");
		this.setSize(500, 500);
		this.setLayout(new BorderLayout(0,0));		
		this.setDefaultCloseOperation(3);
		this.setIconImage(logo.getImage());
		
		about = new ImageIcon("about.png");
		share = new ImageIcon("share.png");
		exit = new ImageIcon("exit.png");
		add = new ImageIcon("add.png");
		file = new ImageIcon("doc.png");
		arrow = new ImageIcon("arrow.png");
		
		
		menuBar = new JMenuBar();
		
		// format menubar
		menuBar.setBackground(new Color(0x778899)); // set background color to light slate gray
		
		menu1 = new JMenu("File");
		menu2 = new JMenu("About");
		
		
		menu1.setMnemonic(KeyEvent.VK_F);
		menu2.setMnemonic(KeyEvent.VK_A);
		
		menu1.setForeground(new Color(0x000080));
		menu2.setForeground(new Color(0x000080));
		menu1.setIcon(file);
		menu2.setIcon(about);
		//Doesn't work for me
		
		//Doesn't work for me
		menu2.addActionListener(this);
		
		item1 = new JMenuItem("More Apps..");
		item2 = new JMenuItem("Share");
		item3 = new JMenuItem("Exit");
		item4 = new JMenuItem("About currency Converter");
		
		//Set mnemonics for items
		item1.setMnemonic(KeyEvent.VK_M);
		item2.setMnemonic(KeyEvent.VK_S);
		item3.setMnemonic(KeyEvent.VK_E);
		
		// item icon
		item1.setIcon(add);
		item2.setIcon(share);
		item3.setIcon(exit);
		item4.setIcon(about);
		
		item3.addActionListener(e -> System.exit(1));
		item4.addActionListener(e -> {
			JOptionPane.showMessageDialog(this, aboutMe, "About", JOptionPane.INFORMATION_MESSAGE);
//			System.out.print("About me");
		});
		
		// Add menu items to File menu
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu2.add(item4);
		// Add menus to menu bar
		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.setLayout(new FlowLayout(FlowLayout.LEADING));
		this.setJMenuBar(menuBar);
		
		// the page division
		panelHeader = new JPanel();
		panelFooter = new JPanel();
		panelContent = new JPanel();
		
		//		panelHeader.setPreferredSize(new Dimension(273,50));
		panelHeader.setBackground(Color.gray);
//		panelFooter.setPreferredSize(new Dimension(273,50));
		panelFooter.setBackground(Color.darkGray);
		panelContent.setBackground(new Color(0x008080));
//		panelContent.
		
		// panels inside the panelContent
		insideContent1 = new JPanel();
		insideContent2 = new JPanel();
		insideContent3 = new JPanel();
		
		insideContent1.setBackground(new Color(0xe20B2AA));
		insideContent1.setPreferredSize(new Dimension(180,50));
		insideContent1.setLayout(new FlowLayout());
		
		insideContent2.setBackground(new Color(0x778899));
		insideContent2.setPreferredSize(new Dimension(180,20));
//		insideContent2.setLayout(new FlowLayout());
		
		insideContent3.setBackground(new Color(0x4682B4));
		insideContent3.setPreferredSize(new Dimension(180,100));
		insideContent3.setLayout(new FlowLayout());
		
		// font type aren't working yet. search correct fonts
		headerLabel = new JLabel("Currency Converter Application");
		headerLabel.setFont(new Font("sans serif", Font.BOLD, 30));
		
		footerLabel = new JLabel("Currency Converter @2021");
		footerLabel.setFont(new Font("sans serif", Font.BOLD, 30));
		
		panelHeader.add(headerLabel, BorderLayout.CENTER);
		panelFooter.add(footerLabel, BorderLayout.SOUTH);
		
		Border border = BorderFactory.createBevelBorder(0, Color.green, Color.gray, Color.DARK_GRAY, Color.blue);
		
		String[] from_ = { "FCFA", "USD", "POUND", "UER" };
		String[] to_ = { "USD", "UER", "FCFA", "POUND" };
		
		from = new JComboBox<Object>(from_);
		to = new JComboBox<Object>(to_);
		
		from.setBackground(new Color(0x778899));
		from.setPreferredSize(new Dimension(100,50));
		from.setFont(new Font("sans serif", Font.BOLD, 20));
		
		to.setBackground(new Color(0x778899));
		to.setPreferredSize(new Dimension(100,50));
		to.setFont(new Font("sans serif", Font.BOLD, 20));
		
				
		btn = new JButton("Calculate");
		btn.setPreferredSize(new Dimension(120,50));
		btn.setBorder(border);
		btn.setBackground(new Color(0x2E8B57));
		btn.addActionListener(this);
		btn.setIcon(add); // Icon too big. Search new icon
		add.setDescription("Add sth");
//		btn.setPreferredSize(new Dimension(110,50));
		result = new JLabel("0.0");
		result.setFont(new Font("Mv Boli", Font.BOLD, 30));
		result.setPreferredSize(new Dimension(250,100));
		
		infoLabel = new JLabel("Amount");
		infoLabel.setLayout(new FlowLayout(FlowLayout.LEADING));
//		infoLabel.setPreferredSize(new Dimension(75,50));
//		infoLabel.setBorder(border);
		// formating infoLabel and other labels
		
		infoLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
//
//
		inputField = new JTextField();
		inputField.setLayout(new FlowLayout(FlowLayout.TRAILING));
		inputField.setPreferredSize(new Dimension(100,30));
		inputField.setBorder(border);
//		inputField.setBounds(50, 50, 50, 10);		
//		inputField.setPreferredSize(new Dimension(50, 25));
//		inputField.setHorizontalAlignment(0);
//		inputField.setBorder(border);
//		this.add(from);
//		this.add(to);
//		this.add(inputField);
//		panelContent.add(infoLabel);
	
		insideContent1.add(infoLabel);
		insideContent1.add(inputField);
	
		
		insideContent2.add(from);
		insideContent2.add(to);
		
		insideContent3.add(btn);
		insideContent3.add(result);
		panelContent.setLayout(new BorderLayout());
		panelContent.add(insideContent1, BorderLayout.NORTH);
		panelContent.add(insideContent2, BorderLayout.CENTER);
		panelContent.add(insideContent3, BorderLayout.SOUTH);
		
		
		
		this.add(panelHeader, BorderLayout.NORTH);
		this.add(panelFooter, BorderLayout.SOUTH);
		this.add(panelContent, BorderLayout.CENTER);
		
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Double amount = 0.0;
		try {
			amount = Double.parseDouble(inputField.getText());
			ans = convertNow(amount);
			result.setForeground(new Color(0x0000CD));
		} catch (NumberFormatException numException) {
			numException.printStackTrace();
			amount = 0.0;
			result.setText("Enter a valid number");
			result.setForeground(Color.red);
		}

		if (e.getSource() == btn) {
			if(ans>0)
			result.setText(" '" + ans + "'");
			else result.setText("Enter a valid number");
				
//			System.out.print(from.getSelectedItem());
		}
		
		//Doesn't work for me
		if(e.getSource() == menu2) {
			JOptionPane.showMessageDialog(this, "Currency", "About", JOptionPane.INFORMATION_MESSAGE);
			System.out.print("About me");
		}

	}

	private Double convertNow(Double amount) {
		String val1 = (String) from.getSelectedItem();
		String val2 = (String) to.getSelectedItem();

		double ans = 0.6;

		// From FCFA to other
		if (val1 == "FCFA" && val2 == "USD") {
			ans = amount * 0.00180;
		}
		if (val1 == "FCFA" && val2 == "UER") {
			ans = amount * 0.0015;
		}

		if (val1 == "FCFA" && val2 == "FCFA") {
			ans = amount;
		}

		if (val1 == "FCFA" && val2 == "POUND") {
			ans = amount * 0.0013;
		}

		// From USD to other
		if (val1 == "USD" && val2 == "USD") {
			ans = amount;
		}
		if (val1 == "USD" && val2 == "FCFA") {
			ans = amount * 550.21;
		}

		if (val1 == "USD" && val2 == "UER") {
			ans = amount * 0.84;
		}

		if (val1 == "USD" && val2 == "POUND") {
			ans = amount * 0.72;
		}

		// From POUND to other
		if (val1 == "POUND" && val2 == "POUND") {
			ans = amount;
		}
		if (val1 == "POUND" && val2 == "FCFA") {
			ans = amount * 761.54;
		}

		if (val1 == "POUND" && val2 == "USD") {
			ans = amount * 0.84;
		}

		if (val1 == "POUND" && val2 == "UER") {
			ans = amount * 1.16;
		}
		// From UER to other
		if (val1 == "UER" && val2 == "UER") {
			ans = amount;
		}
		if (val1 == "UER" && val2 == "FCFA") {
			ans = amount * 654.36;
		}

		if (val1 == "UER" && val2 == "USD") {
			ans = amount * 1.19;
		}

		if (val1 == "UER" && val2 == "POUND") {
			ans = amount * 0.86;
		}
		return ans;
	}
}
