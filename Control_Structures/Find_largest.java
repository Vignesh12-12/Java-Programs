// Program to read 3 numbers and find the largest.
// program:

package topic0;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the 1st number :");
		int num1=scanner.nextInt();
		System.out.print("Enter the 2nd number :");
		int num2=scanner.nextInt();
		System.out.print("Enter the 3rd number :");
		int num3=scanner.nextInt();
		if(num1>num2 && num1>num3) 
			System.out.println(num1+" is the largest");
		else if(num2>num1 && num2>num3)
			System.out.println(num2+" is the largest");
		else
			System.out.println(num3+" is the largest");
	}
}
