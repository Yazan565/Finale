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

public class Something {
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
  int i;
  int random1 = i;
  int random2 = i*i;

   public static void main(String[] args) {


   String name[] = new String[8]; //Will be used to hold argument pieces, as individual names
   System.out.println ("Squares of numbers from 1 to 10 including random is:\n" + args[0]); //Shows argument
   for(int i=1; i<10; i++) { //Prints a counting structure for the argument
     if(i <= 10) {

      double random =  (Math.random() * i*i);
      if (random < i){
        random = random + i;
      }
      if (random > i*i){
       random =  random - i;
      }




      System.out.print(i + "\t" + i*i + "\t" + (int)random);

      System.out.println(""); //Used to print a new line, reading ease






        }
      }



     }
   }
   // System.out.println(""); //Used to print a new line, reading ease
