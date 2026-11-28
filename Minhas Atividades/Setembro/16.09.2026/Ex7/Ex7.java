public class Ex7 {
    public static void main(String[] args) {
        Aeronave[] aeronaves = {
            new Aeronave("Delta", 30, 500, 1000, 100),
            new Aeronave("Boeing", 100, 600, 2000, 150),
            new Aeronave("Airbus", 150, 550, 2500, 200),
            new Aeronave("Cessna", 2, 200, 400, 20)
        };

        Aeronave maisPassageiros = aeronaves[0];
        Aeronave maiorAutonomia = aeronaves[0];
        Aeronave maiorDistancia = aeronaves[0];

        for (Aeronave aeronave : aeronaves) {
            if (aeronave.getQtdPassageiros() > maisPassageiros.getQtdPassageiros()) {
                maisPassageiros = aeronave;
            }
            if (aeronave.calcularAutonomia() > maiorAutonomia.calcularAutonomia()) {
                maiorAutonomia = aeronave;
            }
            if (aeronave.calcularDistanciaMaxima() > maiorDistancia.calcularDistanciaMaxima()) {
                maiorDistancia = aeronave;
            }
        }

        System.out.println("Maior capacidade: " + maisPassageiros);
        System.out.println("Maior autonomia: " + maiorAutonomia);
        System.out.println("Maior distância: " + maiorDistancia);
    }
}
