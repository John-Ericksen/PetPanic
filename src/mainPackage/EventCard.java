//Issue in this class. When a card is initialized, the integers in value change are stopped correctly. 
//however, when the values are accessed from the action event, they always read as 0.

package mainPackage;
import java.util.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventCard implements ActionListener {
	private String text;
	private ImageIcon portrait; // determines which animal portrait is displayed
	private int[] valueChanges;  // first four are activated for yes, next four

	//generates an event card, and stores values.
	public EventCard(String t, int[] values, ImageIcon p)
	{
		valueChanges = new int[8];
		
		System.out.println(Arrays.toString(valueChanges));
		
		text = t;
		portrait = p;
		
		//here, I believe the values are stored fine.
		for (int i = 0; i < values.length; i++)
		{
			valueChanges[i]= values[i];
		}
		
		System.out.println("");
		System.out.println(Arrays.toString(valueChanges));
		
		//remove previous action listeners
		ActionListener[] actionListners = GameWindow.getYesButton().getActionListeners();
		for(int i = 0; i < actionListners.length; i++)
		{
			GameWindow.getYesButton().removeActionListener(actionListners[i]);
		}
		actionListners = GameWindow.getNoButton().getActionListeners();
		for(int i = 0; i < actionListners.length; i++)
		{
			GameWindow.getYesButton().removeActionListener(actionListners[i]);
		}
		
		GameWindow.getYesButton().addActionListener(this);
		GameWindow.getYesButton().setActionCommand("yes");
		
		GameWindow.getNoButton().addActionListener(this);
		GameWindow.getNoButton().setActionCommand("no");
		
	}
	
	//for an action listener
	public EventCard()
	{
		text = "listner";
		portrait = null;
		valueChanges = null;
	}

	public String getText()
	{
		return text;
	}

	public ImageIcon getPortrait()
	{
		return portrait;
	}

	//checks to see if you have accepted or rejected the event proposal, 
	//and adjusts affection values accordingly. also updates jlabels to reflect new values.
	public void actionPerformed(ActionEvent evt)
	{
		//if yes
		if (evt.getActionCommand().equals("yes"))
		{
			
		    //here is the issue. at this point, any attempts to get integers from the valueChanges array 
			//result in 0. to see the output in console, press a button.
			System.out.println("");
			System.out.println(Arrays.toString(valueChanges));
			
			
			GameLogic.dog.changeAffection(valueChanges[0]);
			GameLogic.cat.changeAffection(valueChanges[1]);
			GameLogic.bird.changeAffection(valueChanges[2]);
			

			w.getDogAffectionJLabel().setText("Dogs: " + GameLogic.dog.getAffection());
			GameWindow.getCatAffectionJLabel().setText("Cats: " + GameLogic.cat.getAffection());
			GameWindow.getBirdAffectionJLabel().setText("Birds: " + GameLogic.bird.getAffection());

			GameLogic.pullCard(); //pulls the next card. disabled while testing.

		}
		
		//if no
		else
		{
			//here is the issue. at this point, any attempts to get integers from the valueChanges array 
			//result in 0. to see the output in console, press a button.
			System.out.println("");
			System.out.println(Arrays.toString(valueChanges));
			
		    
		
			GameLogic.dog.changeAffection(valueChanges[3]);
			GameLogic.cat.changeAffection(valueChanges[4]);
			GameLogic.bird.changeAffection(valueChanges[5]);
			

			GameWindow.getDogAffectionJLabel().setText("Dogs: " + GameLogic.dog.getAffection());
			GameWindow.getCatAffectionJLabel().setText("Cats: " + GameLogic.cat.getAffection());
			GameWindow.getBirdAffectionJLabel().setText("Birds: " + GameLogic.bird.getAffection());
			
			GameLogic.pullCard(); //pulls the next card. disabled while testing.
			
			
		}
		
	}

}
