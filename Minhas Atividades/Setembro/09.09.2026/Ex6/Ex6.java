public class Ex6 {
    public static void main(String[] args) {
        Mercado[] mercados = new Mercado[3];

        mercados[0] = criarMercado("Giassi", 500, 2.00, 400, 2.50);
        mercados[1] = criarMercado("Angeloni", 450, 1.80, 420, 2.20);
        mercados[2] = criarMercado("Fort", 500, 2.00, 470, 2.40);

        Mercado maiorMacas = mercados[0];
        Mercado menorLaranjas = mercados[0];
        Mercado segundaMaior = null;
        double totalMacas = 0;
        double totalLaranjas = 0;

        for (Mercado mercado : mercados) {
            if (mercado.calcularReceitaMacas() > maiorMacas.calcularReceitaMacas()) {
                maiorMacas = mercado;
            }
            if (mercado.calcularReceitaLaranjas() < menorLaranjas.calcularReceitaLaranjas()) {
                menorLaranjas = mercado;
            }
            totalMacas += mercado.calcularReceitaMacas();
            totalLaranjas += mercado.calcularReceitaLaranjas();
        }

        for (Mercado mercado : mercados) {
            if (mercado != maiorMercadoTotal(mercados)
                    && (segundaMaior == null || mercado.calcularReceitaTotal() > segundaMaior.calcularReceitaTotal())) {
                segundaMaior = mercado;
            }
        }

        System.out.println("Maior receita com maçãs: " + maiorMacas.nomeMercado);
        System.out.println("Menor receita com laranjas: " + menorLaranjas.nomeMercado);
        System.out.println("Segunda maior receita total: " + (segundaMaior == null ? "Não encontrada" : segundaMaior.nomeMercado));
        System.out.printf("Receita total com maçãs: R$ %.2f%n", totalMacas);
        System.out.printf("Receita total com laranjas: R$ %.2f%n", totalLaranjas);
        if (totalMacas > totalLaranjas) {
            System.out.println("A franquia faturou mais com maçãs.");
        } else if (totalLaranjas > totalMacas) {
            System.out.println("A franquia faturou mais com laranjas.");
        } else {
            System.out.println("O faturamento foi igual.");
        }
    }

    private static Mercado criarMercado(String nome, int macas, double precoMaca, int laranjas, double precoLaranja) {
        Mercado mercado = new Mercado();
        mercado.nomeMercado = nome;
        mercado.macasVendidas = macas;
        mercado.precoMaca = precoMaca;
        mercado.laranjasVendidas = laranjas;
        mercado.precoLaranja = precoLaranja;
        return mercado;
    }

    private static Mercado maiorMercadoTotal(Mercado[] mercados) {
        Mercado maior = mercados[0];
        for (Mercado mercado : mercados) {
            if (mercado.calcularReceitaTotal() > maior.calcularReceitaTotal()) {
                maior = mercado;
            }
        }
        return maior;
    }
}
