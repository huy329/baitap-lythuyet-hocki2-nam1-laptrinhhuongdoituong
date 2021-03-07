//Return a middle name.
package string;

import java.util.*;

public class four {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("s: ");
		String s = sc.nextLine();
		
		char dem;
		int i, j;
		
		System.out.print("dem: ");
		for(j = 0; j < s.length(); j++) {
			if(s.charAt(j) == ' ') {
				break;
			}
		}
		
		for(i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) == ' ') {
				break;
			}
		}
		
		for(j = j + 1; j < i; j++) {
			dem = s.charAt(j);
			System.out.print(dem);
		}
	}
}
