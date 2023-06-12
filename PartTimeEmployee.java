
public class PartTimeEmployee extends Employee{
    double ratePerHour;
    int hoursWorked;
    private double wage;

    public void setWage(double ratePerHour, int hoursWorked) {
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
        this.wage = ratePerHour * hoursWorked;
    }
    
    public double getWage() {
        return wage;
    }

    public void output() {
    System.out.printf("%.2f%n", wage);
    }
}
