import java.util.Scanner;
public class ITRoom extends Room {
    Scanner input = new Scanner(System.in);

    public void lights(){
        System.out.print("Enter 1 or 0: ");
        int light = input.nextInt();
        if (light == 1){
            System.out.print("The lights are on!");
        }
        else {
            System.out.print("The lights are off");

        }
    }
    public void TrashCan (){
        System.out.println("The trashcan is full");           
    }
}
