import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.print("Informe a segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.print("Informe a terceira nota: ");
        double nota3 = input.nextDouble();

        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {
            System.out.println("As notas devem estar entre 0 e 10.");
        } else {
            System.out.printf("A média é: %.2f%n", calcularMedia(nota1, nota2, nota3));
        }

        input.close();
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
}
