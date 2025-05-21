package exercise_2.entities;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double netSalary() {
        double netSalary = grossSalary - tax;
        return netSalary;
    }

    public void increaseSalary(double percentage) {
         grossSalary += grossSalary * percentage / 100;
    }
}
