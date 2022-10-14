import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();

        if (lado1 + lado2 > lado3) {
            System.out.println("É um triângulo!");
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        }
        else {
            System.out.println("Não é um triângulo!");
        }

        sc.close();
    }
}
