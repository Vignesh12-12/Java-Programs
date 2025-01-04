// How to find all pairs on integer array whose sum is equal to
// given Number?
// Input : a =[2,3,6,7,5,1]
// n=9
// Output:
// Pairs : 2,7
// 3,6

// program:

public class Array7 {
	public static void main(String[] args) {
		int[] a= {2,3,6,7,5,1};
		int n=9;
		for(int i=0;i<a.length;i++) {
			int ind=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(ind+a[j]==n) 
					System.out.println(ind+","+a[j]);				
			}
		}
	}
}
