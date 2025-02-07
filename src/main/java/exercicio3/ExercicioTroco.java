package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTroco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoUnitario;
        double valorRecebido;
        double troco;
        double precoProduto;
        int quantidade;

        System.out.println("Digite o preço unitário do produto: ");
        precoUnitario = sc.nextInt();

        System.out.println("Digite a quantidade comprada: ");
        quantidade = sc.nextInt();

        System.out.println("Digite o valor recebido: ");
        valorRecebido = sc.nextInt();

        precoProduto = precoUnitario * quantidade;
        troco =  valorRecebido - precoProduto;

        if (valorRecebido < precoProduto) {
            System.out.printf("Dinheiro insuficiente. Faltam %.2f reais", troco);
        } else if (valorRecebido > precoProduto) {
            System.out.printf("TROCO = %.2f%n ", troco);
        }


        sc.close();

    }
}
