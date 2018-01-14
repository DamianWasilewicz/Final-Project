public class CreateArray{
  private double C;
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
    double[] X = new double[1000000];
    for(int counter = 0; counter< X.length; counter++){
      X[counter] = (counter * .0001)-50 ;
    }
    xCoords = X;
    createY();
  }
  public double evaluate(double value){
    double answer = (value + (value * X1) + (value * value * X2)
    + (value * value * value * X3)+ (value * value * value* value * X4)+
    (value * value * value * value * value * X5) +
    (value * value * value * value * value* value * X6)) * .0001;
    return answer;
  }
  public void createY(){
    double[] Y = new double[1000000];
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
  public void setC(String input){
    C = Double.parseDouble(input);
  }
  public void setX1(String input){
    X1 = Double.parseDouble(input);
  }
  public void setX2(String input){
    X2 = Double.parseDouble(input);
  }
  public void setX3(String input){
    X3 = Double.parseDouble(input);
  }
  public void setX4(String input){
    X4 = Double.parseDouble(input);
  }
  public void setX5(String input){
    X5 = Double.parseDouble(input);
  }
  public void setX6(String input){
    X6 = Double.parseDouble(input);
  }
  public double[] getX(){
    return xCoords;
  }
  public double[] getY(){
    return yCoords;
  }
}
