package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return this.grossSalary - this.tax;
    }

    public void IncreaseSalary(double percentage){
        grossSalary += grossSalary * percentage / 100.0;

    }

    public String toString(){
        String salaryFormat = String.format("%.2f", NetSalary());

        return "Employee: " + name + ", $ " + salaryFormat;
    }
}
