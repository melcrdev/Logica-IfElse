import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letra = sc.next();

        switch (letra) {
            case "a":
                System.out.println("Vogal");
                break;
            case "e":
                System.out.println("Vogal");
                break;
            case "i":
                System.out.println("Vogal");
                break;
            case "o":
                System.out.println("Vogal");
                break;
            case "u":
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
        }


        sc.close();
    }
}
