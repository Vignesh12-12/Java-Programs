// Check whether the given number is Armstrong or not?
// Eg: 153 = 1*1*1 + 5*5*5 + 3*3*3 // 153 is an Armstrong number.
// Eg: 1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 ==1634.
// program:

import java.util.Scanner;
public class Logical1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a integer:");
		int n=sc.nextInt();
		int sum=0,rem,temp=n;
		int l=String.valueOf(n).length();
		while(n>0) {
			rem=n%10;
			sum+=Math.pow(rem,l);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a Armstrong number");
	}
}
