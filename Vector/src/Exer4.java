import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int tam = 10;
		int a[], i;
		double b = 0;
		
		a = new int [tam];
		
		for (i = 0; i<tam; i++) {
			System.out.println("Entre com o "+ (i + 1) + "° valor:");
			a[i] = in.nextInt(); 
			b = b + a[i];
		}
		
		b = b / tam;
		
		System.out.println("A Média é: "+ b);
	}
}