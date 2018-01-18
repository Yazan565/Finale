/**<h1>Project Title: Introduction to String Functions</h1>
*<b>Purpose of Project:</b><br>
*<p>Use String Funtinos</p>
*<b>How to start the project instructions:</b><br>
*<p>Pass four names in camelCasing as a asrgs[0] string</p>
*<b>User Instructions:<b/><br>
*<p>Let the program run, Prints out strings using </P>
*<br>
*@author Mark Mercer
*@version 1
*@since 2017-11-18
*/
import java.util.Random;

public class ferjit {
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


   public static void main(String[] args)
    throws NumberFormatException {

     int ExpValue;
     String Basevalue;
     int number = -999999999;



     String name[] = new String[8]; //Will be used to hold argument pieces, as individual names
     System.out.println ("Your Number is:\n" + args[0]); //Shows argument


     try {
       number = Integer.parseInt(args[0]);
     }




     catch (NumberFormatException Ea1) {
       System.out.print("Type only a number you toyota camry");
       System.exit(1);
     }

     for(int i=0; i<args[0].length(); i++) { //Prints a counting structure for the argument


     }
     System.out.print(args[0].length() - 1);



   ExpValue = args[0].length() - 1;
   System.out.print(" \n The exponential value is: " + ExpValue);
   Basevalue = args[0].substring(0,1);
   System.out.print(" \n The Base value is: " + Basevalue);
   System.out.print(" \n The Place Value number is: " + Basevalue + " To the power of: " + ExpValue);

     }
  }
