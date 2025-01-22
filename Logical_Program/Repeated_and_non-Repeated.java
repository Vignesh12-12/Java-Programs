// Print repeated characters and non repeated characters in a String?
// Input : example
// Output:
// Repeated Characters are : e
// Non Repeated Characters : xampl.
// Program:

public class repeated_nonrepeated {
	public static void main(String[] args) {
		String s = "example";
        String repeated = "", nonrepeated = "";
        char[] c = s.toCharArray();
        boolean[] visited = new boolean[s.length()]; 
        for (int i = 0; i < c.length; i++) {
            if (visited[i])
                continue;
            boolean isRepeated = false;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    isRepeated = true;
                    visited[j] = true; 
                }
            }
            if (isRepeated)
                repeated += c[i];
            else
                nonrepeated += c[i];
        }
        System.out.println("Repeated Characters are: " + repeated);
        System.out.println("Non Repeated Characters are: " + nonrepeated);
	}
}
