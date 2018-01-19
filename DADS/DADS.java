import java.util.*;

public class DADS {
  /**<b>Class Description: Beginning Template</b><br>
  *<p></p>
  *@param
  *@return
  *@throws
  */

  /**<b>Method Description: Driver</b><br>
  *<p></p>
  *@param args 4 names
  *@return
  *@throws
  */


   public static void main(String[] args){
     String Password = "14425587b";
     String Username = "BIGBEN";
     int checkUsername;
     int checkPassword;



     Scanner input = new Scanner(System.in);
     System.out.print("Enter Password and Username");
      System.out.print(" \nEnter Username: ");
     String stringA = input.nextLine();
     stringA = stringA.trim();
     checkUsername = stringA.compareTo(Username);
     if(checkUsername == 0){
      System.out.print("Enter Password: ");
      String stringB = input.nextLine();
      stringB = stringB.trim();
      checkPassword = stringB.compareTo(Password);
      if(checkPassword == 0){
       System.out.print("Welc to the rice fields. rip papi franklin");
     }
     else {
       System.out.print("INCORRECT, safe procedure taken");
       System.exit(1);
     }




  }
}
}
