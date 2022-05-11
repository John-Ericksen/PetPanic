package mainPackage;
import java.util.*;

public class EventCardStorage 
{
	public static ArrayList<EventCard> unusedCards = new ArrayList<EventCard>();
	
	public static ArrayList<EventCard> usedCards = new ArrayList<EventCard>();
	
	public static void initialize()
	{
		for(int i = 0; i < textStorage.length; i++)
		{
			unusedCards.add(new EventCard(textStorage[i], valueChanges[i]));
		}
		
	}
	
	
	static String[] textStorage ={new String("Dog: Cat keeps sleeping in my bed! when i ask her to move, she scratches at me! can you puhLEEAAAse tell her to stop it?"),
                                  new String("Bird: Hamster is looking mighty appetizing these days... can you maybe pick up some mice for me to snack on the next time you go out?"),
                                  new String("Cat: Dog is such a baby! I accidently ripped up us chew toy, and he got really mad at me! I don't want apologize, it was an accident! Should I?")};
  static int[][] valueChanges = {{200, -2, 0, 0, -3, 5, 0, 0},
                                  {0, 0, 5, -3, 0, 0, -2, 2 },
                                  {5, -1, 0, 0, -6, 1, 0, 1}};
 
  public static String tutorialString = new String("Welcome to Pet Panic, a game where you manage a pet shop! " +
    "In your shop, 4 factions are vying for dominance over your affection and the love of customers." +
    "It is your responsibility as the owner to manage the requests of each factions representative, and make sure all of them feel equally" +
    "appreciated. Make sure they aren't neglected or favored too heavily, or a catastrophic end awaits you!");

	

}
