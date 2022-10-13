import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double prod1 = sc.nextDouble();
        double prod2 = sc.nextDouble();
        double prod3 = sc.nextDouble();

        if (prod1 < prod2 && prod1 < prod3) {
            System.out.println("O mais barato é o produto 1");
            System.out.println("Com o preço de: " + prod1);
        } else if (prod2 < prod1 && prod2 < prod3) {
            System.out.println("O mais barato é o produto 2");
            System.out.println("Com o preço de: " + prod2);
        } else {
            System.out.println("O mais barato é o produto 3");
            System.out.println("Com o preço de: " + prod3);
        }

        sc.close();
    }
}
