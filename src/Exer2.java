import java.util.Scanner;
public class Exer2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.printf("Digite um nome: ");
		String s = leia.nextLine();
		System.out.printf("Número de repetições: ");
		int a = leia.nextInt();		
		for(int i = 0; i < a; i++) {
			System.out.println(s);
		}
	}
}
