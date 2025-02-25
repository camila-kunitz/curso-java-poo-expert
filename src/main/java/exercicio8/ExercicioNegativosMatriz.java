package exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNegativosMatriz {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual quantidade de linhas da matriz? ");
        int lineMat = sc.nextInt();

        System.out.print("Qual quantidade de colunas da matriz? ");
        int columMat = sc.nextInt();

        int[][] mat = new int[lineMat][columMat];


        for (int i = 0; i < lineMat; i++) {
            for (int j = 0; j < columMat; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("VALORES NEGATIVOS: ");

        for (int i = 0; i < lineMat; i++) {
            for (int j = 0; j < columMat; j++) {
                if (mat[i][j] < 0) {
                    System.out.printf("%d\n", mat[i][j]);
                }
            }
        }

        sc.close();
    }
}
