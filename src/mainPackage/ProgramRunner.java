package mainPackage;

import javax.swing.ImageIcon;
import java.awt.Image;


//runs the program. also has some misc methods.
public class ProgramRunner
{
	private static ImageIcon dogPortrait;
	private static  ImageIcon catPortrait;
	private static ImageIcon birdPortrait;
	private static Window window;

	
	public ProgramRunner()
	{}


	//initializes portraits, scales them to the necessary size
	public static void initializeScaledPortraits()
	{
	
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
	
	public static Window getWindow()
	{
		return window;
	}
	
	public static void initializePets()
	{
		GameLogic.dog = new Pet();
		GameLogic.cat = new Pet();
		GameLogic.bird = new Pet();
	}

	//Run the game
	public static void main(String[] args) 
	{
		initializePets();
		window = new Window("tutorial");
		 
	}
	
}
	




