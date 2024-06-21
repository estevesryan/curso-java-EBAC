public class Calculadora {

    private static Double media;

    public static void main(String[] args) {
        media = calcularMedia();

        System.out.println(media);
    }

    static Double calcularMedia() {
        double numeros = 1 + 2 + 3 + 4;

        return numeros / 4;
    }
}
