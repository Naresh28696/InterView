package Patterns;

public class pat1 {
	public static void main(String[] args) {
		int rows = 9;
		int time = 5;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=time;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<5) {
				time--;
			}else {
				time++;
			}
		}
		
	}
}
