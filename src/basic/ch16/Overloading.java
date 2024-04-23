package basic.ch16;

public class Overloading {
	
	public int multiple(int a, int b) {
		return a * b;
	}
	
	public double multiple(double a, double b) {
		return a * b;
	}
	
	public int multiple(int a, int b, int c) {
		return a * b * c;
	}
	
	public double multiple(double a, double b, double c) {
		return a * b * c;
	}
	
	public Overloading() {
		multiple(3, 5);
		multiple(1.0, 5.0);
		multiple(5, 6, 7);
		multiple(2.2, 3.3, 4.4);
	}
	


	

}
