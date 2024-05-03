package calcularimposto;
public class Segundo {

    public static class Calculadora {
        Calculadora(double salarioBRT) {
            this.salarioBRT = salarioBRT;
        }

        double salarioBRT;

        double calculoINSS(double salarioBRT) {
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

            return calculoINSS;
        }

        double calculoFGTS(double salarioBRT) {
            double calculoFGTS = (salarioBRT * 8) / 100;
            
            return calculoFGTS;
        }

        double descontoTotal(double descontoINSS, double descontoFGTS) {
            double descontoTotal = descontoINSS + descontoFGTS;

            return descontoTotal;
        }
        
        double calculoSalarioLQD(double salarioBRT, double descontoTotal) {
            double salarioLQD = salarioBRT - descontoTotal;

            return salarioLQD;
        }
    }
}
//     public static void main(String[] args) {
//         double salarioBRT = Double.valueOf(args[0]);

//         Calculadora calculadora = new Calculadora(salarioBRT);


//         double descontoINSS = calculadora.calculoFGTS(salarioBRT);
//         double descontoFGTS = calculadora.calculoINSS(salarioBRT);
//         double descontoTotal = calculadora.descontoTotal(descontoINSS, descontoFGTS);
//         double salarioLQD = calculadora.calculoSalarioLQD(salarioBRT, descontoTotal);

//         System.out.println("Salário Bruto: " + salarioBRT);
//         System.out.println("INSS: " + descontoINSS);
//         System.out.println("FGTS: " + descontoFGTS);
//         System.out.println("Salário Líquido: " + salarioLQD);
//     }
// }
