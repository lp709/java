import java.util.Scanner;

public class Aula17 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("==Transformador de nome para maisculo==");

        System.out.print("Digite o seu nome em letras minusculas: ");
        String nome = Scanner.nextLine();

        String up = nome.toUpperCase();
        System.out.println("Isso pode demorar 10 segundos");

        int Segundos = 1;

        while(Segundos <= 10) {
            System.out.println(Segundos);
            Segundos++;
        }

        System.out.println("Resultado: " + up);

    }
}
