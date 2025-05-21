package exercise_2.application;

import exercise_2.entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.setName(sc.nextLine());

        System.out.print("Gross salary: ");
        employee.setGrossSalary(sc.nextDouble());

        System.out.print("Tax: ");
        employee.setTax(sc.nextDouble());

        System.out.printf("Employee: %s, $ %.2f%n", employee.getName(), employee.netSalary());

        System.out.print("What is the percentage to increase the salary? ");
        employee.increaseSalary(sc.nextDouble());

        System.out.printf("Updated data: %s, $ %.2f%n", employee.getName(), employee.netSalary());

        sc.close();
    }
}
