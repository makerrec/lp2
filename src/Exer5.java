import java.util.Scanner;
public class Exer5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Uma Palavra: ");
		String s = leia.nextLine();		
		
		System.out.println("Nº de linha: ");
		int al = leia.nextInt();
		System.out.println("Nº de coluna: ");
		int ac = leia.nextInt();
		
		for(int l=0; l<al; l++ ) {
			for(int c=0; c<ac; c++) {				
				System.out.printf("\t %s \t", s);
			}			
			System.out.println();
		}	
	}
}