package desafio5.application;

import desafio5.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos contribuintes você vai digitar? ");
        int contributors = sc.nextInt();
        System.out.println();

        List<TaxPayer> taxPayerList = new ArrayList<>();

        for (int i = 0; i < contributors; i++) {
            System.out.print("Digite os dados do " + (i + 1) + " contribuinte: ");
            System.out.println();
            System.out.print("Renda anual com salário: ");
            double salaryIncome = sc.nextDouble();

            System.out.print("Renda anual com prestação de serviço: ");
            double servicesIncome = sc.nextDouble();

            System.out.print("Renda anual com ganho de capital: ");
            double capitalIncome = sc.nextDouble();

            System.out.print("Gastos médicos: ");
            double healthSpending = sc.nextDouble();

            System.out.print("Gastos educacionais: ");
            double educationSpending = sc.nextDouble();

            TaxPayer newPayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
            taxPayerList.add(newPayer);

            System.out.println();
        }

        for (int i = 0; i < taxPayerList.size(); i++) {
            System.out.println("Resumo do " + (i + 1) + " contribuinte: ");
            System.out.printf("Imposto bruto total : %.2f%n", taxPayerList.get(i).grossTax());
            System.out.printf("Abatimento : %.2f%n", taxPayerList.get(i).taxRebate());
            System.out.printf("Imposto devido : %.2f%n", taxPayerList.get(i).netTax());
            System.out.println();
        }

        sc.close();
    }
}
