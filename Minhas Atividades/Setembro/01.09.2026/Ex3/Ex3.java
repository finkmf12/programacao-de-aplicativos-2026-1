public class Ex3 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Caneta";
        produto.descricao = "Caneta esferográfica";
        produto.precoUnitario = 1.20;
        produto.desconto = 2;

        System.out.println("Produto: " + produto.nome);
        System.out.println("Descrição: " + produto.descricao);
        System.out.printf("Preço original: R$ %.2f%n", produto.precoUnitario);
        System.out.printf("Preço com desconto: R$ %.2f%n", produto.calcularPrecoComDesconto());
    }
}
