public class Ex2 {
    public static void main(String[] args) {
        Floricultura floricultura = new Floricultura();
        floricultura.adicionarFlor(new Flor("Tulipa", 60, "Caio"));
        floricultura.adicionarFlor(new Flor("Margarida", 50, "Joãozinho"));
        floricultura.adicionarFlor(new Flor("Rosa", 40, "Ana"));
        floricultura.adicionarFlor(new Flor("Lírio aranha azul", 100, "Caio"));

        System.out.println("Flores do cliente Caio:");
        for (Flor flor : floricultura.pesquisarFlores("Caio")) {
            System.out.println(flor);
        }
    }
}
