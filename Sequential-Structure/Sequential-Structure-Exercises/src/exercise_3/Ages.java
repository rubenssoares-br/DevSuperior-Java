package exercise_3;

import java.util.Scanner;

public class Ages {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nameFirstPerson, nameSecondPerson;
        double ageFirstPerson, ageSecondPerson, averageAge;

        System.out.println("First person data: ");

        System.out.print("Name: ");
        nameFirstPerson = sc.nextLine();

        System.out.print("Age: ");
        ageFirstPerson = sc.nextDouble();

        sc.nextLine();

        System.out.println("Second person data: ");

        System.out.print("Name: ");
        nameSecondPerson = sc.nextLine();

        System.out.print("Age: ");
        ageSecondPerson = sc.nextDouble();

        sc.nextLine();

        averageAge = (ageFirstPerson + ageSecondPerson) / 2;

        System.out.printf("The average age of %s and %s is %.1f years", nameFirstPerson, nameSecondPerson, averageAge);

        sc.close();

    }
}
