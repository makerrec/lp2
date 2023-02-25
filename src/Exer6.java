import java.util.Scanner;
public class Exer6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Exer1 a = new Exer1 ();
		Exer2 b = new Exer2 ();
		Exer3 c = new Exer3 ();
		Exer4 d = new Exer4 ();
		Exer5 e = new Exer5 ();	
		
		System.out.println("Escolha Exercicio de Execução\n"
				+ " \t[1]Diga Olá \n"
				+ "	[2]Repetindo a Frase \n"
				+ "	[3]Repetindo a Frase v2 \n"
				+ "	[4]Geometria \n"
				+ "	[5]Bidimensional \n"
				+ "	[0]Sair");
		int op= leia.nextInt();
		while (op!= 0) {
			
			if (op == 1  ) {
				a.main(null);
			}			
			if (op == 2  ) {
				b.main(null);
			}			
			if (op == 3  ) {
				c.main(null);
			}			
			if (op == 4  ) {
				d.main(null);
			}			
			if (op == 5  ) {
				e.main(null);
			}						
			System.out.println("\nEscolha Exercicio de Execução\n"
					+ " \t[1]Diga Olá \n"
					+ "	[2]Repetindo a Frase \n"
					+ "	[3]Repetindo a Frase v2 \n"
					+ "	[4]Geometria \n"
					+ "	[5]Bidimensional \n"
					+ "	[0]Sair");
			op= leia.nextInt();			
		}//while
	}//main	
}//code