import java.util.Scanner;
public class GuessTheWord {
   public static void main(String[]args){
Scanner input = new Scanner (System.in);
String str1 = new String("Apple");
String an1;
System.out.println("Guess the word?");
System.out.println("[8 tries only]");
System.out.println("_________________________");
System.out.println("");
//Q1
System.out.println("1. The word has "+str1.length()+" letters, it start with "+str1.charAt(0)+" and ends with "+str1.charAt(str1.length()-1));
for(int i=0;i<8;i++) {
    System.out.print("answer: ");
 an1 = new String(input.next());

if(str1.equals(an1)){
System.out.println("CORRECT");
System.out.println("Congratulations");
break;

}
else{
    System.out.println("WRONG");
}

if (i == 7){

System.out.println("You ran out of tries, run the program again");
}

}
   } 
}
