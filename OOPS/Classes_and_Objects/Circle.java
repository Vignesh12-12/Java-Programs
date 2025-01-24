// Create a class named Circle. Should have one method to read input radius
// as input. Copy radius into a public variable. Using that public variable,
// calculate area and perimeter in 2 separate methods.
// Program:

public class Circle {
	int radius;
	public void setradius(int radius) {
		this.radius=radius;
	}
	
	public void area() {
		double area=3.14*radius*radius;
		System.out.printf("Area of a circle :%.2f",area);
	}
	
	public void perimeter() {
		System.out.println("\nperimeter of a circle :"+(2*3.14*radius));
	}

	public static void main(String[] args) {
		Circle c=new Circle();
		c.setradius(3);
		c.area();
		c.perimeter();
	}
}

// Output:
// Area of a circle :28.26
// perimeter of a circle :18.84
