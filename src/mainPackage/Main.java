package mainPackage;

public class Main 
{
	public static void main(String[] args) 
	{
		 Window window = new Window();
		 window.activateTutorial();
		 GameCalander calander = new GameCalander();
		 EventCardStorage.initialize();
		 calander.startGame(0);
		 
		 
	}

}
