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
import java.awt.Font;

//creates the window for the main loop of the game. also initializes values and starts the game down in main
public class GameWindow extends JFrame 
{
	private static ImageIcon dogPortrait;
	private static  ImageIcon catPortrait;
	private static ImageIcon birdPortrait;
	//private static ImageIcon hamsterPortrait;
	private static EventCard listner = new EventCard();
	private static JPanel contentPane;
	private static JButton yesButton;
	private static JButton noButton;
	private JLabel spacer;
	private Color buttonColor;
	private Color backroundColor;
	private static JLabel affectionJLabel;
	private static JLabel birdAffection;
	private static JLabel catAffection;
	private static JLabel dogAffection;
	private static JPanel midPanel;
	private static JLabel petImage;
	private static JTextArea eventText;
	private  JLabel spacer1;

	//creates the window and UI
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
		
		affectionJLabel = new JLabel("Affection Amounts: ");
		affectionJLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		affectionJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		topPanel.add(affectionJLabel);
		
		dogAffection = new JLabel("Dogs: 0");
		dogAffection.setFont(new Font("Tahoma", Font.PLAIN, 26));
		dogAffection.setHorizontalAlignment(SwingConstants.CENTER);
		topPanel.add(dogAffection);
		
		catAffection = new JLabel("Cats: 0");
		catAffection.setFont(new Font("Tahoma", Font.PLAIN, 26));
		catAffection.setHorizontalAlignment(SwingConstants.CENTER);
		topPanel.add(catAffection);
		
		
		
		birdAffection = new JLabel("Birds: 0");
		birdAffection.setFont(new Font("Tahoma", Font.PLAIN, 26));
		birdAffection.setHorizontalAlignment(SwingConstants.CENTER);
		topPanel.add(birdAffection);
		
		
		noButton = new JButton("No");
		noButton.setFont(new Font("Tahoma", Font.PLAIN, 50));
		noButton.setBackground(buttonColor);
		noButton.addActionListener(listner);
		noButton.setActionCommand("No");
		bottomPanel.add(noButton);

		spacer = new JLabel("");
		bottomPanel.add(spacer);

		yesButton = new JButton("Yes");
		yesButton.setFont(new Font("Tahoma", Font.PLAIN, 50));
		yesButton.setBackground(buttonColor);
		yesButton.addActionListener(listner);
		yesButton.setActionCommand("yes");
		bottomPanel.add(yesButton);
		
		midPanel = new JPanel();
		midPanel.setBackground(backroundColor);
		contentPane.add(midPanel, BorderLayout.CENTER);
		midPanel.setLayout(new GridLayout(3, 1, 0, 0));
		

		ImageIcon dogImg = new ImageIcon("C:\\Java Projects\\Pet Panic\\Assets\\Dog.png");
		Image im2 = dogImg.getImage();
		Image newim2 = im2.getScaledInstance(100, 190, java.awt.Image.SCALE_SMOOTH);
		dogImg = new ImageIcon(newim2);
		dogPortrait = dogImg;
		
		petImage = new JLabel(dogImg);
		petImage.setHorizontalAlignment(SwingConstants.CENTER);
		petImage.setVerticalAlignment(SwingConstants.TOP);
		midPanel.add(petImage);
		
		eventText = new JTextArea("New Event");
		eventText.setFont(new Font("Tahoma", Font.PLAIN, 30));
		eventText.setEditable(false);
		eventText.setLineWrap(true);
		eventText.setWrapStyleWord(true);
		eventText.setBackground(backroundColor);
		midPanel.add(eventText);
		
		spacer1 = new JLabel("");
		bottomPanel.add(spacer1);
		
	   this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		 setVisible(true);
	}
	
	public static void setTextField(String text)
	{
		eventText.setText(text);
	}
	
	public static void setPetImage(ImageIcon image)
	{
		petImage.setIcon(image);
	}

	//initializes portraits, scales them to the necessary size
	public static void initializeScaledPortraits()
	{
	//create an image icon, resized for button
			ImageIcon catImg = new ImageIcon("C:\\Java Projects\\Pet Panic\\Assets\\Cat.png");
			Image im = catImg.getImage();
			Image newim = im.getScaledInstance(300, 270, java.awt.Image.SCALE_SMOOTH);
			catImg = new ImageIcon(newim);
			catPortrait = catImg;
			
			ImageIcon dogImg = new ImageIcon("C:\\Java Projects\\Pet Panic\\Assets\\Dog.png");
			Image im2 = dogImg.getImage();
			Image newim2 = im2.getScaledInstance(100, 90, java.awt.Image.SCALE_SMOOTH);
			dogImg = new ImageIcon(newim2);
			dogPortrait = dogImg;
			
			ImageIcon birdImg = new ImageIcon("C:\\Java Projects\\Pet Panic\\Assets\\Bird.png");
			Image im3 = birdImg.getImage();
			Image newim3 = im3.getScaledInstance(300, 270, java.awt.Image.SCALE_SMOOTH);
			birdImg = new ImageIcon(newim3);
			birdPortrait = birdImg;
	}
	
	public static ImageIcon getCatPortrait()
	{
		return catPortrait;
	}
	public static ImageIcon getDogPortrait()
	{
		return dogPortrait;
	}
	public static ImageIcon getBirdPortrait()
	{
		return birdPortrait;
	}
	
	
	public static JLabel getCatAffectionJLabel()
	{
		return catAffection;
	}
	public static JLabel getDogAffectionJLabel()
	{
		return dogAffection;
	}
	public static JLabel getBirdAffectionJLabel()
	{
		return birdAffection;
	}
	
	public static JButton getYesButton()
	{
		return yesButton;
	}
	public static JButton getNoButton()
	{
		return noButton;
	}
	
	
	//Run the game
	public static void main(String[] args) 
	{
		GameLogic.dog = new Pet();
		GameLogic.cat = new Pet();
		GameLogic.bird = new Pet();
		
		//make a tutorial window here, turn the below code into an action event for tutorial window button
		
		initializeScaledPortraits();
		GameWindow window = new GameWindow();
		EventCardStorage.initialize();
		GameLogic.checkAffection();
		GameLogic.pullCard();
		 
	}

}



