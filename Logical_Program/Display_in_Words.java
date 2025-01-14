// Read a number and display in words
// n=163
// Output : One Six Three.
// Program:
package topic0;
import java.util.Scanner;
public class Logical4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Integer");
		int n=sc.nextInt();
		if(n==0) 
			System.out.println("zero");
		String[] words= {"zero","one","two","three","four","five",
				"six","seven","eight","nine"};
		int[] num=new int[10];
		int i=0;
		while(n>0) {
			num[i]=n%10;
			n=n/10;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(words[num[j]]+" ");
		}
		sc.close();
	}
}
