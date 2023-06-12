/*
Write a program using array that reads five numbers, finds the sum, and prints the numbers in reverse.
*/
import java.util.*;
public class ReversePrint
{

	public static void main (String args [])
	{
		Scanner scan= new Scanner (System.in);
		int items [] = new int[5];// declare array item of 5 elements
		int sum = 0;
        int z = 1;
		System.out.println("Enter five integers");
		for (int counter = 0; counter < 5; counter++)
			{
                System.out.print("Integer no. "+z+": ");z++;
				items[counter] = scan.nextInt();
				sum = sum + items[counter];
			}

			System.out.println("The sum of the numbers =" +sum);
			System.out.println("The numbers in reverse order are: ");

			// To print the numbers in the reverse order
			for (int counter1  = 4  ; counter1 >=0; counter1--)
				{
				System.out.print(items[counter1] + "  ");
				}
		}

	}