import java.util.*;

import java.util.Scanner;
public class Information{
public static void main (String[] args){

    Scanner heart = new Scanner(System.in);
    System.out.print("what is your name: ");
    String name = heart.nextLine();
    System.out.print("what is your age: ");
    int age = heart.nextInt();

    System.out.println("age =" + age);
    System.out.println("name =" + name);

    
}

}

