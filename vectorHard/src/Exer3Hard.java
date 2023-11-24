import java.util.Scanner;

public class Exer3Hard {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int tam = 10;
		int a[], i;
		
		a = new int [tam];
		
		for(i = 0; i < tam; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor:");
			a[i] = in.nextInt();
			
		}
		for(i = 0; i < tam; i++) {
			if(a[i] == 2 || a[i] == 3) {
				System.out.println(a[i]+ " É Primo");
			}else {
				if (a[i] % 2 == 0) {
					System.out.println(a[i]+ " Não É Primo");
				}else {
					if(a[i]%3 == 0) {
						System.out.println(a[i]+ " Não É Primo");
					}else {
						System.out.println(a[i]+ " É Primo");
					}
				}
			}
		}
	}
}