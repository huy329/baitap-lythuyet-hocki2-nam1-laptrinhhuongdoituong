//Capitalize the first character in each word of the name.
package string;

import java.util.*;
import java.lang.*;

public class five {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("s: ");
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		
		c[0] -= 32;
		int i;
		for(i = 1; i < c.length; i++) {
			if(c[i] == ' ' && c[i+1] != ' ' && c[i+1] >= 'a' && c[i+1] <= 'z') {
                c[i+1] -= 32;
            }
        }
		
		s = String.valueOf(c);
		System.out.print(s);
	}
}
