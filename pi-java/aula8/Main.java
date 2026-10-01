import java.util.ArrayList;
import java.util.List;

public class Main {

    static class user {
        public int id;
        public String nome;
        public int idade;
        public boolean active;

        public user(int id, String nome, int idade, boolean active) {
            this.id = id;
            this.nome = nome;
            this.idade = idade;
            this.active = active;
        }
    }

    public static void main(String[] args) {
        List<user> user = new ArrayList<>();

        user.add(new user(0, "Leandro Jesus", 16, true));
        user.add(new user(1, "Edvaldo Pinheiro", 10, false));
        user.add(new user(2, "Esmyvalda Jesusu", 18, true));
        user.add(new user(3, "Beatriz Bonfim", 38, false));
        user.add(new user(4, "Vando Bonfim", 36, false));

        System.out.println(user.get(0).id);
    }
}