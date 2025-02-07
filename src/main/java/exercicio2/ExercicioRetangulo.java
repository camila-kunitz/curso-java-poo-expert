package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioRetangulo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base;
        double altura;
        double area;
        double perimetro;
        double diagonal;


        System.out.println("Digite a base do retângulo: ");
        base = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Base do retângulo: %.1f%n", base);

        System.out.println("Digite a altura do retângulo: ");
        altura = sc.nextDouble();
        sc.nextLine();
        System.out.printf("altura do retângulo: %.1f%n", altura);

        area = base * altura;
        System.out.printf("Area = %.4f%n ", area);

        perimetro = (base + altura) * 2;
        System.out.printf("Perimetro = %.4f%n ", perimetro);


        diagonal = Math.sqrt(base * base + altura * altura);
        System.out.printf("Diagonal = %.4f%n ", diagonal);

        sc.close();

    }
}
