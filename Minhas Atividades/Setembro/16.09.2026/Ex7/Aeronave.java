public class Aeronave {
    private String modelo;
    private int qtdPassageiros;
    private double velMax;
    private double capCombustivel;
    private double queimaMinuto;

    public Aeronave(String modelo, int qtdPassageiros, double velMax,
                    double capCombustivel, double queimaMinuto) {
        setModelo(modelo);
        setQtdPassageiros(qtdPassageiros);
        setVelMax(velMax);
        setCapCombustivel(capCombustivel);
        setQueimaMinuto(queimaMinuto);
    }

    public double calcularAutonomia() {
        return capCombustivel / queimaMinuto;
    }

    public double calcularDistanciaMaxima() {
        return calcularAutonomia() * velMax;
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) {
        if (modelo == null || modelo.isBlank()) throw new IllegalArgumentException("Modelo inválido.");
        this.modelo = modelo;
    }
    public int getQtdPassageiros() { return qtdPassageiros; }
    public void setQtdPassageiros(int qtdPassageiros) {
        if (qtdPassageiros < 0) throw new IllegalArgumentException("Quantidade de passageiros inválida.");
        this.qtdPassageiros = qtdPassageiros;
    }
    public double getVelMax() { return velMax; }
    public void setVelMax(double velMax) {
        if (velMax <= 0) throw new IllegalArgumentException("Velocidade inválida.");
        this.velMax = velMax;
    }
    public double getCapCombustivel() { return capCombustivel; }
    public void setCapCombustivel(double capCombustivel) {
        if (capCombustivel <= 0) throw new IllegalArgumentException("Capacidade inválida.");
        this.capCombustivel = capCombustivel;
    }
    public double getQueimaMinuto() { return queimaMinuto; }
    public void setQueimaMinuto(double queimaMinuto) {
        if (queimaMinuto <= 0) throw new IllegalArgumentException("Consumo inválido.");
        this.queimaMinuto = queimaMinuto;
    }

    @Override
    public String toString() {
        return "Aeronave [modelo=" + modelo + ", passageiros=" + qtdPassageiros
                + ", autonomia=" + String.format("%.2f", calcularAutonomia())
                + " min, distância=" + String.format("%.2f", calcularDistanciaMaxima()) + "]";
    }
}
