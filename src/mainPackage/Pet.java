package mainPackage;

public class Pet 
{
  //numbers representative of your affection points with each of your pets
	private int affection;
	
	public Pet( int a)
	{
		affection = a;
	}
	
	public Pet()
	{
		affection = 10;
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
