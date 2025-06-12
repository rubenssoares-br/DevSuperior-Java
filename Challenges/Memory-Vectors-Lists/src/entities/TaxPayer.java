package entities;

public class TaxPayer {
    private Double salaryIncome;
    private Double servicesIncome;
    private Double capitalIncome;
    private Double healthSpending;
    private Double educationSpending;

    public TaxPayer() {
    }

    public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending, Double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public Double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(Double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public Double getServicesIncome() {
        return servicesIncome;
    }

    public void setServicesIncome(Double servicesIncome) {
        this.servicesIncome = servicesIncome;
    }

    public Double getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(Double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(Double healthSpending) {
        this.healthSpending = healthSpending;
    }

    public Double getEducationSpending() {
        return educationSpending;
    }

    public void setEducationSpending(Double educationSpending) {
        this.educationSpending = educationSpending;
    }

    public Double salaryTax() {

        double salaryPerMonth = salaryIncome / 12;

        if (salaryPerMonth < 3000.00) {
            return 0.00 * salaryIncome;
        } else if (salaryPerMonth >= 3000.00 && salaryPerMonth <= 5000.00) {
            return 0.10 * salaryIncome;
        } else {
            return 0.20 * salaryIncome;
        }
    }

    public Double servicesTax() {
        if (servicesIncome > 0.00) {
            return 0.15 * servicesIncome;
        } else {
            return 0 * servicesIncome;
        }
    }

    public Double capitalTax() {
        if (capitalIncome > 0) {
            return 0.20 * capitalIncome;
        } else {
            return 0 * capitalIncome;
        }
    }

    public Double grossTax() {
       return salaryTax() + servicesTax() + capitalTax();
    }

    public Double taxRebate() {
        if (grossTax() * 0.3 < healthSpending + educationSpending) {
            return  grossTax() * 0.3;
        } else {
            return healthSpending + educationSpending;
        }
    }

    public Double netTax() {
        return grossTax() - taxRebate();
    }



    @Override
    public String toString() {
        return "TaxPayer{" +
                "salaryIncome=" + salaryIncome +
                ", servicesIncome=" + servicesIncome +
                ", capitalIncome=" + capitalIncome +
                ", healthSpending=" + healthSpending +
                ", educationSpending=" + educationSpending +
                '}';
    }
}
