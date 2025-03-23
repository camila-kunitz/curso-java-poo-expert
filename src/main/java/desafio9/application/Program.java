package desafio9.application;

import desafio9.entities.Sale;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

        Set<String> uniqueNames = sales.stream()
                .map(s -> s.getSeller())
                .collect(Collectors.toSet());

        System.out.println("Total de vendas por vendedor: ");

        for (String name : uniqueNames) {
            Double result = sales.stream()
                    .filter(s -> s.getSeller().equals(name))
                    .map(s -> s.getTotal())
                    .reduce(0D, (subtotal, element) -> subtotal + element);

            System.out.println(String.format("%s - R$ %4.2f", name, result));
        }

        sc.close();
    }
}
