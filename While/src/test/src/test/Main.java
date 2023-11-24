package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double N, A, I;
		
		N = in.nextDouble();
		A = N;
			N = N/100;
			N = Math.floor(N);
			I = A - N;
			System.out.printf("%.0f nota(s) de R$ 100.00\n", N);
			N = (A%100)/50;
			N = Math.floor(N);
			System.out.printf("%.0f nota(s) de R$ 50.00\n", N);
			N = ((A%100)%50)/20;
			N = Math.floor(N);
			System.out.printf("%.0f nota(s) de R$ 20.00\n", N);
			N = (((A%100)%50)%20)/10;
			N = Math.floor(N);
			System.out.printf("%.0f nota(s) de R$ 10.00\n", N);
			N = ((((A % 100) % 50) % 20) % 10 ) / 5;
			N = Math.floor(N);
			System.out.printf("%.0f nota(s) de R$ 5.00\n", N);
			N = (((((A % 100)% 50)% 20)%10)%5)/2;
			N = Math.floor(N);
			System.out.printf("%.0f nota(s) de R$ 2.00\n", N);

			System.out.println("MOEDAS:");
			
			N = (((((A % 100)% 50)% 20)%10)%5)/1;
			N = Math.floor(N);
			System.out.printf("%.0f nota(s) de R$ 1.00\n", N);
			N = ((((((A % 100)% 50)% 20)%10)%5)%1)/0.50;
			N = Math.floor(N);
			System.out.printf("%.0f nota(s) de R$ 0.50\n", N);
			
			N = (((((((A % 100)% 50)% 20)%10)%5)%1)%0.50)/0.25;
			N = Math.floor(N);
			System.out.printf("%.0f nota(s) de R$ 0.25\n", N);
			N = ((((((((A % 100)% 50)% 20)%10)%5)%1)%0.50)%0.25)/0.10;
			N = Math.floor(N);
			System.out.printf("%.0f nota(s) de R$ 0.10\n", N);
			N = (((((((((A % 100)% 50)% 20)%10)%5)%1)%0.50)%0.25)%0.10)/0.05;
			N = Math.floor(N);
			System.out.printf("%.0f nota(s) de R$ 0.05\n", N);
			N = (((((((((A % 100)% 50)% 20)%10)%5)%1)%0.50)%0.25)%0.05)/0.01;
			N = Math.floor(N);
			System.out.printf("%.0f nota(s) de R$ 0.01\n", N);
		in.close();	
	}
}
