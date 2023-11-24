import java.util.Scanner;

public class Exer1 {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
		int a[][], i, j, g = 0;
		a = new int [4][4];
		
		for(i=0;i<4;i++){
			
			for(j=0;j<4;j++){
				
				if(j==0 && i==0){
					a[0][0] = 2;
					System.out.print(a[i][j]+" ");
					g = a[i][j];
				}else{
					a[i][j] = g*2;
					System.out.print(a[i][j]+" ");
					g = a[i][j];
				}
				
			}
			System.out.println(" ");
		}
	}
}
	