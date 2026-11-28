public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        setAltura(altura);
        setLargura(largura);
    }

    public double calcularArea() {
        return altura * largura;
    }

    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }

    public double getAltura() { return altura; }
    public void setAltura(double altura) {
        if (altura <= 0) throw new IllegalArgumentException("Altura deve ser positiva.");
        this.altura = altura;
    }

    public double getLargura() { return largura; }
    public void setLargura(double largura) {
        if (largura <= 0) throw new IllegalArgumentException("Largura deve ser positiva.");
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "Retângulo [altura=" + altura + ", largura=" + largura + "]";
    }
}
