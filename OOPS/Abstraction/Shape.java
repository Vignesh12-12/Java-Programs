// Create an abstract class called Shape that includes an abstract method calculateArea and 
// a concrete method displayShapeName to display the name of the shape. Then, create two derived classes called Circle 
// and Rectangle. The Circle class should have an attribute radius, and the Rectangle class should have attributes length 
// and width. Implement the calculateArea method in both derived classes to calculate the area of the respective shapes. 
// Demonstrate how to create instances of Circle and Rectangle, calculate their areas, and display their names and areas.   
// Solution Outline
// 1. Abstract Class (Shape): Define the abstract method calculateArea and the
// concrete method displayShapeName.
// 2. Derived Class (Circle): Inherit from Shape, add the radius attribute, and
// implement the calculateArea method.
// 3. Derived Class (Rectangle): Inherit from Shape, add the length and width
// attributes, and implement the calculateArea method.
// 4. Instances: Create instances of Circle and Rectangle, and use methods to
// display their names and calculate their areas.

// program:

import java.util.Scanner;

abstract class Shape{
	void DisplayShapeName(String shape) {
		System.out.println("Shape:"+shape);
	}
	abstract void CalculateArea();
}

class Circlee extends Shape{
	double pi=3.14,r,area;
	public Circlee(double r){
		this.r=r;
	}
	void CalculateArea(){
		area=pi*r*r;
		System.out.println("--------------------");
		DisplayShapeName("Circle");
		System.out.println("The Area of Circle:"+area);
	}
}
public class Rectangle extends Shape{
	int length,width,area;
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
	}
	void CalculateArea() {
		area=length*width;
		System.out.println("--------------------");
		DisplayShapeName("Rectangle");
		System.out.println("The Area of the Rectangle:"+area);
	}
	
	public static void main(String[] args) {
		System.out.println("Choose the operation for:\n1.Circle\n2.Rectangle");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		if(choice==1) {
			System.out.println("Enter the Radius");
			double r=s.nextDouble();
			Circlee c=new Circlee(r);
			c.CalculateArea();
		}
		else if(choice==2) {
			System.out.println("Enter the Length");
			int length=s.nextInt();
			System.out.println("Enter the width");
			int width=s.nextInt();
			Rectangle r=new Rectangle(length,width);
			r.CalculateArea();
		}
		else {
			System.out.println("operation is invalid.Enter 1 or 2");
			}
		s.close();
		}
}

// Output:
// Choose the operation for:
// 1.Circle
// 2.Rectangle
// 1
// Enter the Radius
// 5
// --------------------
// Shape:Circle
// The Area of Circle:78.5
//
// Choose the operation for:
// 1.Circle
// 2.Rectangle
// 2
// Enter the Length
// 5
// Enter the width
// 6
// --------------------
// Shape:Rectangle
// The Area of the Rectangle:30

