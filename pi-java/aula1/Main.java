//Programa para verificar a idade;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		int idade = scanner.nextInt();
		
		if(idade > 0 && idade <= 13) {
		     	System.out.println("voce e crianca");
		}else if(idade >= 14 && idade <= 17) {
			System.out.println("voce e adolescente");
		}else {
			System.out.println("voce e adulto");
		}

  }
}
