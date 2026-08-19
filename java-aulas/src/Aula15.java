public class Aula15 {
    public static void main(String[] args) {

        char myChar = 'B';
        char Mychar = 'C';

        Integer num1 = (int) myChar;
        Integer num2 = (int) Mychar;

        num1 = 400;
        num2 = 600;

        Class<?> typeof1 = num1.getClass();
        Class<?> typeof2 = num2.getClass();

        System.out.println(typeof1);
        System.out.println(typeof2);
    }
}
