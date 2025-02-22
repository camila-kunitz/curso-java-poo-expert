package exercicio7.exercicioNumeroNegativo;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int numbers = sc.nextInt();
        int[] vectNumbers = new int[numbers];

        for (int i=0; i<vectNumbers.length; i++) {
            sc.nextLine();
            System.out.print("Digite um número: ");
            vectNumbers[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS ");

        for (int i=0; i<vectNumbers.length; i++) {
            if (vectNumbers[i] < 0) {
                System.out.println(vectNumbers[i]);
            }
        }

        sc.close();
    }
}
