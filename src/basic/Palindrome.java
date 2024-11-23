package basic;
import java.util.Scanner;
public class Palindrome {
	
	public static boolean isPalindrome(int x) {
		if(x <  0) { 
			return false;
		}
		
		int a = x , b = 0;

		
		while(x != 0) {
			int dig = x % 10;
			b = b*10 + dig;
			x /= 10;
		}
		
		return a==b;
	}
	
	public static void main(String[] args) {
		Scanner myScanner  = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int x = myScanner.nextInt();
		if (isPalindrome(x)) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }
		
		myScanner.close();
	}

}
