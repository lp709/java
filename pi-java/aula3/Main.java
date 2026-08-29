//Programa para verificar se e crianca adolescente ou maior de idade;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int idade = input.nextInt();
		
		if(idade < 13) {
			System.out.println("You are a child");
		}else if(idade >= 13 && idade <= 17) {
			System.out.println("You are a teenager");
		}else {
			System.out.println("You are an adult");
		}

		input.close();
	}
}
