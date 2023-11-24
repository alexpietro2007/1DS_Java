import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int tam = 10;
		int a[], b[], c[], i;
		int cont = (tam - 2);
		
		a = new int[tam];
		b = new int[tam];
		c = new int[tam];
		
		for (i = 0; i<tam; i++) {
			System.out.println("Insira o "+ (i + 1)+"° Valor de A:");
			a[i] = in.nextInt();
		}

		for (i = 0; i<tam; i++) {
			System.out.println("Insira o "+ (i + 1)+"°  Valor de B:");
			b[i] = in.nextInt();
			c[i] = a[i] + b[i];
		}
		
		System.out.print("A[] = ( ");
		for (i = 0; i<tam; i++) {
			if (i>cont) {
				System.out.println(a[i] + ")");
			}else {
				System.out.print(a[i] + ", ");
			}
		}
		
		System.out.print("B[] = ( ");
		for (i = 0; i<tam; i++) {
			if (i>cont) {
				System.out.println(b[i] + ")");
			}else {
				System.out.print(b[i] + ", ");
			}
		}
		
		System.out.print("Os Valores Somados São: ");
		
		System.out.print("C[] = ( ");
		for (i = 0; i<tam; i++) {
			if (i>cont) {
				System.out.print(c[i] + ")");
			}else {
				System.out.print(c[i] + ", ");
			}
		}
		
	}
}
