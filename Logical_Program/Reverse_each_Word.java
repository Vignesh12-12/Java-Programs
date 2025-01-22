// Program to reverse each word of a string in java?
// Input : java program
// Output:
// avaj margorp.
// Program:

public class reverse_each_word {
	public static void main(String[] args) {
		String s="java program";
		String[] words=s.split(" ");
		String result="";
		for(String word:words) {
			String reversedword="";
			for(int i=word.length()-1;i>=0;i--) {
				reversedword+=word.charAt(i);
			}
			result=result+reversedword+" ";
		}
		System.out.println(result.trim());
	}
}
