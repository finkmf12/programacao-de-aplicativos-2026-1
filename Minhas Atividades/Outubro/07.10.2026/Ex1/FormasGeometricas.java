import java.util.ArrayList;
import java.util.List;

public class FormasGeometricas {
    private List<Retangulo> retangulos;

    public FormasGeometricas() {
        retangulos = new ArrayList<>();
    }

    public void adicionarRetangulo(Retangulo retangulo) {
        if (retangulo == null) throw new IllegalArgumentException("Retângulo inválido.");
        retangulos.add(retangulo);
    }

    public Retangulo obterRetanguloMaiorArea() {
        Retangulo maior = null;
        for (Retangulo retangulo : retangulos) {
            if (maior == null || retangulo.calcularArea() > maior.calcularArea()) {
                maior = retangulo;
            }
        }
        return maior;
    }

    public Retangulo obterRetanguloMaiorPerimetro() {
        Retangulo maior = null;
        for (Retangulo retangulo : retangulos) {
            if (maior == null || retangulo.calcularPerimetro() > maior.calcularPerimetro()) {
                maior = retangulo;
            }
        }
        return maior;
    }
}
