import java.util.ArrayList;
import java.util.List;

public class SistemaDeAlunos {
    private List<Aluno> alunos;

    public SistemaDeAlunos() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        if (aluno == null) throw new IllegalArgumentException("Aluno inválido.");
        alunos.add(aluno);
    }

    public List<Aluno> obterAlunoPorCursoIdadeEMedia(String curso, int idade, double media) {
        List<Aluno> resultado = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.getCurso().equalsIgnoreCase(curso)
                    && aluno.getIdade() >= idade && aluno.getMediaFinal() >= media) {
                resultado.add(aluno);
            }
        }
        return resultado;
    }

    public Aluno obterAlunoPorMatricula(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) return aluno;
        }
        return null;
    }
}
