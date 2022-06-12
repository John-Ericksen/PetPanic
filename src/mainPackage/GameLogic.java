package mainPackage;

//Class that handles the way the game runs.includes 
//a method to check if you have failed the game, a method that starts the game by picking a random event card and displaying its data,
//and a method that displays a new event card while moving the old one to the "used" pile. Also stores four static pet objects.

public class GameLogic
{
	static Pet dog; 
	static Pet cat; 
	static Pet bird;
	static Pet hamster; 

	//values for failing the game
	static final int TOO_MUCH_AFFECTION = 99;
	static final int TOO_LITTLE_AFFECTION = 1;
	
	public GameLogic()
	{
	}
	
	//checks to see if you have failed
	public static boolean checkAffection()
	{
		
		Window.getDogAffectionJLabel().setText("Dogs: " + dog.getAffection());
		Window.getCatAffectionJLabel().setText("Cats: " + cat.getAffection());
		Window.getBirdAffectionJLabel().setText("Birds: " + bird.getAffection());
		
		
		if(dog.getAffection() < TOO_LITTLE_AFFECTION || cat.getAffection() < TOO_LITTLE_AFFECTION || bird.getAffection() < TOO_LITTLE_AFFECTION  
			|| dog.getAffection() > TOO_MUCH_AFFECTION || cat.getAffection() > TOO_MUCH_AFFECTION || bird.getAffection() > TOO_MUCH_AFFECTION)
		{
			return false;
			//ProgramRunner.getWindow().makeLoseWindow();
		}
		else return true;
		
		
				
	}
	
//method displays the information of a randomly chosen card from among all unchosen cards. also checks to see if the player has failed.
	public static void pullCard()
	{
		if(EventCardStorage.unusedCards.size() >= 1 && checkAffection() == true)
		{
			int cardIndex = (int)(Math.random() * EventCardStorage.unusedCards.size());
			EventCard currentCard = EventCardStorage.unusedCards.remove(cardIndex);
			currentCard.changeActionListners();
			Window.setTextField(currentCard.getText());
			Window.setPetImage(currentCard.getPortrait());
			EventCardStorage.usedCards.add(currentCard);
			
		}
		else if(EventCardStorage.unusedCards.size() >= 1 && checkAffection() == false)
		{
			ProgramRunner.getWindow().makeLoseWindow();
		}
		else if(EventCardStorage.unusedCards.size() < 1 && checkAffection() == false)
		{
			ProgramRunner.getWindow().makeLoseWindow();
		}
		else 
		{
			ProgramRunner.getWindow().makeWinWindow();
		}
		
	}
	
	
	
}
	

