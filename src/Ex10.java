import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um turno M-matutino, V-vespertino e N-noturno.");
        String turno = sc.next();

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa Tarde!");
        } else if (turno.equalsIgnoreCase("N")){
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Inválido");
        }

        sc.close();
    }
}
