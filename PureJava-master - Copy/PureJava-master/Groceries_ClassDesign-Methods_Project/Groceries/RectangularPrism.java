public class RectangularPrism extends ShoppingCart {
  //Instance variables, assigned in Zero Argument Constructor
  private double length;
  private double width;
  private double height;
  private int numberOrdered;
  private double singleSquareVolume;
  private double singleSquareCubeVolume;
  private int squaresPerRow; //Items per row
  private int squaresPerFlat; //Spheres per flat
  private int squaresPerBox; //Spheres per flat
  private int numBoxes; //Adding Number of full boxes needed for shipping
  private int numFlats; //Adding Number of full "flats" needed for shipping
  private int numRows; //Adding Number of full "rows" needed for shipping
  private int squareNumberCalculated; //Needed for cascading problem solution
  private int squareLeftover; //Needed for cascading problem
  //Zero Argument Constructor
  //Getters and Setters Methods
    //Getters: instance Variable cannot be changed by outside class or program
  //Processor Methods
  //Multi-argument Constructor
  public RectangularPrism (int userEntered, double length1) {
  //toString() for Printing Results of Class to Console
  super();
  this.numberOrdered = this.squareNumberCalculated = userEntered;
  this.length = length1;
  this.singleSquareVolume = this.length*this.length*this.length;
  this.squaresPerRow = (int) Information.box1Width / (int) this.length;
  this.squaresPerFlat = (int) Information.box1Length / (int) this.length * this.squaresPerRow;
  this.squaresPerBox = (int) Information.box1Height / (int) this.length * this.squaresPerFlat;
  this.numBoxes = 0;
  this.numFlats = 0;
  this.numRows = 0;

  while (this.squareNumberCalculated >= this.squaresPerBox) { //Check if we need 1 box or more
    this.numBoxes += 1; //Same as numBoxes = numBoxes +1
    this.squareNumberCalculated -= this.squaresPerBox; //Same as sphereNumberCalculated = sphereNumberCalculated - spheresPerBox
  } //End of WHILE for Full boxes
  while (this.squareNumberCalculated >= this.squaresPerFlat) { //Check if we need 1 flat or more
    this.numFlats += 1;
    this.squareNumberCalculated -= this.squaresPerFlat;
  } //End of WHILE for Full flats
  while (this.squareNumberCalculated >= this.squaresPerRow) { //Check if we need 1 row or more
    this.numRows += 1;
    this.squareNumberCalculated -= this.squaresPerRow;
  } //End of WHILE for Full boxes
  this.squareLeftover = this.squareNumberCalculated; //Number of spheres left in less than a row
} //End of Multi-argument Constructor

public String toString(){
return "Boxing Guide: \nNumber Ordered: " + this.numberOrdered + "\n" +
       "Number of Boxes Needed: " + (numBoxes + 1) + "\n" +
       "\tNumber of Full Boxes: " + numBoxes + "\n" +
       "\tGuide for last partial box: " + numFlats + " full flats, " + numRows +
       " full row(s) on last flat, " + this.squareLeftover + " Chocolates in last row" + "\n" + "\n" + ShoppingCart();
} //End of Rectangular Prism Class

public String ShoppingCart() {
  return "The total cost for all purchased goods is: " + Groceries.myCost;

}
}
