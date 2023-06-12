import java.util.Scanner;
public class sample1 {
    public static void main(String[]args){
        Scanner console = new Scanner (System.in);
        System.out.print("First Integer: ");
        int x = console.nextInt();
        System.out.print("Second Integer: ");
        int y = console.nextInt();

        System.out.print("Sum of two integers is "); System.out.print(x+y);
    }
}