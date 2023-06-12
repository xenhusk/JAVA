import java.util.Scanner;
import java.text.DecimalFormat;
public class Deviation {
    
    double x1,x2,x3,x4,x5;
    double mean,standev,x,sd;
    DecimalFormat df = new DecimalFormat("0.00");


    public void setmean(double mean){
x = (x1+x2+x3+x4+x5)/5;
mean = x;
    }

    public double getmean(){
        return mean;
    }

    public void inputs(){
        Scanner input = new Scanner(System.in);
System.out.print("Enter number 1: ");
x1 = input.nextDouble();
System.out.print("Enter number 2: ");
x2 = input.nextDouble();
System.out.print("Enter number 3: ");
x3 = input.nextDouble();
System.out.print("Enter number 4: ");
x4 = input.nextDouble();
System.out.print("Enter number 5: ");
x5 = input.nextDouble();
    }

    public void setStanDev(double standev){
sd = Math.sqrt(((Math.pow(x1-x,2)+Math.pow(x2-x,2)+Math.pow(x3-x,2)+Math.pow(x4-x,2)+Math.pow(x5-x,2))/5));
standev = sd;
    }

    public double getStanDev(){
return standev;
    }
    public void output(){
        System.out.println("Mean: "+df.format(x));
        System.out.println("Standard deviation: "+df.format(sd));
    }
}
