import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double aumento;

        if (salario <= 280.0) {
            System.out.println("O seu salario é de: R$" + salario);
            System.out.println("O seu percentual de aumento vai ser de: 20%");
            aumento = (salario * 20) / 100;
            System.out.println("O seu aumento vai ser de: R$" + aumento);
            salario += aumento;
            System.out.printf("O seu novo salário é de R$%.2f%n", salario);
        } else if (salario > 280.0 && salario <= 700.0){
            System.out.println("O seu salario é de: R$" + salario);
            System.out.println("O seu percentual de aumento vai ser de: 15%");
            aumento = (salario * 15) / 100;
            System.out.println("O seu aumento vai ser de: R$" + aumento);
            salario += aumento;
            System.out.printf("O seu novo salário é de R$%.2f%n", salario);
        } else if (salario > 700.0 && salario <= 1500) {
            System.out.println("O seu salario é de: R$" + salario);
            System.out.println("O seu percentual de aumento vai ser de: 10%");
            aumento = (salario * 10) / 100;
            System.out.println("O seu aumento vai ser de: R$" + aumento);
            salario += aumento;
            System.out.printf("O seu novo salário é de R$%.2f%n", salario);
        } else {
            System.out.println("O seu salario é de: R$" + salario);
            System.out.println("O seu percentual de aumento vai ser de: 5%");
            aumento = (salario * 5) / 100;
            System.out.println("O seu aumento vai ser de: R$" + aumento);
            salario += aumento;
            System.out.printf("O seu novo salário é de R$%.2f%n", salario);
        }

        sc.close();
    }
}
