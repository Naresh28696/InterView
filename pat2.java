package Patterns;

public class pat2 {
	public static void main(String[] args) {
		int rows = 5;
		int timeR = 5;
		int spaceL =0;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=spaceL;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=timeR;k++) {
				System.out.print("*");
			}
			System.out.println();
			
			spaceL++;
		}
	}
}
