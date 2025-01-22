// Removal all white space from String
// Input : this is java
// Output:
// Thisisjava.
// Program:

public class Remove_whitespace {
	public static void main(String[] args) {
		String s="this is java";
		char[] arr=s.toCharArray();
		String result="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=' ')
				result+=arr[i];
		}
		System.out.println(result);
	}
}
