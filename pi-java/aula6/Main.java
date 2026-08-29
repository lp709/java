//Programa para ver se um numero e impar ou nao;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;

		System.out.print("Digite Numero: ");
		num = input.nextInt();

		if(num % 2 == 0) {
			System.out.println("Numero Par");
		}else {
			System.out.println("Numero Impar");
		}
		
		input.close();
	}
}
