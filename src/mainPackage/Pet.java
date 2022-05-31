package mainPackage;

//simple class to store the affection values of each pet. if the values get to high or too low, game will end.
public class Pet 
{
  //number representative of your affection points with each of your pets
	private int affection;
	
	public Pet( int a)
	{
		affection = a;
	}
	
	//sets the default affection value
	public Pet()
	{
		affection = 50;
	}
	
	public int getAffection()
	{
		return affection;
	}
	
	public void changeAffection(int change)
	{
		affection += change;
	}

}
