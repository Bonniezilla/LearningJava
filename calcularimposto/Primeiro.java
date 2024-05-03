package calcularimposto;
public class Primeiro {

    public static double[] calculoDesconto(double salarioBRT) {
        double taxaINSS = 0;

        if (salarioBRT <= 2500) {
            taxaINSS = 7.5;
        } else if(salarioBRT <= 5500) {
            taxaINSS = 9;
        } else if(salarioBRT <= 10000) {
            taxaINSS = 12;
        } else {
            taxaINSS = 14;
        }

        double calculoINSS = 0;

        if ((salarioBRT * taxaINSS) / 100 <= 3200) {
            calculoINSS = (salarioBRT * taxaINSS) / 100;
        } else {
            calculoINSS = 3200;
        }

        double calculoFGTS = (salarioBRT * 8) / 100;

        double[] descontos = new double[3];
        descontos[0] = salarioBRT - calculoINSS - calculoFGTS;
        descontos[1] = calculoINSS;
        descontos[2] = calculoFGTS;
        
        return descontos;
    }

    public static void main(String[] args) {
        double salarioBRT = Double.valueOf(args[0]);
        
        double descontoTotal = calculoDesconto(salarioBRT)[0];
        double descontoINSS = calculoDesconto(salarioBRT)[1];
        double descontoFGTS = calculoDesconto(salarioBRT)[2];

        double salarioLQD = (salarioBRT - descontoTotal);

        System.out.println("Salário bruto: " + salarioBRT);
        System.out.println("INSS: " + descontoINSS);
        System.out.println("FGTS: " + descontoFGTS);
        System.out.println("Desconto total: " + descontoTotal);
        System.out.println("Salário liquído: " + salarioLQD);

        return;
    }
    
}