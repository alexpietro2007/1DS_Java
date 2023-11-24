import java.util.Scanner;

public class Exer1Hard {
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		final int tam = 10;
		int a[], b[], i, f = 0;
		
		a = new int[tam];
		b = new int[tam];
		
		for (i = 0; i < tam; i++) {
			System.out.println("insira o "+ (i + 1) +"° Número:");
			a[i] = in.nextInt();
		}
		
		for (i = 0; i < tam; i++) {
			if(a[i]%2 == 0) {
				b[f] = a[i];
				f++;
			}
		}
		
		for (i = 0; i < tam; i++) {
			if(a[i]%2 > 0) {
				b[f] = a[i];
				f++;
			}
		}
		f = 1;
		for(i = 0; i < tam; i++) {
			if(b[i]%2 == 0) {
				if (f == 1) {
					f = 0;
					System.out.println("Esse São Numeros Pares:");
					System.out.println(b[i]);
				}else {
					System.out.println(b[i]);
				}
			}else {
				if (f == 0) {
					f = 1;
					System.out.println("Esse São Numeros impares:");
					System.out.println(b[i]);
				}else {
					System.out.println(b[i]);
				}	
			}
		}
		in.close();
	}
}
