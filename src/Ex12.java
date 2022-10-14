import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor da sua hora de trabalho ?");
        double valorHora = sc.nextDouble();
        System.out.println("Qual a quantidade de hora que você trabalha por mês ?");
        double horasMes = sc.nextDouble();

        double salarioBruto = horasMes * valorHora;
        double IR, INSS, FGTS, totalDesc, salarioLiquido;

        if (salarioBruto <= 900.0) {
            System.out.println("Salário Bruto: (" + valorHora + " * " + horasMes + "): R$ " + salarioBruto);
            IR = 0;
            System.out.println("(-) IR (Isento)");
            INSS = (salarioBruto * 10) / 100;
            System.out.println("(-) INSS (10%): R$" + INSS);
            FGTS = (salarioBruto * 11) / 100;
            System.out.println("FGTS (11%): R$" + FGTS);
            totalDesc = INSS + IR;
            System.out.println("Total de descontos: R$" + totalDesc);
            salarioLiquido = salarioBruto - totalDesc;
            System.out.println("Salário líquido: R$" + salarioLiquido);
        } else if (salarioBruto > 900.0 && salarioBruto <= 1500.0) {
            System.out.println("Salário Bruto: (" + valorHora + " * " + horasMes + "): R$ " + salarioBruto);
            IR = (salarioBruto * 5) / 100;
            System.out.println("(-) IR (5%): R$" + IR);
            INSS = (salarioBruto * 10) / 100;
            System.out.println("(-) INSS (10%): R$" + INSS);
            FGTS = (salarioBruto * 11) / 100;
            System.out.println("FGTS (11%): R$" + FGTS);
            totalDesc = INSS + IR;
            System.out.println("Total de descontos: R$" + totalDesc);
            salarioLiquido = salarioBruto - totalDesc;
            System.out.println("Salário líquido: R$" + salarioLiquido);
        } else if (salarioBruto > 1500.0 && salarioBruto <= 2500.0) {
            System.out.println("Salário Bruto: (" + valorHora + " * " + horasMes + "): R$ " + salarioBruto);
            IR = (salarioBruto * 10) / 100;
            System.out.println("(-) IR (10%): R$" + IR);
            INSS = (salarioBruto * 10) / 100;
            System.out.println("(-) INSS (10%): R$" + INSS);
            FGTS = (salarioBruto * 11) / 100;
            System.out.println("FGTS (11%): R$" + FGTS);
            totalDesc = INSS + IR;
            System.out.println("Total de descontos: R$" + totalDesc);
            salarioLiquido = salarioBruto - totalDesc;
            System.out.println("Salário líquido: R$" + salarioLiquido);
        } else {
            System.out.println("Salário Bruto: (" + valorHora + " * " + horasMes + "): R$ " + salarioBruto);
            IR = (salarioBruto * 20) / 100;
            System.out.println("(-) IR (20%): R$" + IR);
            INSS = (salarioBruto * 10) / 100;
            System.out.println("(-) INSS (10%): R$" + INSS);
            FGTS = (salarioBruto * 11) / 100;
            System.out.println("FGTS (11%): R$" + FGTS);
            totalDesc = INSS + IR;
            System.out.println("Total de descontos: R$" + totalDesc);
            salarioLiquido = salarioBruto - totalDesc;
            System.out.println("Salário líquido: R$" + salarioLiquido);
        }

        sc.close();
    }
}
