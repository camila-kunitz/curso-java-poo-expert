package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMenorDeTres {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor1, valor2, valor3, menor;

        System.out.println("Digite o primeiro valor: ");
        valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        valor2 = sc.nextInt();

        System.out.println("Digite o terceiro valor: ");
        valor3 = sc.nextInt();

        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
        } else if (valor2 < valor1 && valor2 < valor3) {
            menor = valor2;
        } else {
            menor = valor3;
        }

        System.out.printf("Menor = %d\n", menor);

        sc.close();




    }
}
