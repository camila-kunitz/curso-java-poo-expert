package desafio1;

import java.util.Locale;
import java.util.Scanner;

public class DesafioImposto {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double rendaAnualSalario = 0;
        double rendaPrestacaoServico = 0;
        double rendaGanhoCapital = 0;
        double gastosMedicos = 0;
        double gastosEducacionais = 0;

        System.out.println("Insira sua renda anual com salário: ");
        rendaAnualSalario = sc.nextDouble();

        System.out.println("Insira sua renda anual com pretação de serviço: ");
        rendaPrestacaoServico = sc.nextDouble();

        System.out.println("Insira sua renda anual com ganho de capital: ");
        rendaGanhoCapital = sc.nextDouble();

        System.out.println("Insira seus gatos médicos: ");
        gastosMedicos = sc.nextDouble();

        System.out.println("Insira seus gastos educacionais: ");
        gastosEducacionais = sc.nextDouble();

        double impostoSobreSalario = 0;
        double impostoServico = 0;
        double impostoGanhoCapital = 0;
        double rendaSalarioMensal = rendaAnualSalario / 12;

        // Imposto sobre salário (tabela)
        if (rendaSalarioMensal < 3000) {
            impostoSobreSalario = 0;
        } else if (rendaSalarioMensal >= 3000 && rendaSalarioMensal <= 5000 ) {
            impostoSobreSalario = rendaAnualSalario * 0.10;
        } else {
            impostoSobreSalario = rendaAnualSalario * 0.20;
        }

        // Imposto sobre serviço / prestação de serviço (15%)
        if(rendaPrestacaoServico > 0) {
            impostoServico = rendaPrestacaoServico * 0.15;
        }

        // Imposto sobre ganho de capital (20%)
        if(rendaGanhoCapital > 0) {
            impostoGanhoCapital = rendaGanhoCapital * 0.20;
        }

        double impostoBrutoTotal = impostoSobreSalario + impostoServico + impostoGanhoCapital;

        // Deduções (até 30%)
        double gastosDedutiveis = gastosMedicos + gastosEducacionais;
        double maximoDedutivel = impostoBrutoTotal * 0.30;
        double abatimento = 0;

        abatimento = (gastosDedutiveis <= maximoDedutivel) ? gastosDedutiveis : maximoDedutivel;
        double impostoDevido = impostoBrutoTotal - abatimento;

        // Consolidado de renda
        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println();
        System.out.println("CONSOLIDADO DE RENDA");
        System.out.printf("Imposto sobre salário: %.2f%n", impostoSobreSalario);
        System.out.printf("Imposto sobre serviço: %.2f%n", impostoServico);
        System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoGanhoCapital);
        System.out.println();

        // Deduções
        System.out.println("DEDUÇÕES");
        System.out.printf("Máximo dedutível:  %.2f%n", maximoDedutivel);
        System.out.printf("Gastos dedutíveis:  %.2f%n", gastosDedutiveis);
        System.out.println();

        // Resumo
        System.out.println("RESUMO");
        System.out.printf("Imposto Bruto total:  %.2f%n", impostoBrutoTotal);
        System.out.printf("Abatimento:  %.2f%n", abatimento);
        System.out.printf("Imposto devido:  %.2f%n", impostoDevido);

        sc.close();
    }
}
