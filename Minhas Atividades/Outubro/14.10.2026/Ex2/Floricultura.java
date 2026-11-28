import java.util.ArrayList;
import java.util.List;

public class Floricultura {
    private List<Flor> flores;

    public Floricultura() {
        flores = new ArrayList<>();
    }

    public void adicionarFlor(Flor flor) {
        if (flor == null) throw new IllegalArgumentException("Flor inválida.");
        flores.add(flor);
    }

    public List<Flor> pesquisarFlores(String nomeCliente) {
        List<Flor> resultado = new ArrayList<>();
        for (Flor flor : flores) {
            if (flor.getNomeCliente().equalsIgnoreCase(nomeCliente)) {
                resultado.add(flor);
            }
        }
        return resultado;
    }
}
