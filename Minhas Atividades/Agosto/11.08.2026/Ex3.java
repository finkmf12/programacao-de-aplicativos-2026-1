import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe sua massa em kg: ");
        double massa = input.nextDouble();

        System.out.print("Informe sua altura em metros: ");
        double altura = input.nextDouble();

        if (massa <= 0 || altura <= 0) {
            System.out.println("Massa e altura devem ser maiores que zero.");
        } else {
            double imc = massa / (altura * altura);
            System.out.printf("Seu IMC: %.2f%n", imc);

            if (imc < 18.5) {
                System.out.println("Magreza");
            } else if (imc <= 24.9) {
                System.out.println("Saudável");
            } else if (imc <= 29.9) {
                System.out.println("Sobrepeso");
            } else if (imc <= 34.9) {
                System.out.println("Obesidade I");
            } else if (imc <= 39.9) {
                System.out.println("Obesidade II");
            } else {
                System.out.println("Obesidade III");
            }
        }

        input.close();
    }
}
