public class Funcionario {
    String identificacao;
    String nome;
    String sobrenome;
    double salario;

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    public String obterNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public void aumentarSalario(double percentual) {
        if (percentual >= 0) {
            salario += salario * percentual / 100;
        }
    }
}
