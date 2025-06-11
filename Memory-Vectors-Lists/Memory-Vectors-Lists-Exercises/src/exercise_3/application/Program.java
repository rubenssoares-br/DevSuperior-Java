package exercise_3.application;

import exercise_3.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ne;

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        ne = sc.nextInt();

        for (int i = 1; i <= ne; i++) {
            System.out.printf("Employee #%d%n", i);

            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            if (employees.size() > 0) {
                for (Employee employee : employees) {
                    while (employee.getId() == id) {
                        System.out.println("Id value must be unique, please change!");
                        System.out.print("Insert new id value: ");
                        id = sc.nextInt();
                    }
                }
            }

            Employee employee = new Employee(id, name, salary);

            employees.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        Integer idInputIncrease = sc.nextInt();
        Boolean verifyId = false;

        for (Employee employee : employees) {

            if (idInputIncrease.equals(employee.getId())) {
                System.out.print("Enter the percentage: ");
                Double percentage = sc.nextDouble();
                employee.increaseSalary(idInputIncrease, percentage);
                verifyId = true;
            }
        }

        if (!verifyId) {
            System.out.println("This id does not exist!");
        }

        System.out.println("\nList of employees: ");

        for (Employee employee : employees) {
            System.out.println(employee);
        }


        sc.close();
    }
}
