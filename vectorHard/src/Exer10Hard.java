import java.util.Arrays;
import java.util.Scanner;

public class Exer10Hard {
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		final int tam = 4;
		int a[], b[], i, x = tam-1;
		
		a = new int [tam];
		b = new int [tam+1];
		
		for(i = 0; i < tam; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor de A:");
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		for(i = 0; i < tam; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
