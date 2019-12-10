package Patterns;

import java.util.Scanner;

public class checkPefectSquare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int num = scan.nextInt();
		
		boolean result = checkPerfactSqr(num);
		if(result) {
			System.out.println("Given Number Is Perfact Squre Number.");
		}else {
			System.out.println("Given Number Is Not Perfact Squre Number.");
		}
	}
	
	public static boolean checkPerfactSqr(int num) {
		int sr = num/2;
		boolean flag = false;
		int sqr;
		int temp = sr;
		do {
			 sqr = temp * temp;
			
			if(sqr == num) {
				flag = true;
				break;
			}
			
			temp--;
		}while(temp != 0);
		
		return flag;
	}
}
