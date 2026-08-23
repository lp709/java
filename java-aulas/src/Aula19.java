import java.util.Random;
import java.util.Scanner;

public class Aula19 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num = random.nextInt(100) + 1;

        System.out.print("Digite um numero: ");
        int rNum = scanner.nextInt();

        while (rNum != num) {



            if (rNum == num) {

                System.out.println("Prabens voce acertou");

            } else if (rNum > num) {

                System.out.println("Muito Alto");

            } else if (rNum < num) {

                System.out.println("Muito Baixo");

            }

            System.out.print("Digite um numero: ");
            rNum = scanner.nextInt();

        }

    }

}
