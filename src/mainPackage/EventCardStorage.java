package mainPackage;
import java.util.*;

public class EventCardStorage 
{
	public static ArrayList<EventCard> unusedCards = new ArrayList<EventCard>();
	
	public static ArrayList<EventCard> usedCards = new ArrayList<EventCard>();
	
	public static void initialize()
	{
		for(int i = 0; i < CardInfoStorage.textStorage.length; i++)
		{
			unusedCards.add(new EventCard(CardInfoStorage.textStorage[i], CardInfoStorage.valueChanges[i]));
		}
		
	}
	

	
}
