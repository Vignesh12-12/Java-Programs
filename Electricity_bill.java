// Read units consumed as input and calculate the charges to be paid.
// Follow the rate calculation as per the given table.
// Units               Rate
// 1 -100          Free of cost
// 101 -200        0.80 per unit
// 201 -300        1.00 per unit
// 301 -400        1.20 per unit
// >400            2.00 per unit

// Program:
package topic0;
import java.util.Scanner;
public class Electricity {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the units consumed:");
		int units=scanner.nextInt();
		double bill=0;
        if (units <=100 )
        {
            bill = 0;
        }
        else if(units >=101 && units<=200)
        {
            bill = (units - 100) * 0.80;
        }
        else if (units >= 201 && units <=300)
        {
            bill = (units - 200) * 1 + (100 * 0.80);
        }
        else if (units >= 301 && units <=400)
        {
            bill = (units - 300) * 1.20 + (100 * 1) + (100 * 0.80);
        }
        else {
        	bill=(units-400)*2 + (100*1.20)+(100*1)+(100*0.80);
        }
        System.out.println("Total Bill "+bill);
	}
}
