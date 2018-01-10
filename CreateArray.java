public class CreateArray{
  private double X1;
  private double X2;
  private double X3;
  private double[] xCoords;
  private double[] yCoords;
  public CreateArray(){
    X1 = 1;
    X2 = 1;
    X3 = 1;
    double[] X = new double[400000];
    for(int counter = 0; counter< X.length; counter++){
      X[counter] = (counter * .001) -200 ;
    }
    xCoords = X;
    createY();
  }
  public double evaluate(double value){
      double answer =((value * X1) + (value * value * X2)
		      + (value * value * value * X3)) * .001;
    return answer;
  }
  public void createY(){
    double[] Y = new double[400000];
    for(int counter = 0; counter < Y.length; counter++){
      Y[counter] = evaluate(xCoords[counter]);
    }
    yCoords = Y;
  }
  public double[] getX(){
    return xCoords;
  }
  public double[] getY(){
    return yCoords;
  }
}
