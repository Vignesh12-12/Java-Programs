// Create a class named Welcome. Write constructors, to display a welcome
// message. Create 2 constructors. One to read user name as input and tell
// welcome with name. Another default constructor to print Welcome
// Guest.
// Program:

public class Welcome {
	Welcome() {
		System.out.println("Welcome Guest");
	}
	
	Welcome(String name){
		System.out.println("Welcome "+name);
	}

	public static void main(String[] args) {
		Welcome w1=new Welcome();
		Welcome w2=new Welcome("Jack");
	}
}

// Output:
// Welcome Guest
// Welcome Jack
