import java.util.InputMismatchException;
import java.util.Scanner;
public class Exer4 {

	public static void main(String[] args) {
		try{
		Scanner leia = new Scanner(System.in);	
		System.out.printf("Informe a altura do retângulo: ");
		float n1 = leia.nextFloat();
		
		System.out.printf("Informe a base do retângulo: ");
		float n2 = leia.nextFloat();
		float ar= n1*n2;
		float area = ar/2; 
		System.out.println("A área do retângulo é: "+ area+"cm².");
		float b = n1+n1;
		float a = n2+n2;
		float p = b+a;
		System.out.println("O perímetro do retângulo é: " + p +"cm.");		
		}catch(InputMismatchException e) {
			System.out.println("Informe os dados com vírgula !!! ");
		}		
	}//main
}//code