public class Produto {
    String nome;
    String descricao;
    double precoUnitario;
    double desconto;

    public double calcularPrecoComDesconto() {
        return precoUnitario * (1 - desconto / 100);
    }
}
