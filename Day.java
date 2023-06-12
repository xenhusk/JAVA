import java.util.Scanner;
public class Day {
    
    int Dayindx,Dayindx1,Dayindx2,Dayindx3,nodays;
    String Day [] = new String [7];
    String dayinput;

    public void Days(){
        Day [0] = "Sunday";
        Day [1] = "Monday";
        Day [2] = "Tuesday";
        Day [3] = "Wednesday";
        Day [4] = "Thursday";
        Day [5] = "Friday";
        Day [6] = "Saturday";
    }

    public void EntDay(){
        Scanner input =  new Scanner(System.in);
System.out.print("Enter a Day of the week (eg Wednesday): ");
dayinput = input.nextLine();
System.out.println("The day is: "+dayinput);
    }

    public void BefAfDay(){

        for (int i = 0; i<7; i++){
if (dayinput.equals(Day[i])){
Dayindx = i;
}
        }
Dayindx1 = Dayindx +1;
Dayindx2 = Dayindx -1;
if (Dayindx1>6){
    Dayindx1 = 0;
}
if(Dayindx2<0){
Dayindx2 = 6;
}
        System.out.println("The next Day is: "+Day [Dayindx1]);
        System.out.println("The previous Day is: "+Day [Dayindx2]);
    }

 public void NoDays(){
    Scanner input = new Scanner(System.in);
System.out.print("Enter number of days to add: ");
nodays = input.nextInt();
Dayindx3 = (Dayindx+nodays)%7;
System.out.print("The day after "+nodays+" day/s is "+Day[Dayindx3]);
 }
}
