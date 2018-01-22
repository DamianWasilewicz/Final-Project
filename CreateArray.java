public class CreateArray{
  //fields
  private double C, X1, X2, X3, X4, X5, X6, XHyp;

  private double[] xCoords, yCoords;





//constructor for general functions C through X6
  public CreateArray(double Ci, double X1i, double X2i, double X3i, double X4i, double X5i, double X6i){
    C = Ci;
    X1 = X1i;
    X2 = X2i;
    X3 = X3i;
    X4 = X4i;
    X5 = X5i;
    X6 = X6i;
    double[] X = new double[10100000];
    for(int counter = 0; counter< X.length; counter++){
      X[counter] = (counter * .00001) - 50 ;
    }
    xCoords = X;
    createY();
  }




//constructor for hyperbola
  public CreateArray(double XHypi){
    XHyp = XHypi;
    double[] X = new double[10100000];
    for(int counter = 0; counter< X.length; counter++){
      X[counter] = (counter * .00001) - 50 ;
    }
    xCoords = X;
    createYH();
  }




//generates y value from x value for hyperbola
  public double evaluateH(double value){
    double answer = (XHyp * (1/value));
    return answer;
  }




//creates y value array for hyperbola
  public void createYH(){
    double[] Y = new double[(10100000)];
    for(int counter = 0; counter < Y.length; counter++){
      if(xCoords[counter] != 0){
      Y[counter] = evaluateH(xCoords[counter]);
    }
  }
    yCoords = Y;
  }




//generates y values from x values for general functions
  public double evaluate(double value){
    double answer = (C + (value * X1) + (value * value * X2)
    + (value * value * value * X3) +(value * value * value* value * X4) +
    (value * value * value * value * value * X5) +
    (value * value * value * value * value* value * X6));
    return answer;
  }




//creates y value array for general functions
  public void createY(){
    double[] Y = new double[(10100000)];
    for(int counter = 0; counter < Y.length; counter++){
      Y[counter] = evaluate(xCoords[counter]);
    }
    yCoords = Y;
  }
//accessor for X value array
public double[] getX(){
    return xCoords;
  }
//accessor for Y value array
  public double[] getY(){
    return yCoords;
  }
}
