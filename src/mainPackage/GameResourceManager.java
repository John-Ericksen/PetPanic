package mainPackage;

import java.util.*;

public  class GameResourceManager 
{
	static Scanner scanner = new Scanner(System.in);
	static boolean isAlive = true;
	
	//numbers representative of your affection points with each of your pets
	static Pet dog = new Pet();
	static Pet cat = new Pet();
	static Pet bird = new Pet();
	static Pet hamster = new Pet();
	static Timer gameClock = new Timer();
	
	
	
	
	static final int TOO_MUCH_AFFECTION = 20;
	static final int TOO_LITTLE_AFFECTION = -1;
	
	public Scanner getScanner()
	{
		return scanner;
	}
	
		
	public static void printAffection()
	{
		System.out.println("Dog: " + dog.getAffection());
		System.out.println("Cat: " + cat.getAffection());
		System.out.println("Bird: " + bird.getAffection());
		System.out.println("Hamster: " + hamster.getAffection());
	}
	
	//method that checks whether the game should end based on affection every second
	public static void checkAffection()
	{
		
		if(dog.getAffection() < TOO_LITTLE_AFFECTION || cat.getAffection() < TOO_LITTLE_AFFECTION || bird.getAffection() < TOO_LITTLE_AFFECTION || hamster.getAffection() < TOO_LITTLE_AFFECTION 
			|| dog.getAffection() > TOO_MUCH_AFFECTION || cat.getAffection() > TOO_MUCH_AFFECTION || bird.getAffection() > TOO_MUCH_AFFECTION || hamster.getAffection() > TOO_MUCH_AFFECTION  )
		{
			System.out.println("Game Over!");
			isAlive = false;
			return;
		}
				
	
	}
	
	
}
