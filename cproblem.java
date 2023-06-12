import java.util.Scanner;
public class cproblem {
    public static void main(String[]args){
Scanner input =  new Scanner (System.in);
while(true){
    System.out.print("First ____ numbers: ");
    int numnum = input.nextInt();
    System.out.print( "that are divisible by: ");
    int diviby = input.nextInt();
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
    }
}
