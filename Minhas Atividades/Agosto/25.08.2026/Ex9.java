import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = input.nextInt();

        if (determinarParOuImpar(numero)) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        input.close();
    }

    public static boolean determinarParOuImpar(int numero) {
        return numero % 2 == 0;
    }
}
