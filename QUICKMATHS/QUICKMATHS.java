import java.util.*;
public class QUICKMATHS{
  private int kent (int numA) {
    return numA%2;
  }

  public static void main (String[] args)
  throws NumberFormatException
  {
    Scanner input = new Scanner ( System.in);
    System.out.println("Say something numerical nigel");
    String stringA = input.nextLine();
    stringA = stringA.trim();
    int numA=-99999; //Secure Number entery
    try {
    numA = Integer.parseInt(stringA);
    }
  catch (NumberFormatException eA1) {
    System.out.println("Please only type a number.");
    stringA = input.nextLine();
    stringA = stringA.trim();
    try{
      numA = Integer.parseInt(stringA);
    }
    catch (NumberFormatException eA2) {
      System.out.println("You have typed letters again, " +
                        "please restart the program and try again.");
      System.exit(1);
    }
  }
    QUICKMATHS obj = new QUICKMATHS();
    if(numA == -99999) {
      System.out.println("The parseInt does not seem to be working.\n" +
                         "Please check the code.");
      System.exit(0);
    }
   int numOA = obj.kent(numA);

   if(numOA == 0){
     System.out.println("Number is even");
     System.exit(1);
   } else if (numOA > 0){
     System.out.println("Number is odd");
     System.exit(1);
   }




  }



}
