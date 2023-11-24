package exer5_8;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n;
		System.out.println("Insira o Numero desejado :");
		n = in.nextInt();
		int i = n;
		while (i >= 2) {
			n = n*(i-1);
			i--;
		}
		System.out.println("O Fatorial é : "+n);
		in.close();
	}
}
