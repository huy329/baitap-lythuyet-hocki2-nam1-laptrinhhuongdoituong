//Add an element x to the first postion of the array
package bai;

import java.util.Scanner;
import java.lang.*;

public class seven {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		int[] a = new int[n+1];
	
		System.out.print("a: ");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}    
	    
	    System.out.print("x: ");
	    int x = sc.nextInt();
	    
	    for(int i = n; i > 0; i--) {
	    	a[i] = a[i-1];
	    }
	    
	    a[0] = x;
	    
	    System.out.print("a add x: ");
	    for(int i = 0; i < n+1; i++) {
	    	System.out.print(a[i] + " ");
	    }
	}
}
