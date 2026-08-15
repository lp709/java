public class Aula4 {
    public static void main(String[] args) {

        final byte nota = 18;

        if (nota >= 18 && nota <= 20) {
            System.out.println("Exelente");
        } else if (nota >= 14 && nota <= 17) {
            System.out.println("Bom");
        } else if (nota >= 10 && nota <= 13) {
            System.out.println("Sufuciente");
        } else if(nota >= 0 && nota <= 9) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Tente Novamente");
        }
    }
}
