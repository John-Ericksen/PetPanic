package mainPackage;
import java.util.*;

public class GameCalander 
{
	public GameCalander()
	{
	
	}

	public void startGame(int month)
	{	
		System.out.println("Month " + month);
		System.out.println("");
		GameResourceManager.printAffection();
		while(GameResourceManager.isAlive == true && EventCardStorage.unusedCards.size() > 1 )
		{
			int cardIndex = (int)(Math.random() * EventCardStorage.unusedCards.size());
			System.out.println("");
			
			EventCardStorage.unusedCards.get(cardIndex).displayCard();
			EventCardStorage.unusedCards.get(cardIndex).setBeenPicked(true);
			EventCard temp = EventCardStorage.unusedCards.remove(cardIndex);
			EventCardStorage.usedCards.add(temp);
			GameResourceManager.printAffection();
			GameResourceManager.checkAffection();
			
		}
		if(GameResourceManager.isAlive == true)
		{
			EventCardStorage.unusedCards.get(0).displayCard();
		}
	
	
		
	}
	


}
