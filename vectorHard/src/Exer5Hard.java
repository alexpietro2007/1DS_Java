
import java.util.Scanner;

public class Exer5Hard {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int tam = 15;
		int a[], b[], i, z;
		
		a = new int [tam];
		b = new int [tam];
		
		for(i = 0; i < tam; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor:");
			a[i] = in.nextInt();
			
		}
		for(i = 0; i < tam; i++) {
			if(a[i] == 1) {
				System.out.println("O Fatoria Desse Número 1 é 1");
			}else {
				z = a[i]-1;
				b[i] = a[i]*z;
				while (z > 1) {
					b[i] = b[i]*(z-1);
					z--;	
				}
				System.out.println("O Fatorial Desse Número "+a[i]+" é "+ b[i]);
			}
		}
		in.close();
	}
}