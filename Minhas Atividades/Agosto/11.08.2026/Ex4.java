import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double somaAlturas = 0;
        double maiorAltura = -1;
        double menorAltura = Double.MAX_VALUE;
        String inscricaoMaior = "";
        String inscricaoMenor = "";
        int quantidade = 0;

        System.out.print("Número de inscrição (0 para encerrar): ");
        String inscricao = input.next();

        while (!inscricao.equals("0")) {
            System.out.print("Altura em metros: ");
            double altura = input.nextDouble();

            if (altura <= 0) {
                System.out.println("Altura inválida. O atleta não será contabilizado.");
            } else {
                somaAlturas += altura;
                quantidade++;

                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    inscricaoMaior = inscricao;
                }
                if (altura < menorAltura) {
                    menorAltura = altura;
                    inscricaoMenor = inscricao;
                }
            }

            System.out.print("Número de inscrição (0 para encerrar): ");
            inscricao = input.next();
        }

        if (quantidade == 0) {
            System.out.println("Nenhum atleta foi informado.");
        } else {
            System.out.printf("Média das alturas: %.2f m%n", somaAlturas / quantidade);
            System.out.println("Quantidade de atletas: " + quantidade);
            System.out.printf("Atleta mais alto: %s - %.2f m%n", inscricaoMaior, maiorAltura);
            System.out.printf("Atleta mais baixo: %s - %.2f m%n", inscricaoMenor, menorAltura);
        }

        input.close();
    }
}
