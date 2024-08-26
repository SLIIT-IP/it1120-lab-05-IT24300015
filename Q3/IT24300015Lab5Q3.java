import java.util.Scanner;

	public class IT24300015Lab5Q3 {
		public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

		final double roomperday = 48000.00;
		final double discount_3_4_days = 0.1;
		final double discount_5_more_days = 0.2;

		System.out.print("Enter start date (1 to 31): ");
		int startdate = scanner.nextInt();

		System.out.print("Enter end date (1 to 31): ");
		int enddate = scanner.nextInt();
		
		int numberofdate = enddate - startdate;
		System.out.println("number of date: " + numberofdate);
	if (startdate < 0 || enddate > 31) {
		System.out.println("Error: days must between 0 to 32");
			
		return;
	}

	if (startdate >= enddate) {
		System.out.println("Error: days must be less than end date");

		return;
	}

		System.out.println("");
		System.out.println("Room Charge per Day: Rs. 48000.0 ");
		
		
	double discount = 0;

	 if(numberofdate >= 3) {
		discount = 0.1;
	} else if (numberofdate >= 5) {
		discount = 0.2;
	} 

	//calucation 
	double priceforroom = roomperday * numberofdate;
	double discountprice = priceforroom *discount;
	double totaleprice = priceforroom - discountprice;
		
	System.out.print("Total amount to be Paid:" + totaleprice);
    }
}
