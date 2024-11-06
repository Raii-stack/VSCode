package POS;
import java.util.Scanner;

public class project1 {
public static void main(String[] args) {
	Scanner input= new Scanner (System.in);
	String product = "";
	double quantity = 0.0;
	double unitPrice = 0.0;
	
	double totalPrice = 0.0;
	double discount = 0.0, netPrice = 0.0; 
	
	
	System.out.print("Enter product name: ");
	product=input.nextLine();
	System.out.print("Enter unit price: ");
	unitPrice=input.nextDouble();
	System.out.print("Enter quantity: ");
	quantity=input.nextDouble(); 
	
	totalPrice = quantity * unitPrice;
	discount = totalPrice * 0.1;
	netPrice = totalPrice - discount;
	
	System.out.print("\nProduct name: " + product);
	System.out.print("\nTotal price: " + netPrice);
	System.out.print("\nDiscount: " + discount + " dollars");
	System.out.print("\nNet price: " + netPrice + " dollars");
	}
}
