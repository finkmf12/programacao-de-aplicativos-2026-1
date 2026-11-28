import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = input.nextInt();

        imprimir20Numeros(numero);
        input.close();
    }

    public static void imprimir20Numeros(int numero) {
        for (int i = numero; i <= numero + 20; i++) {
            System.out.println(i);
        }
    }
}
