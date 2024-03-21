package DynamicMethod;



public class Game {
	
	String rules;
	int noOfPlayers;
	
	Game()
	{
		
	}
	public void rules1()
	{
		System.out.println("Rule 1:Not cheating");
		System.out.println("rule 2:were uniform");
		
	}
	
	public void NoOfPlayers()
	{
		noOfPlayers=8;
		System.out.println("Game no of players: "+noOfPlayers);
	}
	public String toString()
	{
		return "Game rules: "+rules+"\nnoOfPlayers:"+noOfPlayers;
			
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Game g=new Game();
       // g.rules1();
        //g.NoOfPlayers();
        
	}
	
	}


