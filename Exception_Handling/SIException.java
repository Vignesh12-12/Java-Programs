// Find Simple interest by reading principle amount, number of years and
// rate of interest as input. Handle necessary exceptions.
// Program:

import java.util.InputMismatchException;
import java.util.Scanner;
public class SiException {
	public static void main(String[] args) {
		try {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the principle Amount");
		int p=s.nextInt();
		System.out.println("Enter the number of years");
		int n=s.nextInt();
		System.out.println("Enter the Rate of interest");
		double r=s.nextDouble();
		Double si=p*n*r/100.0;
		System.out.println("Simple Interest:"+si);
		s.close();
		}
		catch(InputMismatchException e) {
			System.out.println("Only Digits allowed");
		}
	}
}
// Output
// Enter the principle Amount
// 1000
// Enter the number of years
// 2
// Enter the Rate of interest
// 5.5
// Simple Interest:110.0
//-----------------------------------------
// Enter the principle Amount
// 1000
// Enter the number of years
// 2
// Enter the Rate of interest
// 5.5%
// Only Digits allowed
