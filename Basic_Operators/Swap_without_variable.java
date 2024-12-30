//Swap two numbers without using a third variable.

// Program:
package topic0;
public class Swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=7,c;
		System.out.println("before swapping ");
		System.out.println("a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping");
		System.out.println("a="+a+" b="+b);
	}
}
