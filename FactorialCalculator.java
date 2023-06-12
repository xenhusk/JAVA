import java.util.Scanner;
public class FactorialCalculator {
   public static void main(String[]args){
Scanner input = new Scanner (System.in);

int z = 1;
    System.out.println("<------ Factorial Calculator ------>");
    do {
        System.out.print("Enter a positive number: ");
        int x = input.nextInt();
        int factorial = 1;
        if (x>0)
        {
            
        System.out.print(x+"!"+" = ");
        for(int i = 1; i <= x; ++i)
        {     factorial *= i;   }

        for (int ii=1; ii<=x; ii++){
         
            System.out.print(ii);
            System.out.print(" x ");
            }
            System.out.printf("\n");
            System.out.print("The Factorial of "+x+" is: "+ factorial);
            System.out.printf("\n");
        }
        
        else {
            System.out.println("ERROR pls input postive number");
        }

           
        z++;}while(z <= 5);
    
   } 
}
