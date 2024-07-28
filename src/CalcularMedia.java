import java.util.Scanner;

public class CalcularMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeria nota");
        Double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota");
        Double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota");
        Double nota3 = scanner.nextDouble();
        System.out.println("Digite a quarta nota");
        Double nota4 = scanner.nextDouble();
        Double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("O aluno está aprovado!");
        }

        if (media >= 5 && media < 7) {
            System.out.println("O aluno está de recuperação!");
        }

        if (media < 5) {
            System.out.println("O aluno está reprovado!");
        }

        System.out.println(media);

        scanner.close();
    }
}
