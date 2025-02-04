// Create a base class called iPhone with a method displayFeatures() that prints a
// general message about the features of an iPhone. Then, create two derived classes,iPhone14 and iPhone15, that 
// override the displayFeatures() method to provide specific details about each model.
// 1. In the iPhone class, define the displayFeatures() method to print “This is an iPhone with standard features”.
// 2. In the iPhone14 class, override the displayFeatures() method to print “iPhone14 features: 6.1-inch display, 
// A15 Bionic chip, Dual-camera system”.
// 3. In the iPhone15 class, override the displayFeatures() method to print “iPhone15 features: 6.7-inch display, 
// A16 Bionic chip, Triple-camera system”.
// Demonstrate polymorphism by creating instances of iPhone14 and iPhone15, and call the displayFeatures() method on 
// each instance to show how method overriding works.
// Solution Outline
// 1. Base Class (iPhone): Define the displayFeatures() method.
// 2. Derived Class (iPhone14): Override the displayFeatures() method.
// 3. Derived Class (iPhone15): Override the displayFeatures() method.
// 4. Instances: Create instances of iPhone14 and iPhone15, and call the
// displayFeatures() method to demonstrate method overriding.
// program:

import java.util.Scanner;
class Iphone{
	void DisplayFeatures() {
		System.out.println("This is an iPhone with standard features");
	}
}

class Iphone14 extends Iphone{
	@Override
	void DisplayFeatures() {
		System.out.println("iPhone14 features: 6.1-inch display, A15 Bionic chip, Dual-camera system");
	}
}
public class Iphone15 extends Iphone{
	@Override
	void DisplayFeatures() {
		System.out.println("iPhone15 features: 6.7-inch display, A16 Bionic chip, Triple-camera system");
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Choose Any One:\n1.iphone14\n2.iphone15");
		int ch=s.nextInt();
		if(ch==1) {
			Iphone14 i14=new Iphone14();
			System.out.println("Displaying Iphone14 Features");
			i14.DisplayFeatures();
		}
		else if(ch==2) {
			Iphone15 i15=new Iphone15();
			System.out.println("Displaying Iphone15 Features");
			i15.DisplayFeatures();
		}
		else {
			System.out.println("Invalid Choice");
		}
		s.close();
	}
}

// Output
// Choose Any One:
// 1.iphone14
// 2.iphone15
// 1
// Displaying Iphone14 Features
// iPhone14 features: 6.1-inch display, A15 Bionic chip, Dual-camera system
// Choose Any One:
// 1.iphone14
// 2.iphone15
// 2
// Displaying Iphone15 Features
// iPhone15 features: 6.7-inch display, A16 Bionic chip, Triple-camera system
// Choose Any One:
// 1.iphone14
// 2.iphone15
// 3
// Invalid Choice
