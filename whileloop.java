import java.util.Scanner;
public class whileloop {
   public static void main(String[]args){
Scanner input =  new Scanner (System.in);
do{
System.out.print("name a loop: ");
String loop = input.next();
int i = 1;
System.out.println("_______________________________________");
System.out.printf("\n");
switch (loop){

    case "while_loop"://while loop code
while (i<4){
System.out.println("WHILE LOOP");i++;
}
break;

    case "for_loop"://for loop code
for(i=1; i<4; i++){
System.out.println("FOR LOOP");
}
break;

    case "do_while_loop"://do while loop code
do {
    System.out.println("DO WHILE LOOP");i++;
}while(i<4);
break;
}
System.out.println("_______________________________________");
System.out.printf("\n");
} while (true);
}
   } 
