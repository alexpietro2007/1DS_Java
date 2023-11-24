import java.util.Scanner;

public class Exer6Hard {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int tam = 10;
		int a[], b[], c[], i, y = 1, z;
		
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
			for(z = 0; z < tam; z++) {
				if(a[i]==b[z]) {
					if(y == 1) {
						System.out.println("Os Numeros que Aparecem No A e B São: \n" + a[i]);
						y--;
						c[i] = a[i];
					}else {
					System.out.println(a[i]);
					c[i] = a[i];
					}
				}
			}
		}
		in.close();
	}
}