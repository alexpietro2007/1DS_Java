import java.util.Scanner;

public class Exer1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int tam = 10;
		int a[], b[], i;
		
		a = new int [tam];
		b =  new int [tam];
		
		for (i = 0; i<tam; i++) {
			System.out.println("Entre com o "+ (i + 1) + "° valor:");
			a[i] = in.nextInt(); 
			b[i] = a[i] * a[i];
 		}
		for ( i = 0; i<tam; i++) {
			if (i > 0){
				System.out.print(b[i] + " ");
				}else {
					System.out.print( "o valores ao Quadrado São :" + b[i] + " ");
				}
			}
		in.close();
	}
	
}
