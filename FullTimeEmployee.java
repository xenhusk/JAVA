public class FullTimeEmployee extends Employee {
    private double monthlySalary;
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
public void output(){
    System.out.print(monthlySalary);
}
}
