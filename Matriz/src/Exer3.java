import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
			int a[][], i, j;
			a = new int [3][4];
			for (i = 0; i<3; i++) {
				for (j = 0; j<3; j++) {
					System.out.println("Insira O Valor Da "+(i+1)+" linha e "+(j+1)+" coluna");
					
					a[i][j] = in.nextInt();
					a[i][3] = a[i][j] + a[i][3];
				}
			}
			
			for (i = 0; i<3; i++) {
				System.out.println("A soma Dos Valores da "+(i+1)+" linha é : "+a[i][3]);
			}
	}
}