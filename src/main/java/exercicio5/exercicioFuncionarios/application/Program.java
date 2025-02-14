package exercicio5.exercicioFuncionarios.application;

import exercicio5.exercicioFuncionarios.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Nome: ");
        employee.name = sc.nextLine();

        System.out.print("Salário bruto: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + employee);

        System.out.println("Qual a porcentagem para aumentar o salário? ");
        double percent = sc.nextDouble();
        employee.increaseSalary(percent);

        System.out.println();
        System.out.println("Dados atualizados: " + employee); ;

        sc.close();
    }

}
