package mortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculation {

	private static final int MONTHS_IN_A_YEAR = 12;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the principal amount: ");
		double principal = scan.nextDouble();
		
		System.out.println("Enter the interest rate: ");
		float annualInterestRate = scan.nextFloat();
		
		System.out.println("Enter the term in years: ");
		int termInYears = scan.nextInt();
		
		float monthInterestRate = annualInterestRate / MONTHS_IN_A_YEAR;
		int numberOfPayments = termInYears * 12;
		
		double monthlyPayment = principal * (
				monthInterestRate * (Math.pow(1 + monthInterestRate, numberOfPayments))
				/ ((Math.pow(1 + monthInterestRate, numberOfPayments)) -1)
				);
				
		System.out.println("Monthly payment: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));

	}

}
