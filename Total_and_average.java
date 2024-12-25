// Read marks in 3 subjects as inputs and display total and average.

//program:
package topic0;
import java.util.Scanner;
public class Marks {
public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter  mark1 :");
		int mark1=scanner.nextInt();
		System.out.print("Enter  mark2 :");
		int mark2=scanner.nextInt();
		System.out.print("Enter  mark3 :");
		int mark3=scanner.nextInt();
		int total=mark1+mark2+mark3;
		float average=total/3;
		System.out.println("Total mark :"+total);
		System.out.println("Average :"+average);
	}
}
