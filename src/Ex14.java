import java.util.Locale;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite suas notas:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double media = (n1 + n2) / 2;

        if (media >= 9.0 && media <= 10.0) {
            System.out.printf("Média: %.1f%n", media);
            System.out.println("Conceito: A");
            System.out.println("APROVADO");
        } else if (media >= 7.5 && media < 9.0) {
            System.out.printf("Média: %.1f%n", media);
            System.out.println("Conceito: B");
            System.out.println("APROVADO");
        } else if (media >= 6.0 && media < 7.5) {
            System.out.printf("Média: %.1f%n", media);
            System.out.println("Conceito: C");
            System.out.println("APROVADO");
        } else if (media >= 4.0 && media < 6.0) {
            System.out.printf("Média: %.1f%n", media);
            System.out.println("Conceito: D");
            System.out.println("REPROVADO");
        } else {
            System.out.printf("Média: %.1f%n", media);
            System.out.println("Conceito: E");
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}
