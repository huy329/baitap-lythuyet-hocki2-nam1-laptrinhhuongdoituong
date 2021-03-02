//Return a last name.
package s;

import java.util.*;

public class three {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("s: ");
		String s = sc.nextLine();
		
		char ten;
		int i;
		
		System.out.print("last: ");
		for(i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) == ' ') {
				break;
			}
		}
		
		for(i = i + 1; i < s.length(); i++) {
			ten = s.charAt(i);
			System.out.print(ten);
		}
	}
}
