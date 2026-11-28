import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome do colega: ");
        String nome = input.nextLine().trim();

        if (nome.equalsIgnoreCase("João")) {
            imprimirJoao();
        } else if (nome.equalsIgnoreCase("Maria")) {
            imprimirMaria();
        } else if (nome.equalsIgnoreCase("Ana")) {
            imprimirAna();
        } else {
            System.out.println("Colega não encontrado.");
        }

        input.close();
    }

    public static void imprimirJoao() {
        System.out.println("O nome dele é João. Ele tem 20 anos e é aluno de desenvolvimento de sistemas.");
    }

    public static void imprimirMaria() {
        System.out.println("O nome dela é Maria. Ela tem 19 anos e é aluna de desenvolvimento de sistemas.");
    }

    public static void imprimirAna() {
        System.out.println("O nome dela é Ana. Ela tem 22 anos e é aluna de desenvolvimento de sistemas.");
    }
}
