public class CreateArray{
  private double X1;
  private double X2;
  private double X3;
  private double X4;
  private double X5;
  private double X6;
  private double[] xCoords;
  private double[] yCoords;
  private char[] Roots;
  public CreateArray(){
    X1 = 10;
    X2 = 10;
    X3 = 10;
    X4 = 10;
    X5 = 10;
    X6 = -10;
    double[] X = new double[10000000];
    for(int counter = 0; counter< X.length; counter++){
      X[counter] = (counter * .00001)-50 ;
    }
    xCoords = X;
    createY();
  }
  public double evaluate(double value){
    double answer = ((value * X1) + (value * value * X2)
    + (value * value * value * X3)+ (value * value * value* value * X4)+
    (value * value * value * value * value * X5) +
    (value * value * value * value * value* value * X6)) * .00001;
    return answer;
  }
  public void createY(){
    double[] Y = new double[10000000];
    for(int counter = 0; counter < Y.length; counter++){
      Y[counter] = evaluate(xCoords[counter]);
    }
    yCoords = Y;
  }
  public void CreateRoots(){
    char[] answer = new char[6];
    String ans = new String ("");
    for(int counter = 0; counter < yCoords.length; counter++){
      if(yCoords[counter] == 0){
        ans+= ", " + xCoords[counter];
      }
    }
    answer = ans.toCharArray();
    Roots = answer;
  }
  public char[] getRoots(){
    return Roots;
  }
  public double[] getX(){
    return xCoords;
  }
  public double[] getY(){
    return yCoords;
  }
}
