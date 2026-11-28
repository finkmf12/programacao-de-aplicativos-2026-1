public class Ex4 {
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5};

        if (valores.length == 0) {
            System.out.println("O vetor está vazio.");
            return;
        }

        System.out.println("Maior valor: " + obterMaiorValor(valores));
        System.out.println("Menor valor: " + obterMenorValor(valores));
        System.out.println("Média: " + calcularMedia(valores));
    }

    public static int obterMaiorValor(int[] vetor) {
        int maior = vetor[0];
        for (int valor : vetor) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

    public static int obterMenorValor(int[] vetor) {
        int menor = vetor[0];
        for (int valor : vetor) {
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }

    public static double calcularMedia(int[] vetor) {
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        return (double) soma / vetor.length;
    }
}
