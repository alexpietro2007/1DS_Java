package test;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 
		int i, a = 0, b = 1, c = 0;
		
		System.out.println("insira o numero: ");
		i = in.nextInt();
		if (i == 1) {
			System.out.println("1");
		}else
			if (i < 1) {
				System.out.println("N�mero Inv�lido");
			}else {
		System.out.print("1" + " ");
		i = i - 1;
		while(i > 0) {
			c = a + b;
			System.out.print(c+" ");
			i--;
			if (i > 0) {
				a = c + b;
				System.out.print(a+" ");
				i--;
				if (i > 0) {
					b = a + c;
					System.out.print(b+" ");
					i--;
				}
			}
		}
			}
		in.close();
	}
}
	