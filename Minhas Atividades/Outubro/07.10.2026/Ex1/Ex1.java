public class Ex1 {
    public static void main(String[] args) {
        FormasGeometricas formas = new FormasGeometricas();
        formas.adicionarRetangulo(new Retangulo(5, 4));
        formas.adicionarRetangulo(new Retangulo(18, 1));

        System.out.println("Maior área: " + formas.obterRetanguloMaiorArea());
        System.out.println("Maior perímetro: " + formas.obterRetanguloMaiorPerimetro());
    }
}
