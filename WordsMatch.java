import java.util.Scanner;
public class WordsMatch {
   public static void main(String[]args){
    String str1; String str2;

Scanner input = new Scanner(System.in);
System.out.println("[PROGRAM WordsMatch start]");
System.out.print("Input first string: ");
 str1 = new String(input.nextLine());
System.out.print("Input second string: ");
 str2 = new String(input.nextLine());

System.out.println("___________________________________");
System.out.printf("\n");
System.out.println("The first string has "+str1.length()+" characters");
System.out.println("The second string has "+str2.length()+" characters");
System.out.println();

if (str1.equals(str2)){
    System.out.println("first string is identical/equal to the second string");
}
else if (str1.equals(str2)==false) {
    System.out.println("first string is NOT identical/equal to the second string");

}
else {
System.out.println("invalid input");

}

   } 
}
