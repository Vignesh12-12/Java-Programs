// In a given array, change every alternate number into negative numbers.
// Input : [5,9,1,3,7,4,-5]
// Output: [5,-9,1,-3,7,-4,5]
// Program:
package topic0;
public class Logical7 {
	public static void main(String[] args) {
		int[] arr= {5,9,1,3,7,4,-5};
		for(int i=0;i<arr.length;i++) {
			int num=0;
			if(i%2==1) {
				if(arr[i]<0)
					continue;
				else
					num=arr[i]*-1;
					arr[i]=num;
			}
			else {
				if(arr[i]<0) {
					num=arr[i]*-1;
					arr[i]=num;
				}
			}
		}
		for(int n:arr)
			System.out.println(n+" ");
	}
}
