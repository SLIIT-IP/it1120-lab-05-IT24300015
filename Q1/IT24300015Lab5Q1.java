import java.util.Scanner;

	public class IT24300015Lab5Q1 {
		public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the first integer: ");
	int number1 = scanner.nextInt();
	
	System.out.print("Enter the second integer: ");
	int number2 = scanner.nextInt();

	System.out.print("Enter the third integer: ");
	int number3 = scanner.nextInt();

	System.out.println(" ");
        System.out.println("User entered number are :" +  number1 + " " +number2 + " " + number3 + " ");
			


	int smallest = number1;
	int largest = number2;


	if (number2 < smallest) {
		smallest = number2;
	}

	if (number2 > largest) {
		largest = number2;
	}

	if (number3 < smallest) {
		smallest = number3;
	}
	if (number3 > largest) {
		largest = number3;
	}

	
	System.out.println("The smallest number is: " + smallest);
	System.out.println("The largest number is: " + largest);

	}

}
			
	