import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O maior é: " + n1);
            if (n2 > n3) {
                System.out.println("O menor é: " + n3);
            } else {
                System.out.println("O menor é: " + n2);
            }
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior é: " + n2);
            if (n1 > n3) {
                System.out.println("O menor é: " + n3);
            } else {
                System.out.println("O menor é: " + n2);
            }
        } else {
            System.out.println("O maior é: " + n3);
            if (n1 > n2) {
                System.out.println("O menor é: " + n2);
            } else {
                System.out.println("O menor é: " + n1);
            }
        }

        sc.close();
    }
}
