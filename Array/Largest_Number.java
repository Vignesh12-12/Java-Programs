// Find the Largest number from an array
// Eg: a={7,9,4,2,1}.

// Program:

public class Array2 {
	public static void main(String[] args) {
		int[] a={7,9,4,2,1};
		int largest=0;
		for(int n:a) {
			if(largest<n)
				largest=n;
		}
		System.out.println("largest number"+largest);
	}

}
