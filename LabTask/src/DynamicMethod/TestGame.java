package DynamicMethod;

public class TestGame extends Cricket {
	
	     //  Game game;
	
	/*public void show()
	{
		game.rules1();
		game.NoOfPlayers();
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // Game g=new Game();
     BasketBall b=new BasketBall();
     Cricket c=new Cricket ();
     Game g=new Game();
     Game ref;
     ref=g;
     ref.rules1();
     ref.NoOfPlayers();
     
     BasketBall ref1;
     ref1=b;
     ref1.rules();
     ref1.noOfPlayers();
     
     Cricket ref2;
     ref2=c;
     ref2.rules();
     ref2.noOfPlayers();
     
     
     
     
     
     
     
     
    
     
     
   
	} 
	
}
