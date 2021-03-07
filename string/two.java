//Return a first name.
package string;

import java.util.*;
import java.lang.*;

public class two {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("s: ");
		String s = sc.nextLine();
		
		char ho;
		int i;
		
		System.out.print("first: ");
		for(i = 0; i < s.length(); i++) {
			ho = s.charAt(i);
			System.out.print(ho);
			if(s.charAt(i) == ' ') {
				break;
			}
		}
	}
}
