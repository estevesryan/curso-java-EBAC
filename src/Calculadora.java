public class Calculadora {

    public static void main(String[] args) {
        Double media = calcularMedia();

        System.out.println("Esta e media dos numeros");
        System.out.println(media);
    }

    static Double calcularMedia() {
        double numeros = 1 + 2 + 3 + 4;

        return numeros / 4;
    }
}
