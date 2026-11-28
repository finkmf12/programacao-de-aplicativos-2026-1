import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos;

    public Loja() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        if (produto == null) throw new IllegalArgumentException("Produto inválido.");
        produtos.add(produto);
    }

    public Produto produtoMaisCaro(String marca) {
        Produto maisCaro = null;
        for (Produto produto : produtos) {
            if (produto.getMarca().equalsIgnoreCase(marca)
                    && (maisCaro == null || produto.getPreco() > maisCaro.getPreco())) {
                maisCaro = produto;
            }
        }
        return maisCaro;
    }

    public List<Produto> buscaEstoque(double precoInicial, double precoFinal, String marca) {
        List<Produto> resultado = new ArrayList<>();
        if (precoInicial > precoFinal) throw new IllegalArgumentException("Faixa de preço inválida.");
        for (Produto produto : produtos) {
            if (produto.getMarca().equalsIgnoreCase(marca)
                    && produto.getPreco() >= precoInicial && produto.getPreco() <= precoFinal) {
                resultado.add(produto);
            }
        }
        return resultado;
    }
}
