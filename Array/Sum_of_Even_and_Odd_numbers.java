// Write a Program to print Sum of even and odd elements in an array.
// Program:

package topic0;
public class Array6 {
	public static void main(String[] args) {
		int[] a= {1,4,5,3,2,7,6,9,8,10};
		int sumeven=0,sumodd=0;
		for(int n:a) {
			if (n%2==0)
				sumeven+=n;
			else 
				sumodd+=n;
		}
		System.out.println("Sum of even:"+sumeven);
		System.out.println("Sum of odd:"+sumodd);
	}
}
