// Find the sum and average of an array
// Eg : a={1,4,5,3,2}

// program:
public class Array1 {
	public static void main(String[] args) {
		  int[] a= {1,4,5,3,2};
		  int sum=0;
		  for(int n:a) {
			  sum+=n;
		  }
		  System.out.println("total:"+sum);
		  System.out.println("Average:"+sum/a.length);
	}
}
