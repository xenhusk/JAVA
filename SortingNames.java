/*Write a Java program that will ask the user to enter fifty names then display them in alphabetical order. Name the class as SortingNames.
*/

import java.util.*;
public class SortingNames {
public static void main(String[] args) {
Scanner console = new Scanner(System.in);
int n = 5;
int z = 1;
int x = 1;
String names[] = new String[n];
System.out.println("Enter 5 names");
for(int i = 0; i < n; i++)
{
    System.out.print("Enter name no. "+z+": ");z++;
    
names[i] = console.nextLine();}
Arrays.sort(names);
System.out.println("_____________________________________________");
System.out.printf("\n");
System.out.println("Names in alphabetical order");
System.out.println("_____________________________________________");
System.out.printf("\n");
for(int i = 0; i<n; i++)
{
System.out.println(x+". "+names[i]);x++;
}

}
}