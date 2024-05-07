package calcularimposto;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Quarto {

    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("#0.00");

        Scanner scanner = new Scanner(System.in);

        double salarioBRT = 0;

        System.out.println("Digite o salário bruto: ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Digite o salário bruto (apenas números): ");
            scanner.nextLine();
        }

        salarioBRT = scanner.nextDouble();
        scanner.close();



        Calculadora calculadora = new Calculadora(salarioBRT);

        double descontoFGTS = calculadora.calculoFGTS(salarioBRT);
        double descontoINSS = calculadora.calculoINSS(salarioBRT);
        double descontoTotal = calculadora.descontoTotal(descontoINSS, descontoFGTS);
        double salarioLQD = calculadora.calculoSalarioLQD(salarioBRT, descontoTotal);

        System.out.println("Salário Bruto: R$ " + formatter.format(salarioBRT));
        System.out.println("FGTS: R$ " +formatter.format(descontoFGTS));
        System.out.println("INSS: R$ " + formatter.format(descontoINSS));
        System.out.println("Desconto total: R$ " + formatter.format(descontoTotal));
        System.out.println("Salário Líquido: R$ " + formatter.format(salarioLQD));
    }
}
