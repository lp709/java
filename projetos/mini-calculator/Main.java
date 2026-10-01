import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);

        String mess = "\nO resultado da operacao e: ";

        //first number
        System.out.print("\nDigite um numero: ");
        double num1 = input.nextDouble();

        //second number
        System.out.print("Digite outro numero: ");
        double num2 = input.nextDouble();
        input.nextLine();

        //sinal
        System.out.println("\nExample: /; +; -; *; **");
        System.out.print("Qual e o operador: ");
        String opera = input.nextLine();

        if(opera.equals("/")) {
            System.out.println(mess + " " + (num1 / num2));
        }
        else if(opera.equals("+")) {
            System.out.println(mess + " " + (num1 + num2));
        }
        else if(opera.equals("*")){
            System.out.println(mess + (num1 * num2));
        }
        else if(opera.equals("-")) {
            System.out.println(mess + (num1 - num2));
        }

        input.close();
    }
    
}