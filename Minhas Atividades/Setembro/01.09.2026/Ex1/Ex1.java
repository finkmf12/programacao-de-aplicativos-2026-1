public class Ex1 {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        usuario1.nome = "João";
        usuario1.sexo = 'M';
        usuario1.dataNascimento = "14/01/1998";
        usuario1.estadoCivil = "Casado";

        Usuario usuario2 = new Usuario();
        usuario2.nome = "Maria";
        usuario2.sexo = 'F';
        usuario2.dataNascimento = "02/10/2002";
        usuario2.estadoCivil = "Solteira";

        System.out.println(usuario1.nome + " é " + usuario1.estadoCivil);
        System.out.println(usuario2.nome + " é " + usuario2.estadoCivil);
    }
}
