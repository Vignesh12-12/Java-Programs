// Get the Username and password from the user and perform login operation using equals().
// Expected username is Hello and password is java.

// program:
package topic0;
import java.util.Scanner;
public class String6 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the username:");
		String username=scanner.next();
		System.out.println("Enter the password:");
		String password=scanner.next();
		if(username.equals("Hello") && password.equals("java"))
			System.out.println("login Success");
		else
			System.out.println("invalid username or password");
		scanner.close();
	}
}
