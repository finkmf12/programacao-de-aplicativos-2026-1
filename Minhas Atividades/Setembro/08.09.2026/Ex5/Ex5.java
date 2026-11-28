public class Ex5 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.identificacao = "984841584185";
        funcionario.nome = "João";
        funcionario.sobrenome = "Santos";
        funcionario.salario = 5000;

        System.out.println("Nome: " + funcionario.obterNomeCompleto());
        System.out.printf("Salário anual: R$ %.2f%n", funcionario.calcularSalarioAnual());

        funcionario.aumentarSalario(5);
        System.out.printf("Salário após aumento: R$ %.2f%n", funcionario.salario);
    }
}
