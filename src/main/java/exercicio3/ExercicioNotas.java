package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNotas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double primeiraNota, segundaNota, notaFinal;

        System.out.println("Digite a primeira nota: ");
        primeiraNota = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        segundaNota = sc.nextDouble();

        notaFinal = primeiraNota + segundaNota;

        System.out.printf("Nota final = %.1f%n ", notaFinal);

        if (notaFinal < 60.00) {
            System.out.println("REPROVADO");
        }
//        else {
//            System.out.printf("Nota final = %.1f%n ", notaFinal);
//        };

        sc.close();




    }
}
