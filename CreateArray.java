public class CreateArray{
  private double X1;
  private double X2;
  private double X3;
  private double[] xCoords;
  private double[] yCoords;
  public CreateArray(){
    double[] X = new double[400000];
    for(int counter = 0; counter< X.length; counter++){
      X[counter] = (counter * .001) -200 ;
    }
    xCoords = X;
    createY();
  }
  public double evaluate(double value){
    double answer = (value * X1) + (value * value * X2)
    + (value * value * value * X3);
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
  public void setX1(double setter){
    X1 = setter;
  }
  public void setX2(double setter){
    X2 = setter;
  }
  public void setX3(double setter){
    X3 = setter;
  }
}
