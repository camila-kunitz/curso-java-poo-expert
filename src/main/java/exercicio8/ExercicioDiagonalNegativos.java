package exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDiagonalNegativos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("DIAGONAL PRINCIPAL:");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", mat[i][i]);
        }

        int qtdeNegativos = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    qtdeNegativos++;
                }
            }
        }

        System.out.printf("\nQUANTIDADE DE NEGATIVOS = %d\n", qtdeNegativos);

        sc.close();
    }
}
