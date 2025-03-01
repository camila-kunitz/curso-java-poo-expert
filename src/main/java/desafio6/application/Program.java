package desafio6.application;

import desafio6.entities.Address;
import desafio6.entities.Department;
import desafio6.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String nameDepSale = sc.nextLine();
        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();
        System.out.print("Email: ");
        sc.nextLine();
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        String fone = sc.nextLine();

        Address address = new Address(email, fone);

        Department department = new Department(nameDepSale, payDay, address);

        System.out.print("Quantos funcionários tem o departamento? ");
        int numEmployees = sc.nextInt();

        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("Dados do funcionário " + i + ":");

            System.out.print("Nome: ");
            sc.nextLine();
            String nameEmployee = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(nameEmployee, salary);

            department.addEmployee(employee);
        }

        System.out.println();
        System.out.println("FOLHA DE PAGAMENTO:");
        System.out.println(department);

        sc.close();
    }
}
