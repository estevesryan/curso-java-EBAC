import java.util.Scanner;

public class LerValor {
    public static void main(String[] args) {
        Scanner valorDigitado = new Scanner(System.in);
        int numWrapper = valorDigitado.nextInt();
        System.out.println("O valor digitado foi: " + numWrapper);
    }
}
