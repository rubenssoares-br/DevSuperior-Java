package exercise_3.entities;

public class Employee {

    private Integer id;
    private String name;
    private Double wage;

    public Employee() {
    }

    public Employee(Integer id, String name, Double wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    public void increaseSalary(Integer id, Double percentage) {
        Double newWage = wage + (wage * percentage / 100);
        setWage(newWage);
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f", id, name, wage);
    }
}
