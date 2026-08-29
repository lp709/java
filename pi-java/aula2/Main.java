//Programa para verificar se tem salario alto;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual e o seu nome?: ");
		String nome = scanner.nextLine();

		System.out.print("Qual e a tua idade?: ");
		int idade = scanner.nextInt();

		System.out.print("Qual e o seu salario?: ");
		double salario = scanner.nextDouble();

		//Nome
		nome = nome.toUpperCase(); 
		System.out.println("Ola Senhor, " + nome + " Seja Bem-Vindo!");

		//Idade
		if(idade == 0) {
			System.out.println("Idade Invalida");
		}else if(idade >= 1 && idade <= 12) {
			System.out.println("Voce e uma crianca");
		}else if(idade >= 13 && idade <= 17) {
			System.out.println("Voce e adolescente");
		}else {
			System.out.println("Voce e maior de idade");
		}

		//Salario
		if(salario <= 0) {
			System.out.println("Salario invalido");
		}else if(salario < 1000) {
			System.out.println("Infelizmente Voce Tem Um Salario Baixo");
		}else if(salario >= 1000 && salario <= 1999.99) {
		       System.out.println("Voce tem Um Salario medio, Parabens");
		}else {
	 		System.out.println("Voce Tem Um Salario Alto, Parabens");
		}
	}
}	
