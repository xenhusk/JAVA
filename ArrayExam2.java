import java.util.Scanner;
import java.text.DecimalFormat;
public class ArrayExam2 {
  public static void main (String[]args){
Scanner input = new Scanner (System.in);
DecimalFormat decimal = new DecimalFormat(".00");
int radius[] = new int [5];
double perimiter[] = new double[5];
double area[] = new double[5];

for (int i = 0; i<5; i++)
{
System.out.print("Enter Radius: ");
radius[i] = input.nextInt();
perimiter[i] = 2*(3.1416*radius[i]);
area [i] = (3.14)*(radius[i]*radius[i]);
}
System.out.println();
for(int i = 0; i<5; i++){
System.out.println("Radius = "+decimal.format(radius[i])+" ,  "+"Perimeter = "+decimal.format(perimiter[i])+" ,  "+"Area = "+area[i]);
}
  }  
}
