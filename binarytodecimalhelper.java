//DAVID PAUL DESUYO BSCS 1-A
import java.util.Scanner;
public class binarytodecimalhelper {
    static Scanner num =  new Scanner(System.in);
    public static void main(String[]args)
{
System.out.println("How many digits does your binary have?:");
int digit = num.nextInt();//number of digits
int i = 1;//varaible that is multiplied by 2
int j = 1;//starting increment value
System.out.println("Here are the values from 1 to "+digit+"digits:");
System.out.print("1, ");
    do 
    {
    System.out.print(i * 2+", ");i*=2;j++;//i will keep multiplying by 2 until j meets the condtion for the loop to stop
    } while (j<digit);//condition until program stops
    System.out.print("end of value");
}    
}
