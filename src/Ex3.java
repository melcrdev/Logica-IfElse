import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letra = sc.next();

        if (letra.equalsIgnoreCase("M")) {
            System.out.println("Masculino");
        } else if (letra.equalsIgnoreCase("F")) {
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido");
        }

        sc.close();
    }
}
