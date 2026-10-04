import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //INPUT
        Scanner input = new Scanner(System.in);
        
        //USER
        Pessoas[] user = new  Pessoas[3];
        
        user = new Pessoas();
        user.setName("admin");
        user.setPasswd("admin_lp709");

        user = new Pessoas();
        user.setName("Edvaldo Pinheiro");
        user.setPasswd("123456789");

        user = new Pessoas(); 
        user.setName("Esmyvalda Pinheiro"); 
        user.setPasswd("123456789");

        System.out.println("\n=============================\n");
        System.out.println("         BANK SYSTEM      ");
        System.out.println("\n=============================\n");

        //OPCOES
        String consultar, depositar, levantar, sair;
        consultar = "0. Consular Saldo";
        depositar = "1. Depositar Dinheiro";
        levantar = "2. Levantar Dinheiro";
        sair = "3. Sair";
        System.out.println(consultar + "\n" + depositar + "\n" + levantar + "\n" + sair + "\n");

        System.out.print("Escolha Uma Opcao: ");
        String opcao = input.nextLine();

        if (opcao.equals("0")) {
            System.out.print("Enter your name: ");
            String name = input.nextLine();
        }

        input.close();
    }
}