import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = input.nextLine().trim();

        if (palavra.length() < 2) {
            System.out.println("Informe uma palavra com pelo menos duas letras.");
        } else {
            System.out.println("Caractere escolhido: " + obterCaractere(palavra));
        }

        input.close();
    }

    public static char obterCaractere(String palavra) {
        return palavra.length() % 2 == 0 ? palavra.charAt(0) : palavra.charAt(1);
    }
}
