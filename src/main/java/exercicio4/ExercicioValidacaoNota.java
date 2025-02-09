package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioValidacaoNota {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       double nota1, nota2, mediaNotas;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

            while (nota1 < 0 || nota1 > 10) {
                System.out.println("Nota inválida. A nota deve ser entre 0 e 10");
                nota1 = sc.nextInt();
            }

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        while (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota inválida. A nota deve ser entre 0 e 10");
            nota2 = sc.nextInt();
        }

        mediaNotas = (nota1 + nota2) / 2;

        System.out.printf("Media = %.2f\n", mediaNotas);

        sc.close();
    }
}
