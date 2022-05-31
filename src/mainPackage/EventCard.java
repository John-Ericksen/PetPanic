//Issue in this class. When a card is initialized, the integers in value change are stopped correctly. however, when the values are accessed from the action event, they always read as 0.

package mainPackage;
import java.util.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventCard implements ActionListener {
	private String text;
	private ImageIcon portrait; // determines which animal portrait is displayed
	private int[] valueChanges = new int[8]; // first four are activated for yes, next four

	//generates an event card, and stores values.
	public EventCard(String t, int[] values, ImageIcon p)
	{
		text = t;
		portrait = p;
		
		//here, I believe the values are stored fine.
		for (int i = 0; i < values.length; i++)
		{
			valueChanges[i]= values[i];
		}
		
		for (int x = 0; x < values.length; x++)
		{
			System.out.println(valueChanges[x]);
		}
	}

	public String getText()
	{
		return text;
	}

	public ImageIcon getPortrait()
	{
		return portrait;
	}

	//checks to see if you have accepted or rejected the event proposal, and adjusts affection values accordingly. also updates jlabels to reflect new values.
	public void actionPerformed(ActionEvent evt)
	{
		//if yes
		if (evt.getActionCommand().equals("yes"))
		{
			System.out.println("");
			
		 //here is the issue. at this point, any attempts to get integers from the valueChanges array result in 0. to see the output in console, press a button.
			for (int x = 0; x < valueChanges.length; x++)
			{
				System.out.println(valueChanges[x]);
			}
			
			
			GameLogic.dog.changeAffection(valueChanges[0]);
			GameLogic.cat.changeAffection(valueChanges[1]);
			GameLogic.bird.changeAffection(valueChanges[2]);
			GameLogic.hamster.changeAffection(valueChanges[3]);

			GameWindow.getDogAffectionJLabel().setText("Dogs: " + GameLogic.dog.getAffection());
			GameWindow.getCatAffectionJLabel().setText("Cats: " + GameLogic.cat.getAffection());
			GameWindow.getBirdAffectionJLabel().setText("Birds: " + GameLogic.bird.getAffection());
			GameWindow.getHasmterAffectionJLabel().setText("Cats: " + GameLogic.hamster.getAffection());

			// GameLogic.pullCard(); //pulls the next card. disabled while testing.

		}
		
		//if no
		else
		{
			System.out.println("");
			
		 //here is the issue. at this point, any attempts to get integers from the valueChanges array result in 0. to see the output in console, press a button.
			for (int x = 0; x < valueChanges.length; x++)
			{
				System.out.println(valueChanges[x]);
			}
		
			GameLogic.dog.changeAffection(valueChanges[4]);
			GameLogic.cat.changeAffection(valueChanges[5]);
			GameLogic.bird.changeAffection(valueChanges[6]);
			GameLogic.hamster.changeAffection(valueChanges[7]);

			GameWindow.getDogAffectionJLabel().setText("Dogs: " + GameLogic.dog.getAffection());
			GameWindow.getCatAffectionJLabel().setText("Cats: " + GameLogic.cat.getAffection());
			GameWindow.getBirdAffectionJLabel().setText("Birds: " + GameLogic.bird.getAffection());
			GameWindow.getHasmterAffectionJLabel().setText("Cats: " + GameLogic.hamster.getAffection());
			
		}
		
	}

}
