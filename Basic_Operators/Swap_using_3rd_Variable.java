/*3.Declare and assign 2 variables and Swap the values using the third
variable.
Sample Input: a=5, b=7
Expected Output: a=7, b=5*/

//code
package topic0;
public class Swap {
	public static void main(String[] args) {
		int a=5,b=7,c;
		System.out.println("before swapping ");
		System.out.println("a="+a+" b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping");
		System.out.println("a="+a+" b="+b);
	}
}
