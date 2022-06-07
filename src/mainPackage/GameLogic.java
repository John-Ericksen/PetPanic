package mainPackage;

//Class that handles the way the game runs.includes 
//a method to check if you have failed the game, a method that starts the game by picking a random event card and displaying its data,
//and a method that displays a new event card while moving the old one to the "used" pile. Also stores four static pet objects.

public class GameLogic
{
	//is the player still alive
	static boolean isAlive = true;
	
	static Pet dog; 
	static Pet cat; 
	static Pet bird;
	static Pet hamster; 

	//values for failing the game
	static final int TOO_MUCH_AFFECTION = 99;
	static final int TOO_LITTLE_AFFECTION = 1;
	
	//values to store the currently picked card, and last picked card
	private static int currentIndex;
	private static int lastIndex;
	
	public GameLogic()
	{
	}
	
	//checks to see if you have failed
	public static void checkAffection()
	{
		
		GameWindow.getDogAffectionJLabel().setText("Dogs: " + dog.getAffection());
		GameWindow.getCatAffectionJLabel().setText("Cats: " + cat.getAffection());
		GameWindow.getBirdAffectionJLabel().setText("Birds: " + bird.getAffection());
		
		
		if(dog.getAffection() < TOO_LITTLE_AFFECTION || cat.getAffection() < TOO_LITTLE_AFFECTION || bird.getAffection() < TOO_LITTLE_AFFECTION  
			|| dog.getAffection() > TOO_MUCH_AFFECTION || cat.getAffection() > TOO_MUCH_AFFECTION || bird.getAffection() > TOO_MUCH_AFFECTION)
		{
			isAlive = false;
			GameWindow.setTextField("Game Over!");
		}
				
	}
	
//method displays the information of a randomly chosen card from among all unchosen cards. also checks to see if the player has failed.
	public static void pullCard()
	{
		if(isAlive == true && EventCardStorage.unusedCards.size() >= 1)
		{
			int cardIndex = (int)(Math.random() * EventCardStorage.unusedCards.size());
			EventCard currentCard = EventCardStorage.unusedCards.remove(cardIndex);
			GameWindow.setTextField(currentCard.getText());
			GameWindow.setPetImage(currentCard.getPortrait());
			EventCardStorage.usedCards.add(currentCard);
			checkAffection();
			//printAffection();
			
		}
		else 
		{
				GameWindow.setTextField("Game Over!");
		}
		
	}
	
	
	
}
	

