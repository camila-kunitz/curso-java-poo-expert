package exercicio7.exercicioMaiorPosicao;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int numbers = sc.nextInt();
        double[] vectNumbers = new double[numbers];

        for (int i=0; i<vectNumbers.length; i++) {
            sc.nextLine();
            System.out.print("Digite um número: ");
            vectNumbers[i] = sc.nextDouble();
        }

        double maior = vectNumbers[0];
        int posicaoMaior = 0;
        for (int i=0; i<vectNumbers.length; i++) {
            if (vectNumbers[i] > maior) {
                maior = vectNumbers[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicaoMaior);

        sc.close();
    }
}
