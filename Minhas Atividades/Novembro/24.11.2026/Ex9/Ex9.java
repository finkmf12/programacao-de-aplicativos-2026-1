import java.time.LocalDate;

public class Ex9 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Carlos", LocalDate.of(2005, 10, 25));
        Pessoa pessoa2 = new Pessoa("Maria", LocalDate.of(2004, 8, 27));

        Familia familia = new Familia();
        familia.adicionarPessoa(pessoa1);
        familia.adicionarPessoa(pessoa2);

        System.out.println("Pessoa mais velha da família:");
        System.out.println(familia.encontrarPessoaMaisVelha());
    }
}
