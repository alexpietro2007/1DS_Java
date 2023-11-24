import java.util.Scanner;

public class Exer7Hard {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int tam = 10;
		int a[], b[], c[], i, y = 1;
		
		a = new int [tam];
		b = new int [tam];
		c = new int [tam];
		for(i = 0; i < tam; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor de A:");
			a[i] = in.nextInt();
		}
		
		for(i = 0; i < tam; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor de B:");
			b[i] = in.nextInt();
		}
		
		for(i = 0; i < tam; i++) {
			if (a[i] != b[i]) {
				
			}
		}
		in.close();
	}
}