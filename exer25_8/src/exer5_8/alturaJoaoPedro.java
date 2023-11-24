package exer5_8;

public class alturaJoaoPedro {
	public static void main(String[] args) {
		double joao = 1.34, pedro = 1.45;
		int i = 0;
		joao = joao*100*10;
		pedro = pedro*100*10;
		while (joao < pedro) {
			joao = joao + 2.5*10;
			pedro = pedro + 2*10;
			i++;
		}
		System.out.println(i);
	}
}
