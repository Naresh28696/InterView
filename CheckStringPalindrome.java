package Patterns;

import java.util.Scanner;

public class CheckStringPalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String = ");
		String str = scan.next();
		int len = str.length();
		boolean flag = true;
		
		for(int i=0;i<len/2;i++) {
			if(str.charAt(i) != str.charAt(len-i-1)) {
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println(str + " is a palindrome string.");
		}else {
			System.out.println(str + " is a not palindrome string.");
		}
	}
}
