// Find the Largest and Second largest number from an array?
// Input :
// a =[8,9,3,6,2,4,9]
// Output:
// Second LargestNumber : 9
// Second Smallest Number : 8.
// program:
package topic0;
public class FmaxSmax {
	public static void main(String[] args) {
		int[] arr= {8,9,3,6,2,4,9};
		int fmax=arr[0],smax=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(fmax<arr[i]) {
				smax=fmax;
				fmax=arr[i];
			}
			else if(smax<arr[i]&& fmax!=arr[i]||fmax==smax)
				smax=arr[i];
		}
		System.out.println("Largest number:"+fmax+
				"\nSecond largest number:"+smax);
	}
}
