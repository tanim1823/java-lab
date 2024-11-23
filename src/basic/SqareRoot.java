package basic;
import java.util.Scanner;
public class SqareRoot {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = scanner.nextDouble();
        if (n < 0) {
            System.out.println("Square root of a negative number is not defined in real numbers.");
        } else {
            double sq = Math.sqrt(n);
            System.out.println("The square root of " + n + " is " + sq);
        }
        scanner.close();
    }

}
