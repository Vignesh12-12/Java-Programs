// Read a number and check if it is positive or negative using conditional operators.

// Program:
package topic0;
import java.util.Scanner;
public class Example2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a integer:");
		int num=scanner.nextInt();
		System.out.println(num>0?"positive integer":"negative integer");
	}
}
