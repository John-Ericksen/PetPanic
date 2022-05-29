package mainPackage;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Font;

public class GameWindow extends JFrame {

	private JPanel contentPane;
	private JButton playButton;
	private JButton titleButton;
	private JLabel spacer;
	private JPanel middlePanel;
	private JLabel tutorialText;

	/**
	 * Create the frame.
	 */
	public GameWindow()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1808, 1010);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(126, 178, 245));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel tutorialTitle = new JLabel("Pet Panic!");
		tutorialTitle.setBackground(new Color(126, 178, 245));
		tutorialTitle.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 54));
		tutorialTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(tutorialTitle, BorderLayout.NORTH);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(new Color(126, 178, 245));
		contentPane.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
	
		
		titleButton = new JButton("Quit game");
		titleButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		titleButton.setBackground(new Color(249, 158, 234));;
		bottomPanel.add(titleButton);
		
		spacer = new JLabel("");
		bottomPanel.add(spacer);
		
		playButton = new JButton("Start Game");
		playButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		playButton.setBackground(new Color(249, 158, 234));
		bottomPanel.add(playButton);
		
		
		middlePanel = new JPanel();
		middlePanel.setBackground(new Color(126, 178, 245));
		contentPane.add(middlePanel, BorderLayout.CENTER);
		middlePanel.setLayout(new BorderLayout(0, 0));
		
		//create an image icon, resized for button
		ImageIcon titleText = new ImageIcon("C:\\Java Projects\\Pet Panic\\Assets\\Title Textbox.png");
		Image im = titleText.getImage();
		Image newim = im.getScaledInstance(1500, 1500, java.awt.Image.SCALE_SMOOTH);
		titleText = new ImageIcon(newim);

		tutorialText = new JLabel(titleText);
		tutorialText.setHorizontalAlignment(SwingConstants.CENTER);
		middlePanel.add(tutorialText, BorderLayout.CENTER);
		setVisible(true);
	}

}
