import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o nome do vendedor: ");
        String nome = input.nextLine();

        System.out.print("Digite o salario fixo: R$ ");
        double salarioFixo = input.nextDouble();

        System.out.print("Digite o valor total das vendas: R$ ");
        double vendas = input.nextDouble();

        double comissao = vendas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.println("\nVendedor: " + nome);
        System.out.println("Comissao: R$ " + df.format(comissao));
        System.out.println("Salario final: R$ " + df.format(salarioFinal));

        input.close();
    }
}
