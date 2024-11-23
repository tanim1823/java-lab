package method;

import java.util.Scanner;

class Rectangle {
	double length;
	double width;
	public Rectangle(double l , double w) {
		this.length = l;
		this.width = w;
	}
	
	public void CalculateArea() {
		System.out.println("Area of rectangle  : " + length*width);
	}
}
public class MethodExample {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter Length and width: ");
		double length = myScanner.nextDouble();
		double width = myScanner.nextDouble();
		Rectangle r1 = new Rectangle(length , width);
		r1.CalculateArea();
		myScanner.close();
	}
}
