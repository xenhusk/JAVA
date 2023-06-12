import java.util.Scanner;
public class OddEvenChecker {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        do {
            do {
            System.out.print("Enter a Positive Integer: ");
            int integer = input.nextInt();

            if (integer >= 1 && integer%2==1){
                System.out.print("Integer is Odd");break;
            }
            else if (integer >= 1 && integer%2==0){
                System.out.print("Integer is Even");break;
            }
            else if (integer < 0){
                System.out.println("ERROR Please input Positive integer");
            }
            System.out.printf("\n");
        } while (true);
        System.out.printf("\n"); 
        
        System.out.print("Would you like to input a new Integer?(y/n): ");
            char yn = input.next().charAt(0);
            if (yn == 'y' || yn == 'Y'){
               continue;
            }
            else if (yn == 'n' || yn == 'N'){
                System.out.printf("\n");
                System.out.println("Thank you for using the Program");break;
            }
        
            
        
        }while(true);

    }
}
