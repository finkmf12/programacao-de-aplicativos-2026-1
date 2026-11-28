import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha a estação do ano:");
        System.out.println("1 - Verão\n2 - Outono\n3 - Inverno\n4 - Primavera");
        int estacao = input.nextInt();

        switch (estacao) {
            case 1:
                imprimirVerao();
                break;
            case 2:
                imprimirOutono();
                break;
            case 3:
                imprimirInverno();
                break;
            case 4:
                imprimirPrimavera();
                break;
            default:
                System.out.println("Opção inválida.");
        }

        input.close();
    }

    public static void imprimirVerao() {
        System.out.println("É verão e o tempo está quente.");
    }

    public static void imprimirOutono() {
        System.out.println("É outono e as folhas estão caindo.");
    }

    public static void imprimirInverno() {
        System.out.println("É inverno e o tempo está frio.");
    }

    public static void imprimirPrimavera() {
        System.out.println("É primavera e as flores estão florindo.");
    }
}
