package basic;
import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Enter a Integer: ");
		int n = myScanner.nextInt();
		int rev = 0;
		while(n!=0) {
			int dig = n%10;
			rev = rev * 10 + dig;
			n/=10;
		}
		
		System.out.println("Reverse Integer: "+rev);
		
		myScanner.close();

	}

}


