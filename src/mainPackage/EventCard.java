package mainPackage;
import java.util.*;

public class EventCard 
{
	private boolean beenPicked = false;
	private String text;
	private Pet[] pets = {GameResourceManager.dog, GameResourceManager.cat, GameResourceManager.bird, GameResourceManager.hamster};
	
	private int[] affectionchanges = new int[8]; //first four are activated for first option, next four for second option
	Scanner scanner = GameResourceManager.scanner;
	
	public EventCard(String t, int[] values)
	{
		text = t;
		int i = 0;
		for(int x : values)
		{
			affectionchanges[i] = x;
			i++;
		}
	}
	public boolean getBeenPicked()
	{
		return beenPicked;
	}
	public void setBeenPicked(boolean bool)
	{
		beenPicked = bool;
	}
	
	public void displayCard()
	{
		System.out.println(text);
		String decision = getDecision();
		if(decision == "y")
		{
			adjustAffection(affectionchanges[0], affectionchanges[1], affectionchanges[2], affectionchanges[3]);
		
		}
		else 
		{
			adjustAffection(affectionchanges[4], affectionchanges[5], affectionchanges[6], affectionchanges[7]);
			
		}
		
		
	}
	
	private String getDecision()
	{
		String inputString = scanner.nextLine();
		inputString = inputString.toLowerCase();
		
		if(inputString.equals("no")|| inputString.equals("nah")|| inputString.equals("nope") || inputString.equals("n"))
		{
			return "n";
			
		}
		
		if(inputString.equals("yes") || inputString.equals("yea")|| inputString.equals("ok") || inputString.equals("alright")|| inputString.equals("y")) 
		{
			return "y";
		}
		
		System.out.println("Invalid response! Please respond with y(yes) or n(no)!");
		return getDecision();
			
		
		
	}
	
	private void adjustAffection(int dogChange, int catChange, int birdChange, int hamsterChange)
	{
		pets[0].changeAffection(dogChange);
		pets[1].changeAffection(catChange);
		pets[2].changeAffection(birdChange);
		pets[3].changeAffection(hamsterChange);
	}
	
	
	
	
}
