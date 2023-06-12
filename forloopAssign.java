import java.util.Scanner;
public class forloopAssign {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
{
    
    do{
    System.out.println("__________________________________________________________");
    System.out.printf("\n");
    System.out.println("A. Write a Java for loop that displays the first (x) odd ");System.out.println("numbers and print the sum of the displayed numbers");
    System.out.println("B. Create a Java for loop that prints the first (x) odd ");System.out.println("numbers in descending order");
    System.out.println("C. Create a for loop that display the first (x) numbers ");System.out.println("that are divisible by (y)");
    System.out.println("D. End All Programs");
    System.out.println("__________________________________________________________");

    System.out.printf("\n");
    System.out.print("Choose a program from above: ");
    char ending = input.next().charAt(0);
    if (ending == 'B'|| ending == 'b')
    {   
        while (true)
        {
        System.out.println("__________________________________________________________");
        System.out.printf("\n");
        System.out.println("Input 0 to end program B");
        System.out.print("Starting odd number: ");
        int sodd = input.nextInt();
        if (sodd != 0){
        System.out.print("Number of odd numbers: ");
         int numodd= input.nextInt();
         System.out.printf("\n");
        if (sodd%2==1)
        {
        System.out.print("These are the odd numbers ");
             for(int i=1;i<=numodd; i++){ 
        
        if (sodd>0){
        System.out.print(sodd +", ");sodd-=2;
    }
    else {System.out.print("NEGATIVE NUMBERS NOT ALLOWED ");i+=numodd;}
    }
    
}
else {

    System.out.println("ODD NUMBERS ONLY!!!!");
}
System.out.println("end");
System.out.printf("\n");

        }
        else if (sodd==0){
            System.out.println("Program B ended");
            System.out.printf("\n");break;
        }
    }
}
    else if (ending == 'A' || ending == 'a')
    {
            while(true)
        {   
            System.out.println("__________________________________________________________");
            System.out.printf("\n");
            System.out.println("Input 0 to end program A");
            System.out.print("First _____ odd numbers: ");
            int oddnums = input.nextInt();
            System.out.printf("\n");
            if (oddnums != 0)
            {
            int oddnumf = oddnums*2;
            int x = 1;
            int sum = 0;
            for (x=1; x<=oddnumf;x+=2){
               System.out.print(x+", ");
                sum +=x;
            }
            System.out.println("sum of the first "+oddnums+" odd numbers "+"is "+sum);
            System.out.printf("\n");continue;
            }
            else {
                System.out.println("Program A ended");
                System.out.printf("\n");break;
            }
        }

    }
    else if (ending == 'C' || ending == 'c')
    {       while(true)
        {   System.out.println("__________________________________________________________");
            System.out.printf("\n");   
            System.out.println("Input 0 to end program C");
            System.out.print("First ____ numbers: ");
            int numnum = input.nextInt();
            if (numnum !=0)
            {

            System.out.print( "that are divisible by: ");
            int diviby = input.nextInt();
            System.out.printf("\n");
            System.out.println("First "+numnum+" numbers that are divisible by "+diviby+" are ");int x;
            x=diviby;
            for(int i=1;i<=numnum;i++)
            {
                System.out.print(x+", ");
                x+=diviby;
            }
            System.out.println("end");
            System.out.printf("\n");
        }
        else {
            System.out.println("Program C ended");
            System.out.printf("\n");break;
            
        }
        }
    }

    else if (ending == 'D' || ending == 'd'){
            System.out.println("__________________________________________________________");
            System.out.printf("\n");
            System.out.println("Program has ended THANK YOU!");break;
    }
            System.out.println("__________________________________________________________");

}while(true);

}
    }}
