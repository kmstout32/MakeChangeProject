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

		if (isSufficient) {
			System.out.println("Payment Accepted! ");
			System.out.printf("TOTAL CHANGE: $  %.2f", changeGiven);
			
		//call the method for change amount given
			//sending moneyGiven, itemPrice, and changeGiven into new method
		} else {
			System.out.println("Insufficient Funds for Transaction.");
			System.out.printf("Customer owes: $ %.2f ", changeGiven * -1); // -1 in the statement bc I got a negative
																			// here
		}
	}
}
//		Calculate the amount of change given back to the customer in:
//		$20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c

//	public static void changeTotal(double moneyGiven, double change) {
//
//		if (moneyGiven < change) {
//			int dollarGiven = (int) change; // how do I separate coins??
//			int coinGiven = (int) change - dollarGiven;
//			double changeTotal = 0.0;
//			
//			double twenties = (int) dollarGiven / 20;
//			double ten = (int) dollarGiven / 10;
//			double five = (int) dollarGiven / 5;
//			double one = (int) dollarGiven / 1;
//			double quarter = (int) coinGiven / 25;
//			double dime = (int) coinGiven / 10;
//			double nickel = (int) coinGiven / 5;
//			double penny = (int) (coinGiven % 5) / 1;
//			return=

