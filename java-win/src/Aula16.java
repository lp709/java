import java.util.Scanner;

public class Aula16 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Qual e o  seu nome: ");
        String nome = Scanner.nextLine();

        System.out.println("Ola " + nome);

        System.out.print("Que horas sao?:");
        int hora = Scanner.nextInt();

        if (hora >= 5 && hora <= 13) {
            System.out.print("Tenha um bom dia");
        } else {
            System.out.print("fodase");
        }

    }
}
