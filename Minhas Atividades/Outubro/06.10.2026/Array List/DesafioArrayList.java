import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        numeros.add(22);
        numeros.add(13);
        numeros.add(25);
        numeros.add(20);
        numeros.add(18);
        numeros.add(29);

        System.out.print("Informe um valor para procurar: ");
        int valor = input.nextInt();

        int indice = numeros.indexOf(valor);
        if (indice >= 0) {
            System.out.println("Valor encontrado na posição: " + indice);
        } else {
            System.out.println("Não está na lista.");
        }

        input.close();
    }
}
