// Check if a given year is a leap year or not.

// Program:

package topic0;
import java.util.Scanner;
public class Leapyear {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Year:");
		int year=scanner.nextInt();
		if(year%400==0) {
			System.out.println(year+" is a leap year");
		}
		else if(year%4==0 && year%100!=0){
			System.out.println(year+" is a leap year");
		}
		else{
			System.out.println(year+" is not a leap year");
		}}}
