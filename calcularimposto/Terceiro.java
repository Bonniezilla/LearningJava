package calcularimposto;

public class Terceiro {
    public static void main(String[] args) {
        double salarioBRT = Double.valueOf(args[0]);

        Calculadora calculadora = new Calculadora(salarioBRT);

        double descontoFGTS = calculadora.calculoFGTS(salarioBRT);
        double descontoINSS = calculadora.calculoINSS(salarioBRT);
        double descontoTotal = calculadora.descontoTotal(descontoINSS, descontoFGTS);
        double salarioLQD = calculadora.calculoSalarioLQD(salarioBRT, descontoTotal);

        System.out.println("Salário Bruto: " + salarioBRT);
        System.out.println("FGTS: " + descontoFGTS);
        System.out.println("INSS: " + descontoINSS);
        System.out.println("Desconto total: " + descontoTotal);
        System.out.println("Salário Líquido: " + salarioLQD);
    }
}
