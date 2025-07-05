package application;

import entities.Sale2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        Map<String, Double> sellerTotalSales;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            sellerTotalSales = br.lines()
                    .map(line -> {
                        String[] fields = line.split(",");
                        return new Sale2(Integer.parseInt(fields[0]),
                                Integer.parseInt(fields[1]),
                                fields[2],
                                Integer.parseInt(fields[3]),
                                Double.parseDouble(fields[4]));
                    })
                    .collect(Collectors.groupingBy(
                            Sale2::getSeller,
                            Collectors.summingDouble(Sale2::getTotal)
                    ));

            System.out.println("Total sales by supplier: ");

            for (Map.Entry<String, Double> entry : sellerTotalSales.entrySet()) {
                System.out.printf("%s - R$ %.2f%n", entry.getKey(), entry.getValue());
            }

        } catch (IOException e) {
            System.out.printf("Error: %s (The system cannot find the file specified)%n", path);
        } finally {
            sc.close();
        }
    }
}