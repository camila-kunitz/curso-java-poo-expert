package desafio2;

import java.util.Locale;
import java.util.Scanner;

public class DesafioAtletas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdeAtletas, qtdeHomens = 0, qtdeMulheres = 0;
        String nome, atletaMaisAlto = null;
        String sexo;
        Double altura, peso, somaPeso = 0.0, maiorAltura = 0.0, alturaMulheres = 0.0, alturaMediaMulheres = 0.0;

        System.out.println("Qual a quantidade de atletas: ");
        qtdeAtletas = sc.nextInt();

        for (int i = 1; i <= qtdeAtletas; i++) {
            System.out.println("Digite os dados do atleta número " + i + ":");
            sc.nextLine();

            // NOME
            nome = sc.nextLine();
            System.out.println("Nome: " + nome);

            // SEXO
            sexo = sc.nextLine().toUpperCase();

            while (!sexo.equals("M") && !sexo.equals("F")) {
                System.out.println("Valor inválido! Favor digitar F ou M: " + sexo);
                sexo = sc.nextLine();
            }

            if (sexo.equals("F")) {
                qtdeMulheres++;
            }

            if (sexo.equals("M")) {
                qtdeHomens++;
            }

            System.out.println("Sexo: " + sexo);

            // ALTURA
            altura = sc.nextDouble();
            while (altura <= 0) {
                System.out.print("Valor inválido! Por favor digitar um valor de altura positivo: " + altura);
                altura = sc.nextDouble();
            }
            System.out.println("Altura: " + altura);

            if (maiorAltura < altura) {
                atletaMaisAlto = nome;
                maiorAltura = altura;
            }

            if (sexo.equals("F")) {
                alturaMulheres += altura;
            }

            // PESO
            peso = sc.nextDouble();
            while (peso <= 0) {
                System.out.print("Valor inválido! Por favor digitar um valor de peso positivo: " + peso);
                peso = sc.nextDouble();
            }
            System.out.println("Peso: " + peso);

            somaPeso += peso;
        }

        // RELATÓRIO

        Double pesoMedio = somaPeso / qtdeAtletas;
        System.out.printf("Peso médio dos atletas: %.2f\n", pesoMedio);

        System.out.println("Atleta mais alto: " + atletaMaisAlto);

        Double porcentagemDeHomens = (double) qtdeHomens / (double) qtdeAtletas * 100;
        System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagemDeHomens);

        alturaMediaMulheres = alturaMulheres / (double) qtdeMulheres;

        if (qtdeMulheres > 0) {
            System.out.printf("Altura média das mulheres: %.2f%n", alturaMediaMulheres);
        } else {
            System.out.println("Não há mulheres cadastradas");
        }

        sc.close();
    }

}
