import java.util.Scanner;

	public class IT24300015Lab5Q2 {
		public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the number of new members introduce: ");
	int numberofmembers = scanner.nextInt();

	if (numberofmembers < 0) {
		System.out.print("Invalid input. the number of new member to be negitive: ");
	}

	else {

	switch(numberofmembers) {
		case 0:
			System.out.println("No prize");
		break;

		case 1:
			System.out.println("Pen");
		break;

		case 2:
			 System.out.println("Umbrella");
		break;

		case 3:
			System.out.println("Bag");
		break;

		case 4:
			System.out.println("Travelling chair");
		break;

	
		default: System.out.println("Headphone");
		
			}
		}

	}

}