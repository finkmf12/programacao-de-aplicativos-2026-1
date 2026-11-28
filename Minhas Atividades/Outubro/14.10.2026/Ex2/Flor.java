public class Flor {
    private String nome;
    private double preco;
    private String nomeCliente;

    public Flor(String nome, double preco, String nomeCliente) {
        setNome(nome);
        setPreco(preco);
        setNomeCliente(nomeCliente);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome inválido.");
        this.nome = nome;
    }

    public double getPreco() { return preco; }
    public void setPreco(double preco) {
        if (preco <= 0) throw new IllegalArgumentException("Preço inválido.");
        this.preco = preco;
    }

    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null || nomeCliente.isBlank()) throw new IllegalArgumentException("Cliente inválido.");
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Flor [nome=" + nome + ", preço=R$ " + String.format("%.2f", preco)
                + ", cliente=" + nomeCliente + "]";
    }
}
