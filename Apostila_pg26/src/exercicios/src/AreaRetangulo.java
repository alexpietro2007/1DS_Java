import java.util.Scanner;

public class AreaRetangulo {
public static void main (String args[]) {
	Scanner ler = new Scanner (System.in);
	double x, y, area;
	
	System.out.println("Qual a Altura:");
	y = ler.nextDouble();
	
	System.out.println("Qual a Largura:");
	x = ler.nextDouble();
	
	area = x*y;
	
	System.out.println("A Área do Retângulo e de: "+area);
	ler.close();
}
}