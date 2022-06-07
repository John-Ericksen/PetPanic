package mainPackage;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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

//creates a window that showcases the tutorial. called before the game starts. might be deleted in favour of a readme if it becomes a hassle.
public class LoseWindow extends JFrame {

	private JPanel contentPane;
	private JButton playButton;
	private JButton quitButton;
	private JLabel spacer;
	private JPanel middlePanel;
	private JTextArea tutorialText;
	private Color buttonColor;
	private Color backroundColor;

	/**
	 * Create the frame.
	 */
	public LoseWindow()
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
		playButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GameWindow.initializeScaledPortraits();
				GameWindow window = new GameWindow();
				dispose();
				EventCardStorage.initialize();
				GameLogic.checkAffection();
				GameLogic.pullCard();
				
			}
		});
		bottomPanel.add(playButton);
		
		
		middlePanel = new JPanel();
		middlePanel.setBackground(backroundColor);
		contentPane.add(middlePanel, BorderLayout.CENTER);
		middlePanel.setLayout(new BorderLayout(0, 0));
		
		tutorialText = new JTextArea();
		tutorialText.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tutorialText.setEditable(false);
		tutorialText.setLineWrap(true);
		tutorialText.setWrapStyleWord(true);
		tutorialText.setBackground(backroundColor);
		tutorialText.setText("Welcome to Pet Panic, a game where you manage a pet shop!"
				+ "In your shop, four factions are vying for dominance over your affection and the love of customers. It is your responsibility as the owner to manage the requests of each factions representative, and make sure all of them feel equally appreciated. Make sure they aren't neglected or favored too heavily, or a catastrophic end awaits you!"
				);
		middlePanel.add(tutorialText);
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		 setVisible(true);
	}

}
