
public class Problem {
	
	
	//this method will be overloaded
	public int sum(int x, int y) {
		
		return (x+y);
	}
	
	//params have been changed to demonstrate overloading 
	public int sum(int x , int y, int z) {
		
		
		return(x+y+z);
	}
	
	public double sum(double x, double y) {
		
		
		return (x+y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Problem problemObject = new Problem();
	//we have taken values using object of Problem Class
	System.out.println(problemObject.sum(200, 300));
	System.out.println(problemObject.sum(400, 500, 600)); 
	System.out.println(problemObject.sum(5.6, 6.7));
	

	}

}
