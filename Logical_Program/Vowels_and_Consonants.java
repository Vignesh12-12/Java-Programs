// How to count a number of vowels and consonants in a given String?
// Eg :
// Input : program
// Output:
// Total no of vowels : 2
// Total no of consonants : 5.
// program:

public class vowels_consonants {
	public static void main(String[] args) {
		String s="program";
		char[] c=s.toCharArray();
		int vowels=0,consonants=0;
		for(int i=0;i<s.length();i++) {
			if(c[i]=='a'||c[i]=='A'||c[i]=='e'||c[i]=='E'||c[i]=='i'||c[i]=='I'||
					c[i]=='o'||c[i]=='O'||c[i]=='u'||c[i]=='U')
					vowels+=1;
			else
					consonants+=1;
		}
		System.out.println("Total no of vowels:"+vowels);
		System.out.println("Total no of consonants:"+consonants);
	}
}
