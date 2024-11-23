package method;

class Calculator {
	int add(int a, int b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
	int add(int a,int b , int c) {
		return a+b+c;
	}
}

public class MethodOverloading {
	
	    public static void main(String[] args) {
	    	Calculator calc = new Calculator();
	        int sumOfTwoInt = calc.add(10, 20); 
	        double sumOfTwoDouble = calc.add(5.5, 7.3); 
	        int sumOfThreeInt = calc.add(1, 2, 3); 

	    
	        System.out.println("Sum of two integers: " + sumOfTwoInt);
	        System.out.println("Sum of two doubles: " + sumOfTwoDouble);
	        System.out.println("Sum of three integers: " + sumOfThreeInt);
	    }
	
}
