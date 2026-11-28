import java.util.ArrayList;
import java.util.List;

public class Familia {
    private List<Pessoa> pessoas;

    public Familia() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        if (pessoa == null) throw new IllegalArgumentException("Pessoa inválida.");
        pessoas.add(pessoa);
    }

    public Pessoa encontrarPessoaMaisVelha() {
        Pessoa maisVelha = null;
        for (Pessoa pessoa : pessoas) {
            if (maisVelha == null || pessoa.getDataNascimento().isBefore(maisVelha.getDataNascimento())) {
                maisVelha = pessoa;
            }
        }
        return maisVelha;
    }
}
