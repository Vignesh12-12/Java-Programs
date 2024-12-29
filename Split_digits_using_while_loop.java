// Read a number as input split digits using a while loop.

// Program:

package topic0;
public class Split {
	public static void main(String[] args) {
		int n=987;
		while(n>0) {
			int rem=n%10;
			System.out.println(rem);
			n/=10;
		}
	}
}
