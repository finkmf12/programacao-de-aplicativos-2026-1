public class Ex2 {
    public static void main(String[] args) {
        Mercado joinville = new Mercado();
        joinville.nomeMercado = "Giassi";
        joinville.macasVendidas = 500;
        joinville.precoMaca = 2.00;
        joinville.laranjasVendidas = 400;
        joinville.precoLaranja = 2.50;

        Mercado blumenau = new Mercado();
        blumenau.nomeMercado = "Angeloni";
        blumenau.macasVendidas = 450;
        blumenau.precoMaca = 1.80;
        blumenau.laranjasVendidas = 420;
        blumenau.precoLaranja = 2.20;

        Mercado florianopolis = new Mercado();
        florianopolis.nomeMercado = "Fort";
        florianopolis.macasVendidas = 500;
        florianopolis.precoMaca = 2.00;
        florianopolis.laranjasVendidas = 470;
        florianopolis.precoLaranja = 2.40;

        Mercado[] mercados = {joinville, blumenau, florianopolis};
        for (Mercado mercado : mercados) {
            System.out.printf("%s - Maçãs: R$ %.2f | Laranjas: R$ %.2f | Total: R$ %.2f%n",
                    mercado.nomeMercado, mercado.calcularReceitaMacas(),
                    mercado.calcularReceitaLaranjas(), mercado.calcularReceitaTotal());
        }
    }
}
