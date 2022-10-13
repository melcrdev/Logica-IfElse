import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        if (valor >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }


        sc.close();
    }
}
