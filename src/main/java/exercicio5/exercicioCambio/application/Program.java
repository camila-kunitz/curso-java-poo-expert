package exercicio5.exercicioCambio.application;

import exercicio5.exercicioCambio.entities.CurrencyCoverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do dólar? ");
        double dolar = sc.nextDouble();

        System.out.println("Quantos dólares serão comprados? ");
        double qtdeDolares = sc.nextDouble();

        double total =  CurrencyCoverter.cambio(dolar, qtdeDolares);

        System.out.printf("Valor a ser pago em reais = %.2f%n", total );


        sc.close();

    }
}
