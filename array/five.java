//Caculate sum of values in the array.
package bai;

import java.util.Scanner;

public class five {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		int[] a = new int[n];
	
		System.out.print("a: ");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		} 

		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum = sum + a[i]; 
		}		
		System.out.print("sum: " + sum);
	}
}
