import java.util.Scanner;
public class oddnum {
   public static void main (String[]args){
      Scanner input= new Scanner(System.in);
     
     while (true){
      System.out.print("First _____ odd numbers: ");
      int oddnums = input.nextInt();
      int oddnumf = oddnums*2;
      int x = 1;
      int sum = 0;
      for (x=1; x<=oddnumf;x+=2){
         System.out.print(x+", ");
          sum +=x;
      }
      System.out.println("sum of the first "+oddnums+" odd numbers "+" is "+sum);}
   } 
}
