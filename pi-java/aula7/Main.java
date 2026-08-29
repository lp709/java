//Programa para ver se o numero e par/impar e se e negaivo/positivo;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um numero: ");
		numero = input.nextInt();

		//Negativo/Positivo
		if(numero < 0) {
			System.out.println("Negativo");
		}else if(numero == 0) {
			System.out.println("Zero");
		}else {
			System.out.println("Positivo");
		}
	       
		//Par/Impar
		if(numero % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		
		input.close();
	}
}
