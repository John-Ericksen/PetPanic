
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
		valueChanges = new int[6];
		
		
		text = t;
		portrait = p;
		
		
		for (int i = 0; i < values.length; i++)
		{
			valueChanges[i]= values[i];
		}
		
	}
	
	//changes the action listners so that the buttons use the correct values to adjust affection
	public void changeActionListners()
	{
		//remove previous action listeners
		ActionListener[] actionListners = Window.getYesButton().getActionListeners();
		for(int i = 0; i < actionListners.length; i++)
		{
			Window.getYesButton().removeActionListener(actionListners[i]);
		}
		actionListners = Window.getNoButton().getActionListeners();
		for(int i = 0; i < actionListners.length; i++)
		{
			Window.getYesButton().removeActionListener(actionListners[i]);
		}
				
		Window.getYesButton().addActionListener(this);
		Window.getYesButton().setActionCommand("yes");
				
		Window.getNoButton().addActionListener(this);
		Window.getNoButton().setActionCommand("no");
		
	}
	
	//for an null action listener
	public EventCard()
	{
		text = "listner";
		portrait = null;
		valueChanges  = new int[6];
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
			//System.out.print(Arrays.toString(valueChanges));
			
			GameLogic.dog.changeAffection(valueChanges[0]);
			GameLogic.cat.changeAffection(valueChanges[1]);
			GameLogic.bird.changeAffection(valueChanges[2]);
			
			Window.getDogAffectionJLabel().setText("Dogs: " + GameLogic.dog.getAffection());
			Window.getCatAffectionJLabel().setText("Cats: " + GameLogic.cat.getAffection());
			Window.getBirdAffectionJLabel().setText("Birds: " + GameLogic.bird.getAffection());

			GameLogic.pullCard(); //pulls the next card. disabled while testing.
			
			

		}
		
		//if no
		else
		{
			//System.out.print(Arrays.toString(valueChanges));
			
			GameLogic.dog.changeAffection(valueChanges[3]);
			GameLogic.cat.changeAffection(valueChanges[4]);
			GameLogic.bird.changeAffection(valueChanges[5]);
			

			Window.getDogAffectionJLabel().setText("Dogs: " + GameLogic.dog.getAffection());
			Window.getCatAffectionJLabel().setText("Cats: " + GameLogic.cat.getAffection());
			Window.getBirdAffectionJLabel().setText("Birds: " + GameLogic.bird.getAffection());
			
			GameLogic.pullCard(); //pulls the next card. disabled while testing.
			
			
		}
		
	}

}
