import java.util.Scanner;

public class Main {
    private static int lerOpcao(Scanner input) {
        while (true) {
            System.out.print("Escolha uma opção: ");
            String entrada = input.nextLine();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Digite um número.");
            }
        }
    }

    private static double lerValor(Scanner input, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = input.nextLine();
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Digite um número.");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Pessoas[] users = new Pessoas[3];
            users[0] = new Pessoas("admin", "admin_lp709", 0.0);
            users[1] = new Pessoas("Edvaldo Pinheiro", "123456789", 1500.0);
            users[2] = new Pessoas("Esmyvalda Pinheiro", "123456789", 2600.0);

            System.out.println("\n=============================\n");
            System.out.println("         BANK SYSTEM      ");
            System.out.println("\n=============================\n");

            System.out.print("Digite o nome: ");
            String name = input.nextLine();

            System.out.print("Digite a senha: ");
            String passwd = input.nextLine();

            Pessoas usuarioLogado = null;
            for (Pessoas usuario : users) {
                if (usuario != null && usuario.getName().equals(name) && usuario.getPasswd().equals(passwd)) {
                    usuarioLogado = usuario;
                    break;
                }
            }

            if (usuarioLogado == null) {
                System.out.println("Nome ou senha inválidos!");
                return;
            }

            int opcao = -1;
            while (opcao != 3) {
                System.out.println("\n=== MENU ===");
                System.out.println("0. Consultar saldo");
                System.out.println("1. Depositar dinheiro");
                System.out.println("2. Levantar dinheiro");
                System.out.println("3. Sair");

                opcao = lerOpcao(input);

                switch (opcao) {
                    case 0:
                        System.out.println("Saldo atual: R$ " + String.format("%.2f", usuarioLogado.getSaldo()));
                        break;
                    case 1:
                        double valorDeposito = lerValor(input, "Digite o valor para depositar: ");
                        usuarioLogado.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso!");
                        break;
                    case 2:
                        double valorSaque = lerValor(input, "Digite o valor para levantar: ");
                        if (usuarioLogado.levantar(valorSaque)) {
                            System.out.println("Saque realizado com sucesso!");
                        } else {
                            System.out.println("Saldo insuficiente ou valor inválido!");
                        }
                        break;
                    case 3:
                        System.out.println("Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }
        }
    }
}