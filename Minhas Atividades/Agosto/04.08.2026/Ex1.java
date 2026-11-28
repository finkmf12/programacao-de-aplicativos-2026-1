import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite sua matricula: ");
        String matricula = input.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite a quantidade de horas trabalhadas por semana: ");
        double horasTrabalhadas = input.nextDouble();

        System.out.print("Digite o valor recebido por hora: ");
        double salarioHora = input.nextDouble();

        double salarioMensal = horasTrabalhadas * salarioHora * 4;

        System.out.println("\nMatricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Salario mensal: R$ " + df.format(salarioMensal));

        input.close();
    }
}
