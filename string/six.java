/*
Formalize the name, including:
	Delete all spaces in front and behind of the name.
	Leave one space between the words of the name.
*/
package string;

import java.util.*;
import java.lang.*;

public class six {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("s: ");
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		
		int i, j;
		for(i = 0; i < c.length; i++) {
			if(c[i] != 32) {
				break;
			} else {
				for(j = i; j < c.length - 1; j++) {
					c[j] = c[j+1];
				}
				i--;
				c[c.length-1] = '\0'; 
			}
		}
		
		for(j = c.length; j > 0; j--) {
			if(c[i] != 32) {
				break;
			} else {
				c[i] = '\0';
			}
		}
		
		s = String.valueOf(c);
		System.out.print(s);
		System.out.print(s.length());
	}
}
