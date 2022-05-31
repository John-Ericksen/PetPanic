package mainPackage;
import java.util.*;
import javax.swing.ImageIcon;

//exists to store large amounts of raw data, and convert them into event cards to be displayed on screen.
public class EventCardStorage 
{
	public static ArrayList<EventCard> unusedCards = new ArrayList<EventCard>();
	public static ArrayList<EventCard> usedCards = new ArrayList<EventCard>();
	
	private static ImageIcon dogPortrait = GameWindow.getDogPortrait();
	private static ImageIcon catPortrait = GameWindow.getCatPortrait();
	private static ImageIcon birdPortrait = GameWindow.getBirdPortrait();
	//private static ImageIcon hamsterPortrait;
	
	//stores the text describing each event
	static String[] textStorage ={new String("Dog: Cat keeps sleeping in my bed! when i ask her to move, she scratches at me! can you puhLEEAAAse tell her to stop it?"),
      new String("Bird: Hamster is looking mighty appetizing these days... can you maybe pick up some mice for me to snack on the next time you go out?"),
      new String("Cat: Dog is such a baby! I accidently ripped up us chew toy, and he got really mad at me! I don't want apologize, it was an accident! Should I?")};
	
	//stores the changes in affection for each decision. first four values for yes, next four for no
  static int[][] valueChanges = {{200, -2, 0, 0, -3, 5, 0, 0},
      {0, 0, 5, -3, 0, 0, -2, 2 },
      {5, -1, 0, 0, -6, 1, 0, 1}};
  
  //stores which portrait is displayed with each card
   static ImageIcon[] portraits = {dogPortrait, birdPortrait, catPortrait};


   //takes the raw data from the areas, and arranges them into eventCrad objects for organization and easy access.
	public static void initialize()
	{
		//using the final card as a testing card
		unusedCards.add(new EventCard(textStorage[2], valueChanges[2], portraits[2]));
		
		//this would initialize all cards, but is inactive due to testing.
//		for(int i = 0; i < textStorage.length; i++)
//		{
//			unusedCards.add(new EventCard(textStorage[i], valueChanges[i], portraits[i]));
//		}
	}
	
	
	
	
	

}
