public class Ex4 {
    public static void main(String[] args) {
        Circulo[] circulos = {
            new Circulo(), new Circulo(), new Circulo(), new Circulo()
        };
        double[] raios = {1, 5, 4, 2.5};

        for (int i = 0; i < circulos.length; i++) {
            circulos[i].raio = raios[i];
            System.out.printf("Círculo %d - área: %.2f%n", i + 1, circulos[i].calcularArea());
        }
    }
}
