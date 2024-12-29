/*1. Print the multiplication table using a for loop.
n=2
2 x 1 = 2
2 x 2 = 4
…
2 x 10 = 20 */
// program:

package topic0;
public class Tables {
	public static void main(String[] args) {
		int n=2;
		for(int i=1;i<=10;i++)
			System.out.println(n+"x"+i+"="+(n*i));
	}
}
