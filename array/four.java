//Find the first position of negative values in the array.
package bai;

import java.util.Scanner;

public class four {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		int[] a = new int[n];
	
		System.out.print("a: ");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		} 
	
		for(int i = 0; i < n; i++) {
			if(a[i] < 0) {
				System.out.println("first negative: " + a[i]);
				break;
			}
		}  
	}
}

