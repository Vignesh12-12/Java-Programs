// 1. Create a class for Calculator. Write methods for finding sum, difference,
// product and quotient. All methods should take 2 numbers as input and
// return one integer.
// program:

public class Calculator {
	int num1,num2;
	public void add(int num1,int num2) {
		System.out.println("Addition ="+(num1+num2));	
	}
	
	public void subtract(int num1,int num2) {
		System.out.println("Subtraction ="+(num1-num2));	
	}
	
	public void multiply(int num1,int num2) {
		System.out.println("Multiplication ="+(num1*num2));	
	}
	
	public void divide(int num1,int num2) {
		System.out.println("Division ="+(num1/num2));	
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(10, 5);
		c.subtract(10, 5);
		c.multiply(10, 5);
		c.divide(10, 5);
	}
}

// Output:
// Addition =15
// Subtraction =5
// Multiplication =50
// Division =2
