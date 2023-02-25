import java.util.Scanner;
public class Exer3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);	
		
		System.out.printf("Número de Repetição: ");
		int a = leia.nextInt();	
		leia.nextLine();
		System.out.printf("Digite uma frase:");
		String s = leia.nextLine();
		for(int i=0; i<a;i++) {
			System.out.println(s);
		}		
	}
}
