package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTerreno {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura;
        double comprimento;
        double valorM2;
        double area;
        double preco;


        System.out.println("Digite a largura do terreno: ");
        largura = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Largura do terreno: %.1f%n", largura);

        System.out.println("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Comprimento do terreno: %.1f%n", comprimento);

        System.out.println("Digite o valor do metro quadrado: ");
        valorM2 = sc.nextDouble();
        sc.nextLine();
        System.out.printf("Valor do metro quadrado: %.2f%n ", valorM2);

        area = (largura + largura) / 2.0 * comprimento;
        System.out.printf("Area do terreno = %.2f%n ", area);

        preco = area * valorM2;
        System.out.printf("Preço terreno = %.2f%n ", preco);

        sc.close();

    }
}
