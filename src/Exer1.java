import java.util.Scanner;
public class Exer1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.printf("Digite seu nome: ");
		String s = leia.nextLine();
		System.out.println("Olá, "+s+"!");
	}
}