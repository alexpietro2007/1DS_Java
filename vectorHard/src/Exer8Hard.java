import java.util.Scanner;

public class Exer8Hard {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int tam = 10;
		int a[], i, x;
		
		a = new int [tam];
		for(i = 0; i < tam; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor de A:");
			a[i] = in.nextInt();
		}
		
		System.out.println("Insira O valor Que Deseja buscar:");
		x = in.nextInt();
		
		for(i = 0; i < tam; i++) {
			if (a[i] == x) {
				System.out.println("O valor "+x+" foi Encontrado no Vetor A");
				i = tam+1;
			}else {
				System.out.println("O valor "+x+" Não foi Encontrado no Vetor A");
				i = tam+1;
			}
		}
		in.close();
	}
}