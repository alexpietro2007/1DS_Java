import java.util.Scanner;

public class Exer2Hard {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int tam = 5;
		int a[], i, guard, tab = 1;	
		
		a = new int [tam];
		
		for(i = 0; i < tam; i++) {
			System.out.println("Entre com o "+ (i + 1) + "° valor:");
			a[i] = in.nextInt(); 
		}
		
		for(i = 0; i < tam; i++) {
			while(tab<11) {
				guard = a[i] * tab;
				System.out.println(tab + " x " + a[i] + " = "+ guard);
				tab++;
			}
			System.out.println();
			tab = 1;
		}
		in.close();
	}
}
