// Create an integer array by reading inputs in run time. Read 2 positions
// from the user as input and fetch numbers from those positions. Perform
// division and display quotient and reminder. Handle necessary exceptions.
// program:
import java.util.Scanner;
public class ArrayException {
	public static void main(String[] args) {
		        try{
		            Scanner s= new Scanner(System.in);
		            System.out.println("Enter the no of elements");
		            int n=s.nextInt();
		            int[] arr= new int[n];
		            System.out.println("Enter the Array Elements");
		            for(int i=0;i<n;i++)
		                 arr[i]=s.nextInt();
		            System.out.println("Enter the 1st position");   
		            int fpos=s.nextInt();
		            System.out.println("Enter the 2st position");   
		            int spos=s.nextInt();
		            int quotient=arr[fpos]/arr[spos];
		            int Rem=arr[fpos]%arr[spos];
		            System.out.println("Quotient"+quotient);
		            System.out.println("Remainder"+Rem);
		        }
		    catch(ArrayIndexOutOfBoundsException e){
		        System.out.println("the positions should be from 0 to N-1");
		    }
	}
}

// Output
// Enter the no of elements
// 5
// Enter the Array Elements
// 10
// 20
// 30
// 40
// 50
// Enter the 1st position
// 2
// Enter the 2st position
// 3
// Quotient: 0
// Remainder:30
-----------------------------------------
// Enter the no of elements
// 5
// Enter the Array Elements
// 10
// 20
// 30
// 40
// 50
// Enter the 1st position
//4
// Enter the 2st position
//6
// the positions should be from 0 to N-1


