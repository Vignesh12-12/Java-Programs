// Complete the code given below.
// public class Arrange
// {
// public String[] sort(String[] s)
// {
// write code to arrange string array in
// alphabetical order.
// return s;
// }
// public int[] sort(int[] a)
// {
// write code to arrange integer array in
// ascending order
// return a;
// }
// public static void main(String args[])
// {
// Write code to create object.
// Call two methods with necessary inputs.
// Display output here.
// }
// }
// Program:

public class Arrange {
	public void sort(String[] s)
	{
		for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].compareTo(s[j]) > 0) { 
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println("Sorted strings are:");
        for (String str : s) {
            System.out.print(str + " ");
        }
        System.out.println();
	}
	public void sort(int[] a)
	{
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted numbers are:");
		for(int n:a) {
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		Arrange arrange=new Arrange();
		int[] numarr= {5,8,3,7,2};
		String[] strarr= {"abi","preethi","jack","swetha"};
		arrange.sort(strarr);
		arrange.sort(numarr);
	}
}
// Output:
// Sorted strings are:
// abi jack preethi swetha
// Sorted numbers are:
// 2 3 5 7 8

