package exercicio5.exercicioRetangulo.application;

import exercicio5.exercicioRetangulo.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Entre com a largura e altura do retângulo: ");
        retangulo.widht = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.println();
        System.out.printf("Area = %.2f%n", retangulo.area(retangulo.widht, retangulo.height));
        System.out.printf("Perimetro = %.2f%n", retangulo.perimetro());
        System.out.printf("Diagonal = %.2f%n",  retangulo.diagonal());

        sc.close();
    }

}
