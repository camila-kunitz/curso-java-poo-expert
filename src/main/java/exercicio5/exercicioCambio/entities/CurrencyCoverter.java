package exercicio5.exercicioCambio.entities;

public class CurrencyCoverter {


        public static final double IOF = 0.06;

        public static double cambio (double valorDolar, double qtdeDolares) {
               return valorDolar * qtdeDolares * (1.0 + IOF);
        }
}