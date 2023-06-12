import java.util.Scanner;

public class Main {
  public static void main(String[] args)
 {
 Scanner grade = new Scanner(System.in);

   
  System.out.print("Input Math average: ");
  int math = grade.nextInt();
   
  System.out.print("Input Science average: ");
  int science = grade.nextInt();
   
  System.out.print("Input English average: ");
  int english = grade.nextInt();
   
   float average = (math + science + english) / 3;
         {
           System.out.println("Average Grade=" + average);
       }
        
   if (average >= 75){
       System.out.println("PASSED");
       }
   else {
       System.out.println("FAILED");

   }
 }
}
