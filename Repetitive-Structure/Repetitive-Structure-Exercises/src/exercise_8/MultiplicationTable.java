package exercise_8;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberTable;
        int result;

        System.out.print("Do you want the multiplication table for which value? ");
        numberTable = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            result = numberTable * i;
            System.out.printf("%d x %d = %d\n", numberTable, i, result);
        }

        sc.close();
    }
}
