//List negative values in the array.
package array;

import java.util.Scanner;

public class two {
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
					System.out.println("negative: " + a[i]);
				}
			}  
	  }
}
