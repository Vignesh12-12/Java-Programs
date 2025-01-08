// Read n number of strings as input and arrange in alphabetical order.
// Program:

import java.util.Scanner;
import java.lang.String;
public class Strings4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number of inputs:");
		int n=scanner.nextInt();
		scanner.nextLine();
		String[] s1=new String[n];
		System.out.println("Enter the values");
		for(int i=0;i<n;i++) {
			s1[i]=scanner.nextLine();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++){
				if(s1[j].compareTo(s1[j+1])>0) {
					String temp=s1[j];
					s1[j]=s1[j+1];
					s1[j+1]=temp;
				}
			}
		}
		System.out.println("Strings in alphabetical order:");
        for (String str : s1) {
            System.out.println(str);
        }
        scanner.close();
	}
}
