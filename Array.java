import java.util.Scanner;
public class Array  {
    public static void main(String[]args){
Scanner input = new Scanner(System.in);

//Array
/*int[] num = new int[5];

        num[0] = 130;
        num[1] = 230;
        num[2] = 330;
        num[3] = 430;
        num[4] = 530;
*/
/*
int num [] = {130,230,330,430,530};
        System.out.print("input an index to call out: ");
        int callout = input.nextInt();
        System.out.println("The value of "+callout+" is "+num[callout]);

            int num1 [] = new int[5];
            System.out.print("input value to index 0: ");
            num1[0] = input.nextInt();
            System.out.print("input value to index 1: ");
            num1[1] = input.nextInt();
            System.out.print("input value to index 2: ");
            num1[2] = input.nextInt();
            System.out.print("input value to index 3: ");
            num1[3] = input.nextInt();
            System.out.print("input value to index 4: ");
            num1[4] = input.nextInt();

            System.out.println("___________________________________________________");
            System.out.print("input an index to call out: ");
        int callout2 = input.nextInt();
        System.out.println("The value of "+callout2+" is "+num1[callout2]);

        
        System.out.println("___________________________________________________");

        System.out.println("");

        */
        
        System.out.print("how many indexes: ");

        int index = input.nextInt();
                int num [] = new int[index];
                for (int i = 0; i<index;i++){
                    System.out.print("input value to index "+i+" : ");
                num[i] = input.nextInt();
                }
                System.out.print("input an index to call out: ");
                int callout = input.nextInt();
                System.out.println("The value of "+callout+" is "+num[callout]);
    }
}
