public class Conta {
    private String nomeTitular;
    private double saldo;

    public Conta(String nomeTitular, double saldo) {
        setNomeTitular(nomeTitular);
        setSaldo(saldo);
    }

    public void sacarValor(double valor) {
        if (valor <= 0 || valor > saldo) throw new IllegalArgumentException("Saque inválido.");
        saldo -= valor;
    }

    public void depositarValor(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Depósito inválido.");
        saldo += valor;
    }

    public void transferirValor(double valor, Conta destino) {
        if (destino == null || destino == this || valor <= 0 || valor > saldo) {
            throw new IllegalArgumentException("Transferência inválida.");
        }
        saldo -= valor;
        destino.saldo += valor;
    }

    public double simularInvestimento(double valor, int tempo) {
        if (valor <= 0 || tempo <= 0) throw new IllegalArgumentException("Investimento inválido.");
        return valor * Math.pow(1.01, tempo);
    }

    public String getNomeTitular() { return nomeTitular; }
    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular == null || nomeTitular.isBlank()) throw new IllegalArgumentException("Titular inválido.");
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) {
        if (saldo < 0) throw new IllegalArgumentException("Saldo não pode ser negativo.");
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta [titular=" + nomeTitular + ", saldo=R$ " + String.format("%.2f", saldo) + "]";
    }
}
