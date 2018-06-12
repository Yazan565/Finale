public class Chocolate extends RectangularPrism {

  //Instance variables, assigned in Zero Argument Constructor
  private int numberOrdered; //Needed for cascading problem solution
  private double totalChocoCost;
  //Zero Argument Constructor

  //Getters and Setters Methods
  //Getters: instance Variable cannot be changed by outside class or program

  public double getTotalCost () { //returning appleCost from Zero Argument Constructor
    return this.totalChocoCost = Information.chocolateBoxCost * this.numberOrdered; //
  } //End of getTotalCost

  //Processor Methods

  //multi-argument Constructor
  public Chocolate (int userEntered, double length) {
    super( userEntered, length );
    this.numberOrdered = userEntered;
  } //End of ApplesOrdered multi-argument constructor

  //toString() for Printing Results of Class to Console
  public String toString() { //For JOptionPane and Println
    return super.toString() + "\n";
  } //End of toString()

  public String ShoppingCart() { //For JOptionPane and Println
    return super.ShoppingCart() + "\n";
  }



} //End of Chocolate Class
