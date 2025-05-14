import java.util.Scanner;

public class Athletes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        String name, tallestAthlete = "";
        double totalHeight = 0, previousHeight = 0, height, averageWeight, totalWeight = 0, weight, menPercentage, averageHeightFemales, womanTotalHeight = 0, totalF = 0, totalM = 0, totalAthletes;
        char sex;

        System.out.print("What is the number of athletes? ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter athlete number data %d:\n", i);
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();

            System.out.print("Sex: ");
            sex = sc.next().charAt(0);

            while (sex != 'F' && sex != 'M') {
                System.out.print("Invalid value! Please enter F or M: ");
                sex = sc.next().charAt(0);
            }

            if (sex == 'F') {
                totalF++;
            } else if (sex == 'M') {
                totalM++;
            }

            System.out.print("Height: ");
            height = sc.nextDouble();
            while (height <= 0) {
                System.out.print("Invalid value! Enter a positive value: ");
                height = sc.nextDouble();
            }

            if (height > previousHeight) {
                previousHeight = height;
                tallestAthlete = name;
            }

            if (sex == 'F') {
                womanTotalHeight += height;
            }

            System.out.print("Weight: ");
            weight = sc.nextDouble();

            while (weight <= 0) {
                System.out.print("Invalid value! Enter a positive value: ");
                weight = sc.nextDouble();
            }
            totalWeight += weight;
        }

        averageWeight = totalWeight / n;
        totalAthletes = totalF + totalM;
        menPercentage =  (totalM / totalAthletes) * 100;

        System.out.println("Report:");
        System.out.printf("Average weight of athletes: %.2f%n", averageWeight);
        System.out.printf("Tallest athlete: %s%n", tallestAthlete);
        System.out.printf("Men percentage: %.1f %%%n", menPercentage);
        if (totalF > 0) {
            averageHeightFemales = womanTotalHeight / totalF;
            System.out.printf("Average height of women: %.2f%n", averageHeightFemales);
        } else {
            System.out.println("There are no registered women");
        }

        sc.close();

    }
}
