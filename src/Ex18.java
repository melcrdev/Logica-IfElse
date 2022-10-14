import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um data no formato dd/mm/aaaa");
        int data = sc.nextInt();

        if (data <= 31129999) {
            System.out.println("Data válida!");
        } else {
            System.out.println("Data inválida!");
        }

        sc.close();
    }
}
