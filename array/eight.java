//Delete the first greater 0 element in the array.
package bai;

import java.util.Scanner;

public class eight {
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
				for(int j = i; j < n-1; j++) {
					a[j] = a[j+1];
				}
				break;
			}
		}  
		
		System.out.print("delete first a[i] < 0: ");
		for(int i = 0; i < n-1; i++) {
            System.out.print(a[i] + " ");
        }
	}
}
