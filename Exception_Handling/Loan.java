// 1.Loan Eligible Checking using Throw keyword
// → Location should be Chennai, Mumbai, Delhi or Kolkata. If any
// other city, raise Invalid location Error.
// → Age should be minimum 23. If age is less than 23 Raise Invalid
// Age Error.
// program:
import java.util.Scanner;
public class Loan {
    void check(String location, int age) {
        if (location.equals("Chennai") || location.equals("Mumbai") || 
            location.equals("Delhi") || location.equals("Kolkata")) {
            if (age >= 23) {
                System.out.println("Loan Eligible");
            } else {
                throw new NumberFormatException("Invalid Age: Minimum age is 23");
            }
        } else {
            throw new NumberFormatException("Invalid Location: Loan eligibility is only for Chennai, Mumbai, Delhi, or Kolkata");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter the location:");
            String location = s.nextLine();
            System.out.println("Enter Your Age:");
            int age = s.nextInt();
            Loan loan = new Loan();
            loan.check(location, age);
        } catch (NumberFormatException e) { 
            System.out.println(e.getMessage());
        }
        s.close();
    }
}

// Output
// Enter the location:
// Chennai
// Enter Your Age:
// 25
// Loan Eligible
// -----------------------------------------
// Enter the location:
// Bangalore
// Enter Your Age:
// 25
// Invalid Location: Loan eligibility is only for Chennai, Mumbai, Delhi, or Kolkata
// -----------------------------------------
// Enter the location:
// Chennai
// Enter Your Age:
// 22
// Invalid Age: Minimum age is 23
