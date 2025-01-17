// Sort the array in ascending order?
// Input : a =[8,9,3,6,2,4]
// Output:
// Ascending Order : [2,3,4,6,8,9].
// Program:
package topic0;
public class SortAscending {
	public static void main(String[] args) {
		int[] arr= {8,9,3,6,2,4};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}
			}
		}
		System.out.print("After Ascending the array:\n");
		for(int n:arr) {
			System.out.print(n+" ");
		}
	}
}
