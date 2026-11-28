public class Ex5 {
    public static void main(String[] args) {
        Conta ana = new Conta("Ana", 1000);
        Conta joao = new Conta("João", 500);

        ana.depositarValor(400);
        ana.sacarValor(500);
        System.out.println(ana);

        ana.transferirValor(500, joao);
        System.out.println(ana);
        System.out.println(joao);

        System.out.printf("Simulação de investimento: R$ %.2f%n", joao.simularInvestimento(500, 10));
    }
}
