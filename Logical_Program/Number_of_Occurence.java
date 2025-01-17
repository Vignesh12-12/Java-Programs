// Program to count number of occurrences of each array value.
// Input : [2,3,6,2,5,6]
// Output: 2 Occurs 2 times
//         3 Occurs 1 times
//         5 Occurs 1 times
//         6 Occurs 2 times

// Program:
public class occurences {
	public static void main(String[] args){
			int[] arr= {2,3,6,2,5,6};
			int[] visited=new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				if(visited[i]==1)
					continue;
				int count=1;
				
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						visited[j]=1;
					}	
				}
				System.out.println(arr[i]+" Occurs "+count+" times");	
				}
			}
	}
