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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class TutorialWindow extends JFrame {

	private JPanel contentPane;
	private JButton playButton;
	private JButton quitButton;
	private JLabel spacer;
	private JPanel middlePanel;
	private JLabel tutorialText;
	private Color buttonColor;
	private Color backroundColor;

	/**
	 * Create the frame.
	 */
	public TutorialWindow()
	{
		buttonColor = new Color(249, 158, 234);
		backroundColor = new Color(126, 178, 245);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1303, 767);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(backroundColor);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel tutorialTitle = new JLabel("Pet Panic!");
		tutorialTitle.setBackground(backroundColor);
		tutorialTitle.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 54));
		tutorialTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(tutorialTitle, BorderLayout.NORTH);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(backroundColor);
		contentPane.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
	
		quitButton = new JButton("Quit game");
		quitButton.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		quitButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		quitButton.setBackground(buttonColor);;
		bottomPanel.add(quitButton);
		
		spacer = new JLabel("");
		bottomPanel.add(spacer);
		
		playButton = new JButton("Start Game");
		playButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		playButton.setBackground(buttonColor);
		bottomPanel.add(playButton);
		
		
		middlePanel = new JPanel();
		middlePanel.setBackground(backroundColor);
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
