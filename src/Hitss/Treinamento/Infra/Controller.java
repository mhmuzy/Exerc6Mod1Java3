package Hitss.Treinamento.Infra;

public class Controller {
	public static void Play() {
		
		double[] Nota = new double[4];
		Nota[1] = 7.0;
		Nota[2] = 8.5;
		Nota[3] = 7.5;
		
		System.out.println("");
		System.out.println("      Hitss Treinamento");
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("");
		for (int i = 1; i < Nota.length; i++) {
			ElaborarNota(i, Nota[i]);
		}
		System.out.println("");
		System.out.println("-------------------------------");
	
	}
	
	public static void ElaborarNota(int mat, double nota) {
		if (nota >= 0.0 && nota <= 2.9) {
			System.out.println("O(A) Aluno(a) " + mat + " Tirou: E");
		} else if(nota >= 3.0 && nota <= 4.9) {
			System.out.println("O(A) Aluno(a) " + mat + " Tirou: D");
		} else if(nota >= 5.0 && nota <= 6.9) {
			System.out.println("O(A) Aluno(a) " + mat + " Tirou: C");
		} else if(nota >= 7.0 && nota <= 8.9) {
			System.out.println("O(A) Aluno(a) " + mat + " Tirou: B");
		} else {
			System.out.println("O(A) Aluno(a) " + mat + " Tirou: A");
		} 
	}
}
