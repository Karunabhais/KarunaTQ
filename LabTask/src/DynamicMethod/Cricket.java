package DynamicMethod;

public class Cricket extends Game {
	
	public void rules()
	{
		System.out.println("No cheating ");
	}
	public void noOfPlayers()
	{
		noOfPlayers=9;
		System.out.println("Players: "+noOfPlayers);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c=new Cricket ();
		c.noOfPlayers();
		c.rules();
	}

}
