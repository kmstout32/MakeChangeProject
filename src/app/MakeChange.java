package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		double itemPrice = 0.0;
		double moneyGiven = 0.0;
		double changeGiven = 0.0;

		Scanner sc = new Scanner(System.in);

//		 prompted the asking price of the item
		System.out.print("Enter the price of item: ");
		itemPrice = sc.nextDouble();

//		
//		prompt the user how much money was given?
		System.out.print("Enter the dollar amount given: ");
		moneyGiven = sc.nextDouble();
		sc.close();

		boolean isSufficient = true;
	    isSufficient = moneyGiven > itemPrice;
	    		
		if (isSufficient) {
			System.out.println("Payment Accepted! " );
		} else {
			System.out.println("Insufficient Funds for Transaction.");

			}
		// display a default if money given was exact amount, too much or too little.
		// method?? with
	}

//		Calculate the amount of change given back to the customer in:
//		$20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c
	
			

//		   
//	
	}
