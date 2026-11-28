public class Ex6 {
    public static void main(String[] args) {
        Mercado[] mercados = {
            new Mercado("Angeloni", 450, 1.80, 420, 2.20),
            new Mercado("Fort", 500, 2.00, 470, 2.40),
            new Mercado("Giassi", 500, 2.00, 400, 2.50)
        };

        Mercado maiorReceitaMacas = mercados[0];
        Mercado menorReceitaLaranjas = mercados[0];
        Mercado maiorReceitaTotal = mercados[0];
        double totalMacas = 0;
        double totalLaranjas = 0;

        for (Mercado mercado : mercados) {
            if (mercado.calcularReceitaMacas() > maiorReceitaMacas.calcularReceitaMacas()) {
                maiorReceitaMacas = mercado;
            }
            if (mercado.calcularReceitaLaranjas() < menorReceitaLaranjas.calcularReceitaLaranjas()) {
                menorReceitaLaranjas = mercado;
            }
            if (mercado.calcularReceitaTotal() > maiorReceitaTotal.calcularReceitaTotal()) {
                maiorReceitaTotal = mercado;
            }
            totalMacas += mercado.calcularReceitaMacas();
            totalLaranjas += mercado.calcularReceitaLaranjas();
        }

        Mercado segundaMaior = null;
        for (Mercado mercado : mercados) {
            if (mercado != maiorReceitaTotal
                    && (segundaMaior == null || mercado.calcularReceitaTotal() > segundaMaior.calcularReceitaTotal())) {
                segundaMaior = mercado;
            }
        }

        System.out.println("Maior receita com maçãs: " + maiorReceitaMacas);
        System.out.println("Menor receita com laranjas: " + menorReceitaLaranjas);
        System.out.println("Maior receita total: " + maiorReceitaTotal);
        System.out.println("Segunda maior receita total: " + (segundaMaior == null ? "Não encontrada" : segundaMaior));
        System.out.printf("Total de maçãs: R$ %.2f%n", totalMacas);
        System.out.printf("Total de laranjas: R$ %.2f%n", totalLaranjas);
        System.out.println(totalMacas > totalLaranjas ? "A franquia faturou mais com maçãs."
                : totalLaranjas > totalMacas ? "A franquia faturou mais com laranjas." : "Receitas iguais.");
    }
}
