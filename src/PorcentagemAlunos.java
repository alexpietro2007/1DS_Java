
public class PorcentagemAlunos {
	public static void main (String[] angs) {
		
		double menina, menino, alunos, meninaP, meninoP;
		menina = 32;
		menino = 8;
		alunos = menina+menino;
		meninaP = (menina/alunos)*100;
		meninoP = (menino/alunos)*100;
		
		System.out.println ("Quantidade de alunos: "+alunos);
		System.out.println ("Porcentagem de meninas: "+meninaP+" porcento");
		System.out.println ("Porcentagem de meninos: "+meninoP+" porcento");
		
	}

}
