public class Ex4 {
    public static void main(String[] args) {
        Loja loja = new Loja();
        Produto p1 = new Produto("Cimento", "Riachuelo", 9.99, 10);
        Produto p2 = new Produto("Vergalhão", "Rihappy", 10.99, 10);
        Produto p3 = new Produto("Madeira", "Rihappy", 12.99, 15);
        Produto p4 = new Produto("Cano Grosso", "Tigre", 900, 69);
        Produto p5 = new Produto("Telha", "Honda", 16.99, 32);

        p1.venderQuantidadeDeEstoque(5);
        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p3);
        loja.adicionarProduto(p4);
        loja.adicionarProduto(p5);

        System.out.println(p1);
        System.out.println("Produto mais caro da marca Rihappy: " + loja.produtoMaisCaro("Rihappy"));
        System.out.println("Produtos da marca Rihappy entre R$ 11 e R$ 20:");
        System.out.println(loja.buscaEstoque(11, 20, "Rihappy"));
    }
}
