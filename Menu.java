package lab;

import java.text.DecimalFormat;
import java.util.Scanner;
import lab.Function;

public class Menu {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("###,###,###.00");
	
	StringBuilder choices = new StringBuilder();
	choices.append("\nMenu");
	choices.append("\n1. Average");
	choices.append("\n2. Age");
	choices.append("\n3. Tuition fee");
	choices.append("\nType E to exit program.");
	
	while(true) {
	System.out.println(choices + "\n\nEnter your choice: ");
	char choice = input.next().charAt(0);
	char upper = Character.toUpperCase(choice);
	if (upper=='E') {
		break;
	}
	else {
	Function func = new Function();
		switch(choice){
		case '1':
			func.Average();
			break;
		case '2':
			func.Age();
			break;
		case '3':
			func.Tuition();
			break;
		default:
			System.out.println("Invalid input. Please try again");
				}
			}
		}
	System.out.println("Program ended.");
	}
}
