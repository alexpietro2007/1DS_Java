import java.util.Scanner;

public class Exer9Hard {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int tam = 10;
		int a[], i, cont= tam - 1,y = 0;
		
		a = new int [tam];
		
		for(i = 0; i < tam; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor de A:");
			a[i] = in.nextInt();
		}
		
		for (i = 0; i < tam; i++) {
			if(a[i] == a[cont]) {
				y++;
				cont--;
			}else {
				System.out.println("Esse Número Não é um Palíndromo");
				i = tam + 1;
			}
		}
		if(y == tam) {
			System.out.println("Esse Nuúmero é um Palíndromo");
		}
		in.close();
	}
}