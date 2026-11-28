public class Produto {
    private String modelo;
    private String marca;
    private double preco;
    private int qtdEstoque;

    public Produto(String modelo, String marca, double preco, int qtdEstoque) {
        setModelo(modelo);
        setMarca(marca);
        setPreco(preco);
        setQtdEstoque(qtdEstoque);
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) throw new IllegalArgumentException("Modelo inválido.");
        this.modelo = modelo;
    }
    public String getMarca() { return marca; }
    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) throw new IllegalArgumentException("Marca inválida.");
        this.marca = marca;
    }
    public double getPreco() { return preco; }
    public void setPreco(double preco) {
        if (preco <= 0) throw new IllegalArgumentException("Preço inválido.");
        this.preco = preco;
    }
    public int getQtdEstoque() { return qtdEstoque; }
    public void setQtdEstoque(int qtdEstoque) {
        if (qtdEstoque < 0) throw new IllegalArgumentException("Estoque inválido.");
        this.qtdEstoque = qtdEstoque;
    }

    public void aumentarQuantidadeDoEstoque(int aumento) {
        if (aumento <= 0) throw new IllegalArgumentException("Aumento inválido.");
        qtdEstoque += aumento;
    }

    public void venderQuantidadeDeEstoque(int venda) {
        if (venda <= 0 || venda > qtdEstoque) throw new IllegalArgumentException("Quantidade de venda inválida.");
        qtdEstoque -= venda;
    }

    @Override
    public String toString() {
        return "Produto [modelo=" + modelo + ", marca=" + marca + ", preço=R$ "
                + String.format("%.2f", preco) + ", estoque=" + qtdEstoque + "]";
    }
}
