import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite O Seu Nome: ");
        String nome = input.nextLine();

        System.out.print("\nNota 1: ");
        double nota1 = input.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = input.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = input.nextDouble();

        //media
        double media = (nota1 + nota2 + nota3) /3;

        if(media > 10){
            System.out.println("\nNome " + nome);
            System.out.println("Media: " + media);
            System.out.println("Resultado: Aprovado!\n");
        }
        else {
            System.out.println("\nNome: " + nome);
            System.out.println("Media " + media);
            System.out.println("Resultado: Nao Aprovado\n");
        }

        input.close();
    }
}
