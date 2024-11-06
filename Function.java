package lab;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Function {
	public void Average() {
		Scanner ave = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###,###.00");
//		String gasType = "";
		
		System.out.print("Enter fuel type: ");
		String gasType = ave.nextLine();
		System.out.println("Enter price in Day 1: ");
		double d1 = ave.nextDouble();
		System.out.println("Enter price in Day 2: ");
		double d2 = ave.nextDouble();
		System.out.println("Enter price in Day 3: ");
		double d3 = ave.nextDouble();
		
		double total = d1 + d2 + d3;
		double average = total/3;
		
		System.out.println("Average pice of " + gasType + " is " + df.format(average) + " per liter.");
	}
	
	public void Age() {
		Scanner age = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = age.nextLine();
		System.out.print("Enter year: ");
		int year = age.nextInt();
		System.out.print("Enter birth year: ");
		int bYear = age.nextInt();
		
		int nowAge = year - bYear;
		System.out.println(name + ", your age in " + year + " is " + nowAge);
	}
	
	public void Tuition() {
		Scanner student = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###,###.00");
		double cashDiscount = 0.1, installment2Discount = 0.05, installment3Discount = 0.1;

	
		System.out.print("Enter name of student: ");
		String studentName = student.nextLine();
		System.out.print("Enter number of units enrolled: ");
		int studentUnits = student.nextInt();
		System.out.print("Enter price per Unit: ");
		double priceUnit = student.nextDouble();
		
		double computedTuition = studentUnits * priceUnit;
		System.out.println("\n\nComputed tuition fee: " + df.format(computedTuition) + "dollars");
		System.out.println(studentName + ", You could avail the following payment mode: \n");
		
		double cashPayment = computedTuition - computedTuition * cashDiscount;
		double installment2 = computedTuition + computedTuition*installment2Discount;
		double installment3 = computedTuition + computedTuition*installment3Discount;
		
		
		while(true) {
			System.out.println("Choose payment method [0: Cash payment, 1: Credit card]: ");
			int method = student.nextInt();
			
			if (method > 2) {
				System.out.println("Invalid user input.\n");
			}
			else if (method == 0) {
				System.out.println("Cash payment: " + df.format(cashPayment) + " dollars");
				break;
			}
			else if (method == 1) {
				System.out.println("2-Installment: " + df.format(installment2) + " dollars");
				System.out.println("3-Installment: " + df.format(installment3) + " dollars");
				break;
			}
		}
	}
	
	public static void clearScreen() {   
	    System.out.print("\033[H\033[2J");   
	    System.out.flush();   
	   } 
}
