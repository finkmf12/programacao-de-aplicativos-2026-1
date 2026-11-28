import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a estação (1-Verão, 2-Outono, 3-Inverno, 4-Primavera): ");
        int estacao = input.nextInt();

        String mensagem;
        switch (estacao) {
            case 1: mensagem = imprimirVerao(); break;
            case 2: mensagem = imprimirOutono(); break;
            case 3: mensagem = imprimirInverno(); break;
            case 4: mensagem = imprimirPrimavera(); break;
            default: mensagem = "Opção inválida.";
        }

        System.out.println(mensagem);
        input.close();
    }

    public static String imprimirVerao() {
        return "É verão e o tempo está quente.";
    }

    public static String imprimirOutono() {
        return "É outono e as folhas estão caindo.";
    }

    public static String imprimirInverno() {
        return "É inverno e o tempo está frio.";
    }

    public static String imprimirPrimavera() {
        return "É primavera e as flores estão florindo.";
    }
}
