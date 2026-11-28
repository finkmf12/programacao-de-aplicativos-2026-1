public class Ex11 {
    public static void main(String[] args) {
        double[] valores = {5, 6, 4, 12, -5, 0, 84};

        if (valores.length == 0) {
            System.out.println("O vetor está vazio.");
            return;
        }

        System.out.println("Maior valor: " + obterMaiorValor(valores));
        System.out.println("Menor valor: " + obterMenorValor(valores));
        System.out.println("Média: " + calcularMedia(valores));
    }

    public static double obterMaiorValor(double[] vetor) {
        double maior = vetor[0];
        for (double valor : vetor) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

    public static double obterMenorValor(double[] vetor) {
        double menor = vetor[0];
        for (double valor : vetor) {
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }

    public static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double valor : vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }
}
