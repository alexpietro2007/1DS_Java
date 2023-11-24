import java.util.Scanner;

class Tabuada {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int i = 1;
		System.out.println("Insira o numero que vc deseja saber a tabuada:");
		int N = ler.nextInt();
		
		while (i<=10) {
			int r = N*i;
			System.out.println(N+"x"+i+" = "+r);
			i++;
		}
		
		
		ler.close();
	}
}
