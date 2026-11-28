import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = input.nextLine().trim();

        if (palavra.isEmpty()) {
            System.out.println("A palavra não pode estar vazia.");
        } else {
            System.out.println("Caractere escolhido: " + obterCaractere(palavra));
        }

        input.close();
    }

    public static char obterCaractere(String palavra) {
        int posicao = palavra.length() % 2 == 0 ? 0 : palavra.length() / 2;
        return palavra.charAt(posicao);
    }
}
