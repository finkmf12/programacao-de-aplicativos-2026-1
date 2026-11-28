public class Ex3 {
    public static void main(String[] args) {
        SistemaDeAlunos escola = new SistemaDeAlunos();
        escola.adicionarAluno(new Aluno("José", 20, "123", "DESI", 9));
        escola.adicionarAluno(new Aluno("Maria", 18, "142", "DESI", 8));
        escola.adicionarAluno(new Aluno("Ana", 17, "164", "PCP", 7));
        escola.adicionarAluno(new Aluno("Robson", 21, "173", "MEC", 7.9));
        escola.adicionarAluno(new Aluno("Carlos", 15, "254", "AUT", 9.5));

        System.out.println("Alunos do curso DESI com idade a partir de 18 e média 7:");
        System.out.println(escola.obterAlunoPorCursoIdadeEMedia("DESI", 18, 7));

        System.out.println("Busca por matrícula 254:");
        System.out.println(escola.obterAlunoPorMatricula("254"));
    }
}
