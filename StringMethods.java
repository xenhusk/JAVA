import java.util.Scanner;
public class StringMethods {
    public static void main (String[]args){
        System.out.print("input string: ");
        Scanner input = new Scanner(System.in);
        String instring = input.nextLine();
        System.out.print("input char num: ");
        int character = input.nextInt();
        int Integer = new Integer(character+1);
        System.out.println(instring+" & "+instring.charAt(character)+" is the "+Integer+" nth character from "+instring.charAt(0));

        String str1 = new String(instring);
        String str2 =  new String(instring+" is a new string");

        System.out.println(str1 + " "+str2);

// string methods
/* 
        instring.charAt();
        instring.compareTo("");
        instring.concat(" is a string");
        instring.equals();
        instring.equalsIgnorCase(instring);
        instring.indexOf();
        instirng.lastIndexOf();
        instring.lenght();
        instring.toLowerCase();
        instring.toUpperCase();
        instring.replace();
        instring.substring(2);
        instring.substring(1, 3);
        instring.trim();
 */
//1st problem
 String sentence = new String("The quick brown fox jumps over the lazy dog");
 System.out.print("which letter to count: ");
 char chr = input.next().charAt(0);
 int count=0;
 for (int i=0; i<sentence.length();i++){
char chr1 =  sentence.charAt(i);
if(chr1==chr){
    count++;
}
 }
 System.out.println();

//2nd problem
 System.out.println("2. "+sentence);
 System.out.println("the number of "+chr+"'s"+" is "+ count);
System.out.println();
//3rd problem
System.out.println("3. "+sentence.replace(' ','%'));

//4th problem
System.out.println("4. "+sentence.indexOf("a"));
System.out.println();

//5th problem

System.out.print("Enter a string: ");
        String inputString = input.next();
        
        for(int i=0; i<inputString.length(); i++) {
            char ch = inputString.charAt(i);
            System.out.println(ch);
        }

    }
}
