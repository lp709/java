//Programa para verificar se o numero e negativo ou positivo;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a int number: ");
		int inteiro = input.nextInt();

		if (inteiro == 0) {
			System.out.println("Zero");
		}else if(inteiro < 0) {
			System.out.println("Numero Negativo");
		}else {
			System.out.println("Numero Positivo");
		}
		
		input.close();
	}
}
