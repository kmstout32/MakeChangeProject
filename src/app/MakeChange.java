package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		double itemPrice = 0.0;
		double moneyGiven = 0.0;

		Scanner sc = new Scanner(System.in);

//		 prompt the asking price of the item
		System.out.print("Enter the price of item: ");
		itemPrice = sc.nextDouble();

//		prompt the user how much money was given?
		System.out.print("Enter the dollar amount given: ");
		moneyGiven = sc.nextDouble();
		sc.close();
		// initialize change given, then figure out how much change to give back

		boolean isSufficient = true;
		isSufficient = moneyGiven >= itemPrice;
		double changeGiven = moneyGiven - itemPrice;

		// display a default if money given was exact amount, too much or too little.
//total = 16.73 -- moneyGiven = 20 --changeGiven = 3.27 
		//16.73*100= 1673 --
		//1673/1000
		if (isSufficient) {
			System.out.println("Payment Accepted! ");
			System.out.printf("TOTAL CHANGE: $  %.2f", changeGiven);
			changeGiven = changeGiven * 100;
			int twenties = (int) changeGiven / 2000;
			int ten = (int) changeGiven % 2000 / 1000;
			int five = (int) changeGiven % 1000 / 500;
			int one = (int) changeGiven % 500 / 100;
			int quarter = (int) changeGiven % 100 / 25;
			int dime = (int) changeGiven % 25 / 10;
			int nickel = (int) changeGiven % 10;
			int penny = (int) (changeGiven % 5) / 1;
			System.out.println(changeGiven);
			System.out.println(changeGiven);
			
			
			// call the method for change amount given
			// sending moneyGiven, itemPrice, and changeGiven into new method
		} else {
			System.out.println("Insufficient Funds for Transaction.");
			System.out.printf("Customer owes: $ %.2f ", changeGiven * -1); // -1 in the statement bc I got a negative
																			// here
		}
	}

//		Calculate the amount of change given back to the customer in:
//		$20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c

	

		
}
//			
