public class CreateArray{
    private int X1;
    private int X2;
    private int X3;
    private double[] xCoords;
    private double[] yCoords;
    public CreateArray(){
	X1 = 2;
	X2 = 2;
	X3 = 2;
	createYcoords();
	createXcoords();
    }
    public void  createYcoords(){
	double[] arr = new double[800000];
	for(int counter = 0; counter < 800000; counter++){
	    arr[counter] = generateY(xCoords[counter]);
	}
	yCoords = arr;
    }
    public void createXcoords(){
	double[] arr = new double[800000];
	for(int counter = 0; counter < 800000; counter++){
	    arr[counter] = .1 * counter;
	}
	xCoords = arr;
    }    
    public int generateY(int arg){
	int Y = (X1 * arg) + (X2 * arg * arg) + (X2 * arg * arg * arg);
	return Y;
    }
    public double[] getX(){
	return xCoords;
    }
    public double[] getY(){
	return yCoords;
    }
}
	
    
    
