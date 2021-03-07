//Input and Output a 1D-Array with n integer values.
package array;

import java.util.Scanner;

public class one {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		int[] a = new int[n];
	
		System.out.print("a: ");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		} 
	 
		System.out.print("print: ");
	    for(int i = 0; i < n; i++) {
	        System.out.print(a[i] + " ");
	    }
	}
}
