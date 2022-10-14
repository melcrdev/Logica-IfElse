import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro menor que 1000");
        int num = sc.nextInt();

        int centena, dezena, unidade, restoC, restoD;

        centena = num / 100;
        restoC =  num % 100;

        dezena = restoC / 10;
        restoD = restoC % 10;

        unidade = restoD;

        System.out.println(centena + " centenas, " + dezena + " dezenas, e " + unidade + " unidades.");



        sc.close();
    }
}
