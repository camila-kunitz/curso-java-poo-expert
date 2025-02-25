package exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaLinhas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual quantidade de linhas da matriz? ");
        int lineMat = sc.nextInt();

        System.out.print("Qual quantidade de colunas da matriz? ");
        int columMat = sc.nextInt();

        double[][] mat = new double[lineMat][columMat];
        double[] vetor = new double[lineMat];

        for (int i = 0; i < lineMat; i++) {
            System.out.println("Digite os elementos da " + (i + 1) + " linha : ");
            for (int j = 0; j < columMat; j++) {
                mat[i][j] = (int) sc.nextDouble();
            }
        }

        for (int i = 0; i < lineMat; i++) {
            System.out.print("VETOR GERADO:");
            double sum = 0;
            for (int j = 0; j < columMat; j++) {
                sum = sum + mat[i][j];
            }
            vetor[i] = sum;
            System.out.println(vetor[i]);
        }

        sc.close();
    }
}
