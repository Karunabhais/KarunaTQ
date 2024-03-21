package DynamicMethod;

public class BasketBall extends Game{
	
	public void rules()
	{
		System.out.println("the game played between to teams ");
	}
	public void noOfPlayers()
	{
		noOfPlayers=6;
		System.out.println("Players: "+noOfPlayers);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         BasketBall b=new BasketBall();
         b.rules();
         b.noOfPlayers();
	}

}
