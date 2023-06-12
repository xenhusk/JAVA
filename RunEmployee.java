import java.util.Scanner;
public class RunEmployee {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
System.out.print("Enter name: ");
Employee emp = new Employee();
String name = input.nextLine();
emp.setName(name);
System.out.println("Press F for Full Time or P for Part Time");
char time = input.next().charAt(0);

if (time == 'F' || time == 'f'){
System.out.println("input Monthly Salary: ");
double monthlySalary = input.nextDouble();
FullTimeEmployee fte = new FullTimeEmployee();
fte.setMonthlySalary(monthlySalary);
System.out.print("Name: "); emp.output(); System.out.printf("\n");
System.out.print("Wage: "); fte.output(); System.out.printf("\n");
}

if(time == 'P' || time == 'p'){
System.out.println("Enter rate per hour and no. of hours worked seperated by space: ");
System.out.println("Sample: 107.50 13");
double ratePerHour = input.nextDouble();
int hoursWorked = input.nextInt();

PartTimeEmployee pte = new PartTimeEmployee();
pte.setWage(ratePerHour, hoursWorked);
System.out.print("Name: "); emp.output(); System.out.printf("\n");
System.out.print("Wage: "); pte.output(); System.out.printf("\n");
}
    }
}
