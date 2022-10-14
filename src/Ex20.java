import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double media = (n1 + n2 + n3) / 3;

        if (media == 10.0) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7.0 && media < 10.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
