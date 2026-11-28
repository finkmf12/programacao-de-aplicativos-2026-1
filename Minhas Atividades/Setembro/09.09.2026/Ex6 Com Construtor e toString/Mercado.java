public class Mercado {
    private String nomeMercado;
    private int macasVendidas;
    private double precoMaca;
    private int laranjasVendidas;
    private double precoLaranja;

    public Mercado(String nomeMercado, int macasVendidas, double precoMaca,
                   int laranjasVendidas, double precoLaranja) {
        if (nomeMercado == null || nomeMercado.isBlank() || macasVendidas < 0
                || laranjasVendidas < 0 || precoMaca < 0 || precoLaranja < 0) {
            throw new IllegalArgumentException("Dados do mercado inválidos.");
        }
        this.nomeMercado = nomeMercado;
        this.macasVendidas = macasVendidas;
        this.precoMaca = precoMaca;
        this.laranjasVendidas = laranjasVendidas;
        this.precoLaranja = precoLaranja;
    }

    public double calcularReceitaMacas() { return macasVendidas * precoMaca; }
    public double calcularReceitaLaranjas() { return laranjasVendidas * precoLaranja; }
    public double calcularReceitaTotal() { return calcularReceitaMacas() + calcularReceitaLaranjas(); }
    public String getNomeMercado() { return nomeMercado; }

    @Override
    public String toString() {
        return nomeMercado + " (maçãs: R$ " + String.format("%.2f", calcularReceitaMacas())
                + ", laranjas: R$ " + String.format("%.2f", calcularReceitaLaranjas())
                + ", total: R$ " + String.format("%.2f", calcularReceitaTotal()) + ")";
    }
}
