package InstaPostSolutions;

public class ZohoPat1 {
	public static void main(String[] args) {
		int rows =10;
		int timeR =10;
		int spaceL =0;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=spaceL;j++) {
				System.out.print(" ");
			}
			int count = i;
			for(int k=1;k<=timeR;k++) {
				System.out.print(count+" ");
				count = count+rows-k+1;
			}
			System.out.println();
			
			spaceL++;
			timeR--;
		}
		
	}
}
