package mainPackage;
import java.util.*;
import javax.swing.ImageIcon;

//exists to store large amounts of raw data, and organizes them into event cards to be displayed on screen.
public class EventCardStorage 
{
	public static ArrayList<EventCard> unusedCards;
	public static ArrayList<EventCard> usedCards;
	
	private static ImageIcon dogPortrait = ProgramRunner.getDogPortrait();
	private static ImageIcon catPortrait = ProgramRunner.getCatPortrait();
	private static ImageIcon birdPortrait = ProgramRunner.getBirdPortrait();
	
	
	//stores the text describing each event
	static String[] textStorage ={"Dog: Cat keeps sleeping in my bed! when I ask her to move, she scratches at me! can you puhLEEAAAse tell her to stop it?",
      "Bird: Dog is looking mighty appetizing these days... can you maybe pick up some mice for me to snack on the next time you go out?",
      "Cat: Dog is such a baby! I accidentally ripped up his chew toy, and he got really mad at me! I don't want to apologize, it was an accident! Should I?",
	  "Dog: I saw a really nice bone in the store window during our walk today! Maybe we could buy it?", 
	  "Bird: That premium seed mix you bought was so good! I know its a little expensive, but can you buy some more for me?",
	  "Cat: My climbing tower is simply not high enough. I don't project my royal status as far as I would like! Can you make it bigger?",
	  "Dog: Bird keeps making a ton of noise at night. Every morning his squawking interrupts my sleep. Please do something about it!",
	  "Bird: I want to bite your finger. Let me bite your finger. I want to draw blood.",
	  "Cat: That gucci armani collaboration collar is the talk of the town. If you sell the house, you could probably buyit for me! You know what you have to do, right?"
	 };
	
	//stores the changes in affection for each decision. first four values for yes, next four for no
  static int[][] valueChanges = {{20, -20, 0, -20, 30, 0},
      {-30, 0, 20, 1, 0, -20,},
      {20, -10, 0, -20, 10, 0,},
      {20, 0, 0, -10, 0, 0},
      {-2, -2, 20, 0, 0, -15},
      {-10, 20, -10, 0, -5, 0},
      {20, 0, -10, -35, -10, 10},
      {-50, -50, 40, 10, 10, 10 },
      {-50, 100, -50, 0, 0, 0,}};
  
  	
  
  //stores which portrait is displayed with each card
   static ImageIcon[] portraits = {dogPortrait, birdPortrait, catPortrait, dogPortrait, birdPortrait, catPortrait, dogPortrait, birdPortrait, catPortrait};


   //takes the raw data from the areas, and arranges them into eventCard objects for organization and easy access.
	public static void initialize()
	{
		unusedCards  = new ArrayList<EventCard>();
		usedCards  = new ArrayList<EventCard>();
		
		unusedCards.clear();
		usedCards.clear();
		
		for(int i = 0; i < textStorage.length; i++)
		{
			unusedCards.add(new EventCard(textStorage[i], valueChanges[i], portraits[i]));
		}
		
	}
	
	
	
	
	

}
