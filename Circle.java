import java.util.Scanner;
import java.text.DecimalFormat;
public class Circle {
    
    double distance,radius,circumference,area,diameter,x1,x2,y1,y2;

    public void Distance() {
        Scanner input = new Scanner(System.in);
        System.out.print("x1: ");
        x1 = input.nextDouble();
        System.out.print("x2: ");
        x2 = input.nextDouble();
        System.out.print("y1: ");
        y1 = input.nextDouble();
        System.out.print("y2: ");
        y2 = input.nextDouble();

        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public void Radius() {
        radius = distance;
    }

    public void Diameter(){
        diameter = radius*2;
    }

    public void Circumference() {
        circumference = 2 * Math.PI * radius;
    }

    public void Area() {
        area = (radius * radius) * 3.1416;
    }

    public void Output() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Center = x1 = "+df.format(x1)+"\t"+"y1 = "+df.format(y1));
        System.out.println("Radius = " + df.format(radius));
        System.out.println("Diameter = " + df.format(diameter));
        System.out.println("Circumference = " + df.format(circumference));
        System.out.println("Area = " + df.format(area));
    }
}
