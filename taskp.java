import java.util.Scanner;
public class taskp {
  public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("1 - Best Friends: ");
System.out.println("2 - Favorite Food: ");

System.out.println("==============================================");
System.out.print("Enter Choice: ");
int choice = input.nextInt();

if(choice == 1){
  int i =1;
System.out.print("Number of Best friends: ");
int bestf = input.nextInt();
do {
System.out.print("Bestfriend "+i+": ");
String bff = input.nextLine();i++;
}while(bestf >= i);
System.out.println("Best Friends listed Succesfully");

}

else if(choice == 2){
    System.out.print("Number of Favorite Foods: ");
    int favefood = input.nextInt();
    for (int i=1; i <= favefood; i++) {
    System.out.print("Favorite food "+i+" : ");
    String bff = input.nextLine();
    if (i == favefood){
        System.out.println("Favorite food listed Succesfully");
    }
    }


}

  }  
}
