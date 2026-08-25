import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual e o seu nome?: ");
		String nome = scanner.nextLine();

		System.out.print("Qual e a tua idade?: ");
		int idade = scanner.nextInt();

		System.out.print("Qual e o seu slario?: ");
		double salario = scanner.nextDouble();

		//Nome 
		System.out.println("Ola Senhor " + nome + " Seja Bem-Vindo");

		//Idade
		if(idade >= 15 && idade <= 17) {
			System.out.println("Voce ainda e um adolescente");
		}else if(idade > 0 && idade < 15) {
			System.out.println("Voce e uma crianca");
		}else {
			System.out.println("Voce e maior de idade");
		}

		//Salario
		if(salario < 1000) {
			System.out.println("Infelizmente Voce Tem Um Salario Baixo");
		}else if(salario > 1000 && salario < 2000) {
		       System.out.println("Voce tem Um Salario medio, Parabens");
		}else {
	 		System.out.println("Voce Tem Um Salario Alto, Parabens");
		}
	}
}	
