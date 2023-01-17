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
			int nickel = (int) changeGiven % 10 / 5;
			int penny = (int) (changeGiven % 5) / 1;
			if (twenties > 0) {
				System.out.print("\n Twenty $ Bill: " + twenties);
			}if (ten > 0) {
				System.out.print("\n Ten $ Bill: " + ten);
			}if (five > 0) {
				System.out.print("\n Five $ Bill: " + five);
			}if (one > 0) {
				System.out.print("\n One $ Bill: " + one);
			}if (quarter > 0) {
				System.out.print("\n Number of Quarters: " + quarter);
			}if (dime > 0) {
				System.out.print("\n Number of Dimes: " + dime);
			}if (nickel > 0) {
				System.out.print("\n Number of Nickels: " + nickel);
			}if (penny > 0) {
				System.out.print("\n Number of Pennies: " + penny);
			}
			
			
		} else {
			System.out.println("Insufficient Funds for Transaction.");
			System.out.printf("Customer owes: $ %.2f ", changeGiven * -1); 
		}
	}
		
}
		
