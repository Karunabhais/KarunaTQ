package Ternary.com;

public class BranchOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int Collyear=2;
    String branch="C";
    switch(Collyear)
    {
    case 1:System.out.println("Eng Math");
               break;
    case 2: switch (branch)
           { 
             case "C":System.out.println("SE.Java");
                       break;
             case  "E": System.out.println(" Dynamic,Electrics");
                        break;
             case "M": System.out.println("Macanical engeneering");
                        break;
           }
          break;
          case 3: switch(branch)
          {
          case "C":System.out.println("Computer Orgnization");
                     break;
          case "E":System.out.println("Fundamentals");
                      break;
          case "M": System.out.println("Macanical");
                      break;
          }
          break;
          case 4: switch(branch)
          {
            case "C": System.out.println("Data Communication" );
                       break;
            case "E": System.out.println("Embeded System");
                     break;
            case "M": System.out.println("Technology");
                       break;
                       
        	  
             
                       
    }
    }
	}

}
