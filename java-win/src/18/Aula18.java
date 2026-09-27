import java.util.Scanner;

public class Aula18 {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Qual e o seu nome?: ");
        String nome = Scanner.nextLine();

        System.out.print("Qual e a sua idade?: ");
        int idade = Scanner.nextInt();

        System.out.println("Ola " + nome + ", voce tem " + idade + ", Seja Bem-vindo!!");

    }

}
