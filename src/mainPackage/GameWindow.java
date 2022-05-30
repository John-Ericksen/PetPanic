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
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.Icon;
import javax.swing.BoxLayout;

public class GameWindow extends JFrame 
{

	private JPanel contentPane;
	private JButton playButton;
	private JButton quitButton;
	private JLabel spacer;
	private Color buttonColor;
	private Color backroundColor;
	private JPanel topFrame;
	private JLabel placeholder;
	private JLabel placeholder2;
	private JLabel hamsterAffection;
	private JLabel birdAffection;
	private JLabel catAffection;
	private JLabel dogAffection;
	private JPanel midPanel;
	private JLabel petImage;
	private JLabel eventText;
	private JLabel spacer1;

	/**
	 * Create the frame.
	 */
	public GameWindow()
	{

		buttonColor = new Color(249, 158, 234);
		backroundColor = new Color(126, 178, 245);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 2571, 1408);
		contentPane = new JPanel();
		contentPane.setSize(1920, 1080);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(backroundColor);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(backroundColor);
		contentPane.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(backroundColor);
		contentPane.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(new GridLayout(0, 4, 0, 0));
		
		dogAffection = new JLabel("Dogs: 0");
		dogAffection.setFont(new Font("Tahoma", Font.PLAIN, 26));
		dogAffection.setHorizontalAlignment(SwingConstants.CENTER);
		topPanel.add(dogAffection);
		
		catAffection = new JLabel("Cats: 0");
		catAffection.setFont(new Font("Tahoma", Font.PLAIN, 26));
		catAffection.setHorizontalAlignment(SwingConstants.CENTER);
		topPanel.add(catAffection);
		
		hamsterAffection = new JLabel("Hamsters: 0");
		hamsterAffection.setFont(new Font("Tahoma", Font.PLAIN, 26));
		hamsterAffection.setHorizontalAlignment(SwingConstants.CENTER);
		topPanel.add(hamsterAffection);
		
		birdAffection = new JLabel("Birds: 0");
		birdAffection.setFont(new Font("Tahoma", Font.PLAIN, 26));
		birdAffection.setHorizontalAlignment(SwingConstants.CENTER);
		topPanel.add(birdAffection);
		
		
		quitButton = new JButton("Quit game");
		quitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		quitButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		quitButton.setBackground(buttonColor);
		;
		bottomPanel.add(quitButton);

		spacer = new JLabel("");
		bottomPanel.add(spacer);

		playButton = new JButton("Start Game");
		playButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		playButton.setBackground(buttonColor);
		bottomPanel.add(playButton);
		
		midPanel = new JPanel();
		midPanel.setBackground(backroundColor);
		contentPane.add(midPanel, BorderLayout.CENTER);
		midPanel.setLayout(new GridLayout(3, 1, 0, 0));
		
		petImage = new JLabel("Image");
		petImage.setHorizontalAlignment(SwingConstants.CENTER);
		petImage.setVerticalAlignment(SwingConstants.TOP);
		midPanel.add(petImage);
		
		JLabel eventText = new JLabel("New Event");
		eventText.setHorizontalAlignment(SwingConstants.CENTER);
		midPanel.add(eventText);
		
		spacer1 = new JLabel("");
		bottomPanel.add(spacer1);
		
	   this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		 setVisible(true);
	}

}
