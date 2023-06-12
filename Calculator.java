import java.util.Scanner;
public class Calculator {
public static void main(String[]args){

Scanner input = new Scanner (System.in);
do{
System.out.println("Input two numbers");
System.out.print("num1: ");
float num1 = input.nextFloat();
System.out.print("num2: " );
float num2 = input.nextFloat();
System.out.print("Select an operator: [+, - ,* , /]: ");
char operator = input.next().charAt(0);

if (operator == '+'){
System.out.println(num1 + " + " + num2 +"="+ num1+num2);
}

else if (operator == '-'){
System.out.println(num1 + " - " + num2 +"="+ (num1-num2));
}

else if (operator == '*'){
System.out.println(num1 + " * " + num2 +"="+ (num1*num2));
}

else if (operator == '/'){
System.out.println(num1 + " / " + num2 +" = "+ (num1/num2));
}

else {
System.out.println("invalid input");
}
System.out.println("_____________________________________");
System.out.printf("\n");
}while (true);
}    
}
