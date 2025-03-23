package desafio8.application;

import desafio8.entities.Sale;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre o caminho do arquivo: ");
        String path = sc.nextLine();

        List<Sale> sales = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                Integer month = Integer.parseInt(fields[0]);
                Integer year = Integer.parseInt(fields[1]);
                String seller = fields[2];
                Integer items = Integer.parseInt(fields[3]);
                Double total = Double.parseDouble(fields[4]);

                sales.add(new Sale(month, year, seller, items, total));
                line = br.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException("Erro: " + path + " (O sistema não pode encontrar o arquivo especificado)");
        }

        System.out.print("Cinco primeiras vendas de 2016 de maior preço médio \n");

        Comparator<Sale> comp = (s1, s2) -> s1.averagePrice().compareTo(s2.averagePrice());

        sales.stream()
                .filter(s -> s.getYear().equals(2016))                  // Filtra os resultados do ano de 2016
                .sorted(comp.reversed())                                // Ordena em ordem decrescente
                .limit(5)                                       // Pega apenas os 5 primeiros
                .forEach(s -> System.out.println(s.toString()));        // Imprime a venda

        Double result = sales.stream()
                .filter(s -> s.getSeller().equals("Logan") && (s.getMonth().equals(1) || s.getMonth().equals(7)))
                .map(s -> s.getTotal())
                .reduce(0D, (subtotal, element) -> subtotal + element);

        System.out.print("Valor total vendido pelo vendedor Logan nos meses 1 e 7 = " + result);

        sc.close();
    }
}
