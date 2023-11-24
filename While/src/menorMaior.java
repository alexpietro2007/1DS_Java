import java.util.Scanner;

class menorMaior {
	public static void main(String[] args) {
	
		int i = 1, n;
		int maior = 0, menor = 0;
		Scanner in = new Scanner (System.in);
		
		while(i <= 10) {
			
			System.out.println("Insira sua idade:");
			n = in.nextInt();
			if (n > 80) {
				System.out.println("Morto");
			}else {
			
			if (n >= 18) {
				System.out.println("Maior de idade");
				maior++;
			}else {
				System.out.println("Menor de idade");
				menor++;
			}
			}
			i++;
		}
		System.out.println("Tem "+ maior + " Pessoas maiores de idade e " + menor + " Menores de idade");
		in.close();
	}
}
