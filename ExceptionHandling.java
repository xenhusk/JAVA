import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionHandling {
 public static void main (String[]args){
Scanner input = new Scanner(System.in);
int dividend, divisor,quotient;
while(true){
try {
System.out.print("Dividend: ");
dividend = input.nextInt();
System.out.print("Divisor: ");
divisor = input.nextInt();
quotient = dividend / divisor;    
System.out.println("Quotient: "+quotient);break;
} catch (ArithmeticException ex) {
    System.out.println("Divisor cannot be 0");
}

catch(InputMismatchException ex){
    System.out.println("Only Integers");
    }

}
    System.out.print("Thank you");
 }   
}
