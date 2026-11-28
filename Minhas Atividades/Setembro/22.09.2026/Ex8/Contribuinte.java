public class Contribuinte {
    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;

    public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
        this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.rendaAnual = rendaAnual;
    }

    public double calcularImposto() {
        if (rendaAnual <= 4000) return 0;
        if (rendaAnual <= 9000) return rendaAnual * 0.058;
        if (rendaAnual <= 25000) return rendaAnual * 0.15;
        if (rendaAnual <= 35000) return rendaAnual * 0.275;
        return rendaAnual * 0.30;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " - imposto: R$ " + String.format("%.2f", calcularImposto());
    }
}
