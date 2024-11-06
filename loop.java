package lab;
import java.util.Scanner;

public class loop{
	public void Test(){
		Scanner sc = new Scanner(System.in);
		int pin = 0;
		do {
	        System.out.println("Enter a pin: ");
	        pin = sc.nextInt();
	    } while (pin != 12345);
	    System.out.println("Welcome to program");
	}
}