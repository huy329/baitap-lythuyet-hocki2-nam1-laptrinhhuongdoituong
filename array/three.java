//Find max value in the array.
package array;

import java.util.Scanner;

public class three {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		System.out.print("a: ");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int max = a[0];
		for(int i = 1; i < n; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}

		System.out.print("max: " + max);
	}
}
