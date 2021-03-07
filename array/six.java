//Sort the array in ascending order.
package array;

import java.util.Scanner;

public class six {
    public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		int[] a = new int[n];
	
		System.out.print("a: ");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		} 
        
		int temp;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) { 
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        System.out.print("sort >: ");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

