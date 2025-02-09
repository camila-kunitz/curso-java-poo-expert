package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMediaIdades {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade, qtdPessoas = 0;
        double soma = 0, media;

        System.out.println("Digite as idades: ");
        idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("Impossível Calcular");
        } else {
            while(idade >= 0) {
                soma+= idade;
                qtdPessoas++;
                idade = sc.nextInt();
            }

            media = soma / qtdPessoas;
            System.out.printf("Media = %.2f\n", media);
        }



        sc.close();
    }
}
