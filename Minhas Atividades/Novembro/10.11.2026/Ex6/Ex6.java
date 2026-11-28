public class Ex6 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("SC", "Blumenau", "89030000", "Rua São Paulo", "100");
        Pessoa pessoa = new Pessoa("Jorginho", endereco);
        System.out.println(pessoa);
    }
}
