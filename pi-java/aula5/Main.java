//Programa para verificar se um numero e maior ou igual ao outro;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Digite Um Numero: ");
		num1 = input.nextInt();

		System.out.print("Digite outro numero: ");
		num2 = input.nextInt();
		
		if(num1 > num2) {
			System.out.println("Entre " + num1 + " e " + num2 + ", o  maior e: " + num1);
		}else if(num1 < num2) {
			System.out.println("Entre " + num1 + " e " + num2 + ", maior e: " + num2);
		}else if(num1 == num2) {
			System.out.println("Os dois numeros sao iguais");
		}	
		
		input.close();
	}
}
