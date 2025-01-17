// How to find the first non-repeating element in an array of integers?
// Input : a =[2,3,6,2,5,6]
// Output : First non-repeating number : 3.
// Program:
package topic0;
public class Non_Repeating_Element {
	public static void main(String[] args) {
		int[] arr= {2,3,6,2,5,6};
		int[] visited=new int[arr.length];
		boolean flag=true;
		for(int i=0;i<arr.length;i++) {
			if(visited[i]==1)
				continue;
			visited[i]=1;
			flag=true;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					visited[j]=1;
					flag=false;
				}	
			}
			if(flag) {
				System.out.println("First non-repeating number:"+arr[i]);
				break;
			}
		}
	}
}
