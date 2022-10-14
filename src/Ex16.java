import java.util.Locale;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double b, c, delta,x1, x2;
        double a = sc.nextInt();

        if (a == 0) {
            System.out.println("Equação não é do segundo grau!");
        } else {
            b = sc.nextInt();
            c = sc.nextInt();
            delta = (b * b) - 4 * a * c;

            if (delta < 0) {
                System.out.println("A equação não possui duas raízes");
            } else if (delta == 0){
                x1 = (-(b) + 0) / (2 * a);
                System.out.println("Raíz do delta nulo é: " + x1);
            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Raíz 1 é: " + x1);
                System.out.println("Raíz 2 é: " + x2);
            }
        }

        sc.close();
    }
}
