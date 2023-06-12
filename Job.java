import java.util.Scanner;
public class Job {
public static void main(String[]args){
    double rate = 15.50;
    int hours = 8;
    int days = 25;
    double pay = rate*hours*days;
    double tax = pay*0.14;
    double clothes = pay*0.10;
    double schoolsupp = pay*0.01;
    double saved = pay-tax-clothes-schoolsupp;
    double bond = 0;
Scanner input =  new Scanner (System.in);
System.out.print("Spend on Savings bonds?(y/n): ");
    char yn = input.next().charAt(0);
    if (yn == 'y'){
        System.out.print("How much to spend on Savings Bond: ");
         bond = input.nextDouble();
    }
    else if (yn == 'n'){
        bond = 0;
    }

double pbond = 0;

    if (bond <= 0.25*pay && bond != 0){
         pbond = (bond*0.25)+(saved*0.01);
    }
    else if (bond > 0.25*pay && bond != 0) {
         pbond = (0.40*(tax+clothes+schoolsupp))+(saved*0.02);
    }

    else if (bond == 0){
         pbond = (saved*0.01);
    }
    saved = saved - bond;


    System.out.println("Income: "+ pay);
    System.out.println("After Taxes: "+(pay-tax));
    System.out.println("Clothes: "+ clothes);
    System.out.println("School Supplies: "+ schoolsupp);
    System.out.println("Savings Bonds: "+bond);
    System.out.println("Parents Spent on Savings Bonds: " + pbond);
    System.out.println("_________________________________________");
    System.out.println("Money Saved: "+ saved);

}
}