import java.util.Scanner;
public class RectangleTest {
    public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.print("input lenght: ");
double length = input.nextDouble();
System.out.print("input width: ");
double width = input.nextDouble();

Rectangle rec = new Rectangle();

rec.setRectangle(length, width);
rec.area();
rec.perimeter();
System.out.println(rec.toString());
}
}
