import java.util.Scanner;
public class FAILED {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String str1 = new String("Apple");
        String str2 = new String("Basic");
        String str3 = new String("Car");
        String str4 = new String("Dog");
        String str5 = new String("Egg");
        String str6 = new String("Fire");
        String str7 = new String("Gum");
        String str8 = new String("Hug");
        String an1,an2,an3,an4,an5,an6,an7,an8;
        System.out.println("Guess the word?");
        System.out.println("_________________________");
        System.out.println("");
        //Q1
        System.out.println("1. The word has "+str1.length()+" letters, it start with "+str1.charAt(0)+" and ends with "+str1.charAt(str1.length()-1));
        do {
            System.out.print("answer: ");
         an1 = new String(input.next());
        
        if(str1.equals(an1)){
        System.out.println("CORRECT");
        
        }
        else{
        
            System.out.println("WRONG");
        }
          
        }while(str1.equals(an1)==false);
        System.out.println("");
        
        //Q2
        System.out.println("2. The word has "+str2.length()+" letters, it start with "+str2.charAt(0)+" and ends with "+str2.charAt(str2.length()-1));
        do {
            System.out.print("answer: ");
         an2 = new String(input.next());
        
        if(str2.equals(an2)){
        System.out.println("CORRECT");
        
        }
        else{
        
            System.out.println("WRONG");
        }
        }while(str2.equals(an2)==false);
        System.out.println("");
        
        //Q3
        System.out.println("3. The word has "+str3.length()+" letters, it start with "+str3.charAt(0)+" and ends with "+str3.charAt(str3.length()-1));
        do {
            System.out.print("answer: ");
         an3 = new String(input.next());
        
        if(str3.equals(an3)){
        System.out.println("CORRECT");
        
        }
        else{
        
            System.out.println("WRONG");
        }
        }while(str3.equals(an3)==false);
        System.out.println("");
        
        //Q4
        System.out.println("4. The word has "+str4.length()+" letters, it start with "+str4.charAt(0)+" and ends with "+str4.charAt(str4.length()-1));
        do {
            System.out.print("answer: ");
         an4 = new String(input.next());
        
        if(str4.equals(an4)){
        System.out.println("CORRECT");
        
        }
        else{
        
            System.out.println("WRONG");
        }
        }while(str4.equals(an4)==false);
        System.out.println("");
        
        
        //Q5
        System.out.println("5. The word has "+str5.length()+" letters, it start with "+str5.charAt(0)+" and ends with "+str5.charAt(str5.length()-1));
        do {
            System.out.print("answer: ");
         an5 = new String(input.next());
        
        if(str5.equals(an5)){
        System.out.println("CORRECT");
        
        }
        else{
        
            System.out.println("WRONG");
        }
        }while(str5.equals(an5)==false);
        System.out.println("");
        
        //Q6
        System.out.println("6. The word has "+str6.length()+" letters, it start with "+str6.charAt(0)+" and ends with "+str6.charAt(str6.length()-1));
        do {
            System.out.print("answer: ");
         an6 = new String(input.next());
        
        if(str6.equals(an6)){
        System.out.println("CORRECT");
        
        }
        else{
        
            System.out.println("WRONG");
        }
        }while(str6.equals(an6)==false);
        System.out.println("");
        
        //Q7
        System.out.println("7. The word has "+str7.length()+" letters, it start with "+str7.charAt(0)+" and ends with "+str7.charAt(str7.length()-1));
        do {
            System.out.print("answer: ");
         an7 = new String(input.next());
        
        if(str7.equals(an7)){
        System.out.println("CORRECT");
        
        }
        else{
        
            System.out.println("WRONG");
        }
        }while(str7.equals(an7)==false);
        System.out.println("");
        
        //Q8
        System.out.println("8. The word has "+str8.length()+" letters, it start with "+str8.charAt(0)+" and ends with "+str8.charAt(str8.length()-1));
        do {
            System.out.print("answer: ");
         an8 = new String(input.next());
        
        if(str8.equals(an8)){
        System.out.println("CORRECT");
        
        }
        else{
        
            System.out.println("WRONG");
        }
        }while(str8.equals(an8)==false);
        System.out.println("");
        
        System.out.println("Congratulations you finished the Guessing Game :)");
           } 
        }
        
