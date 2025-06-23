package application;

import entities.Address;
import entities.Department;
import entities.Employee;

import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Department name: ");
        String dptName = sc.nextLine();

        System.out.print("Payment date: ");
        int paymentDay = sc.nextInt();

        sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Phone: ");
        String phone = sc.nextLine();

        Department dept = new Department(dptName, paymentDay, new Address(email, phone));

        System.out.print("How many employees does the department have? ");
        int employeeQuantity = sc.nextInt();

        sc.nextLine();

        for (int i = 1; i <= employeeQuantity; i++) {
            System.out.printf("Data employee %d:\n", i);

            System.out.print("Name: ");
            String employeeName = sc.nextLine();

            System.out.print("Salary: ");
            double salary  = sc.nextDouble();

            sc.nextLine();

            Employee employee = new Employee(employeeName, salary);

            dept.addEmployee(employee);
        }

        showReport(dept);

        sc.close();
    }

    private static void showReport(Department dept) {
        System.out.println("\nPAY ROLL:");

        System.out.printf("Department %s = R$ %.2f%n", dept.getName(), dept.payroll());

        System.out.printf("Payment made on the %dth\n", dept.getPayDay());

        System.out.println("Employees:");

        for (Employee employee : dept.getEmployees()) {
            System.out.println(employee);
        }

        System.out.printf("For questions, please contact: %s", dept.getAddress().getEmail());
    }

}
