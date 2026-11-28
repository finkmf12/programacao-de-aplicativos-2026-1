import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número base: ");
        int base = input.nextInt();
        System.out.print("Informe o primeiro número: ");
        int numero1 = input.nextInt();
        System.out.print("Informe o segundo número: ");
        int numero2 = input.nextInt();

        obterNumeroPertoBase(base, numero1, numero2);
        input.close();
    }

    public static void obterNumeroPertoBase(int base, int numero1, int numero2) {
        long distancia1 = Math.abs((long) numero1 - base);
        long distancia2 = Math.abs((long) numero2 - base);

        if (distancia1 < distancia2) {
            System.out.println("O número mais perto é: " + numero1);
        } else if (distancia2 < distancia1) {
            System.out.println("O número mais perto é: " + numero2);
        } else {
            System.out.println("Os dois números estão à mesma distância da base.");
        }
    }
}
