import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int tam = 3;
		int a[], b[], i, inv = tam - 1;
		
		a = new int [tam];
		b =  new int [tam];
		
		for (i = 0; i<tam; i++) {
			System.out.println("Entre com o "+ (i + 1) + "° valor:");
			a[i] = in.nextInt(); 
			b[inv] = a[i];
			inv--;
		}
		
		for ( i = 0; i<tam; i++) {
			if (i > 0){
				System.out.print(b[i] + " ");
				}else {
					System.out.print( "o valores ao Invertidos São : " + b[i] + " ");
				}
			}
		in.close();
		
		in.close();
	}
	
}
