package exer5_8;

import java.util.Scanner;

public class expoente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, e, f;
		
		System.out.println("leia o numero: ");
		n = in.nextInt();
		
		System.out.println("leia o expoente: ");
		e = in.nextInt();
		f = n;
		while (e > 1) { 
			n = f*n;
			e--;
		}
		System.out.println(n);
		in.close();
	}
}
