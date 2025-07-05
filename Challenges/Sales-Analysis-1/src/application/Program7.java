package application;

import entities.Sale;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.CollationElementIterator;
import java.util.*;
import java.util.stream.Collectors;

public class Program7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Sale> listSale = new ArrayList<>();

            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                listSale.add(new Sale(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2], Integer.parseInt(fields[3]), Double.parseDouble(fields[4])));
            }

            Comparator<Sale> comp = Comparator.comparing(Sale::averagePrice);

            List<Sale> listFilteredSale = listSale.stream()
                    .filter(ob -> ob.getYear().equals(2016))
                    .sorted(comp)
                    .collect(Collectors.toList());

            Collections.reverse(listFilteredSale);

            for (int i = 0; i < 5; i++) {
                System.out.println(listFilteredSale.get(i));
            }

            Comparator<Sale> compLogan = Comparator.comparing(Sale::getTotal);

            List<Sale> listFilteredLogan = listSale.stream()
                    .filter(ob -> ob.getSeller().equals("Logan"))
                    .filter(ob -> ob.getMonth().equals(1) || ob.getMonth().equals(7))
                    .collect(Collectors.toList());

            double loganTotal = listFilteredLogan.stream()
                            .map(x -> x.getTotal())
                            .reduce((double) 0, (x, y) -> x+y );


            System.out.println("\nTotal value sold by Logan in months 1 and 7 = " + loganTotal);


        } catch (IOException e) {
            System.out.printf("Error: %s (The system cannot find the file specified)", path);
        }

        sc.close();
    }
}
