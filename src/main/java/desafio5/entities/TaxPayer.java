package desafio5.entities;

public class TaxPayer {

    private double salaryIncome;
    private double serviceIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;

    public TaxPayer() {
    }

    public TaxPayer(double salaryIncome, double serviceIncome, double capitalIncome, double healthSpending, double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.serviceIncome = serviceIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public double getServiceIncome() {
        return serviceIncome;
    }

    public void setServiceIncome(double serviceIncome) {
        this.serviceIncome = serviceIncome;
    }

    public double getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(double healthSpending) {
        this.healthSpending = healthSpending;
    }

    public double getEducationSpending() {
        return educationSpending;
    }

    public void setEducationSpending(double educationSpending) {
        this.educationSpending = educationSpending;
    }

    // Imposto sobre salário (tabela)
    public double salaryTax() {
        double salaryIncomeTax = 0;
        double salaryMonth = salaryIncome / 12;

        if (salaryMonth < 3000) {
            salaryIncomeTax = 0;
        } else if (salaryMonth >= 3000 && salaryMonth <= 5000) {
            salaryIncomeTax = salaryIncome * 0.10;
        } else {
            salaryIncomeTax = salaryIncome * 0.20;
        }
        return salaryIncomeTax;
    }

    // Imposto com prestação de serviço (15%)
    public double serviceTax() {
        return (serviceIncome > 0) ? (serviceIncome * 0.15) : 0;
    }

    // Imposto sobre ganho de capital (20%)
    public double capitalTax() {
        return (capitalIncome > 0) ? (capitalIncome * 0.20) : 0;
    }

    // Imposto Bruto
    public double grossTax() {
        return salaryTax() + serviceTax() + capitalTax();
    }

    // Deduções Imposto Bruto - Gastos Médicos e Educacionais (até 30%)
    public double taxRebate() {
        double expenseDiscount = healthSpending + educationSpending;
        double maxDiscount = grossTax() * 0.30;
        return (expenseDiscount <= maxDiscount) ? expenseDiscount : maxDiscount;
    }

    // Deduções Imposto Líquido
    public double netTax() {
        return grossTax() - taxRebate();
    }

}
