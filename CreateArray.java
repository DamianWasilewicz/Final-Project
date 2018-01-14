public class CreateArray{
  private double C;
  private double X1;
  private double X2;
  private double X3;
  //private double X4;
  //private double X5;
  //private double X6;
  private double[] xCoords;
  private double[] yCoords;
  private char[] Roots;
  public CreateArray(double Ci, double X1i, double X2i, double X3i){
    C = Ci;
    X1 = X1i;
    X2 = X2i;
    X3 = X3i;
    double[] X = new double[10100000];
    for(int counter = 0; counter< X.length; counter++){
      X[counter] = (counter * .0001) - 50 ;
    }
    xCoords = X;
    createY();
  }
  public double evaluate(double value){
    double answer = (C + (value * X1) + (value * value * X2)
    + (value * value * value * X3)); //(value * value * value* value * X4)+
    //(value * value * value * value * value * X5) +
    //(value * value * value * value * value* value * X6)
    return answer;
  }
  public void createY(){
    double[] Y = new double[(10100000)];
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
