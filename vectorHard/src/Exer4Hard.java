import java.util.Scanner;

public class Exer4Hard {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int tam = 11;
		int a[], i;
		
		a = new int[tam];
		
		for (i = 0; i<tam; i++) {
			a[i] = (int) Math.pow(2 , i);
			System.out.println(a[i]);
		}
		in.close();
	}
}
