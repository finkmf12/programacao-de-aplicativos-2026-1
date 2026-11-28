public class Ex8 {
    public static void main(String[] args) {
        Contribuinte[] contribuintes = {
            new Contribuinte("João", "00000000000", "SC", 2800),
            new Contribuinte("Maria", "11111111111", "PR", 5000),
            new Contribuinte("Ana", "22222222222", "RS", 10000),
            new Contribuinte("Carlos", "33333333333", "PR", 27000),
            new Contribuinte("Jorge", "44444444444", "SC", 38000)
        };

        Contribuinte maiorImposto = contribuintes[0];
        double totalImposto = 0;

        for (Contribuinte contribuinte : contribuintes) {
            double imposto = contribuinte.calcularImposto();
            totalImposto += imposto;
            if (imposto > maiorImposto.calcularImposto()) {
                maiorImposto = contribuinte;
            }
        }

        System.out.println("Quem mais paga imposto: " + maiorImposto);
        System.out.printf("Total de imposto pago: R$ %.2f%n", totalImposto);
    }
}
