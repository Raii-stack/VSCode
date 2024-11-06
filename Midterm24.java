package lab;

import  java.util.Scanner;
import java.text.DecimalFormat;

public class Midterm24 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Scanner p1 = new Scanner(System.in);
		Scanner p2 = new Scanner(System.in);
		Scanner p3 = new Scanner(System.in);
		DecimalFormat d = new DecimalFormat("$###,###,###.00");
		DecimalFormat df = new DecimalFormat("###,###,###.00");

		String product1 = " ";
		String product2 = " ";
		String product3 = " ";

		System.out.print("Enter Product 1: ");
		product1 = p1.nextLine();
		System.out.print("Enter price: ");
		double price1 = s.nextDouble();

		
		System.out.print("\nEnter Product 2: ");
		product2 = p2.nextLine();
		System.out.print("Enter price: ");
		double price2 = s.nextDouble();

	
		System.out.print("\nEnter Product 3: ");
		product3 = p3.nextLine();
		System.out.print("Enter price: ");
		double price3 = s.nextDouble();
		
		System.out.println("\nInput Mode of Payment Terms");
		System.out.print("\nCash discount: ");
		double discount = s.nextDouble();
		System.out.println("\tYou input " + df.format(discount) + "% discount for Cash");
		double discount1 = discount/100;

		System.out.print("\n3 Months Installment: ");
		double installment1 = s.nextDouble();
		System.out.println("\tYou input " + df.format(installment1) + "% for 3 Months Installment.");
		double installment1add = installment1/100;

		System.out.print("\n6 Months Installment: ");
		double installment2 = s.nextDouble();
		System.out.println("\tYou input " + df.format(installment2) + "% for 6 Months Installment.");
		double installment2add = installment2/100;

		
		System.out.print("\n12 Months Installment: ");
		double installment3 = s.nextDouble();
		System.out.println("\tYou input " + d.format(installment3) + "% for 12 Months Installment.");
		double installment3add = installment3/100;

		System.out.println("Main Menu\n");
		System.out.println("Press I/i: " + product1);
		System.out.println("\tPrice: " + d.format(price1) + "dollars");
		System.out.println("Press S/s: " + product2);
		System.out.println("\tPrice: " + d.format(price2) + "dollars");
		System.out.println("Press X/x: " + product3);
		System.out.println("\tPrice: " + d.format(price3) + "dollars");

		System.out.println("\nEnter Item: ");
		char item = s.next().charAt(0);

		double itemPrice = 0.0;
		String chosenItem = "";
		char itemchoice = Character.toUpperCase(item);
		switch(itemchoice) {
		case 'I': 
			System.out.println("Product:\t" + product1);
			System.out.println("Price:\t" + price1);
			chosenItem = product1; 
			itemPrice = price1;
		break;
		case 'S':
			System.out.println("Product:\t" + product2);
			System.out.println("Price:\t" + price2);
			chosenItem = product2; 
			itemPrice = price2;
		break;
		case 'X':
			System.out.println("Product:\t" + product3);
			System.out.println("Price:\t" + price3);
			chosenItem = product3; 
			itemPrice = price3;
		break;
		}

		System.out.println("\nPress1: Cash\t" + discount + "% Discount");
		System.out.println("Press2: 3 Months Installment\t" + installment1 + "% Interest");
		System.out.println("Press3: 6 Months Installment\t" + installment2+ "% Interest");
		System.out.println("Press4: 12 Months Installment\t" + installment3 + "% Interest");
		System.out.println("\nEnter mode of payment:\t");

		int paymentmode = s.nextInt();
		String mode = "";
		double total = 0.0, discounted = 0.0, insatallmentprice = 0.0, monthly = 0.0;
		switch(paymentmode) {
		case 1:			
			mode = "Cash";
			total = itemPrice - itemPrice*discount1;
			discounted = itemPrice*discount1;
			insatallmentprice = 0.0;
			monthly = 0.0;
			break;
		case 2:
			mode = "3 Months Installment";
			total = itemPrice + itemPrice*installment1add;
			insatallmentprice = itemPrice*installment1add;
			monthly = total/3;
			break;
		case 3:
			mode = "6 Months Installment";
			total = itemPrice + itemPrice*installment2add;
			insatallmentprice = itemPrice*installment2add;
			monthly = total/6;
			break;
		case 4:
			mode = "12 Months Installment";
			total = itemPrice + itemPrice*installment3add;
			insatallmentprice = itemPrice*installment3add;
			monthly = total/12;
			break;
		}

		System.out.println("\nMode of payment:\t" + mode);
		System.out.println("Item:\t\t\t" + chosenItem);
		System.out.println("Price:\t\t\t" + d.format(itemPrice)+ " dollars");
		System.out.println("Discount:\t\t" + d.format(discounted) + " dollars");
		System.out.println("Interest:\t\t" + d.format(insatallmentprice) + " dollars");
		System.out.println("Total Amount:\t\t" + total + " dollars");
		System.out.println("Monthly Amortization:\t " + d.format(monthly)+ " dollars");
	}

}

