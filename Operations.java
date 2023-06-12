import java.text.DecimalFormat;
import java.util.Scanner;

public class Operations {
    DecimalFormat df = new DecimalFormat(".00");
    private String itemName;
    private double itemPrice;
    private int itemQuantity;
    private double amountDue;

    public void setItemName(String newItemName) {
        itemName = newItemName;
    }

    public String getItemName() {
        return itemName;
    }

    public double getTotalCost() {
        return itemQuantity * itemPrice;
    }

    public void readInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the item you are purchasing.");
        itemName = input.nextLine();
        System.out.println("Enter the quantity and price separated by space.");
        itemQuantity = input.nextInt();
        itemPrice = input.nextDouble();
    }

    public void setTotalCost(int quantity, double price) {
        itemQuantity = quantity;
        itemPrice = price;
        amountDue = quantity * price;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void writeOutput() {
        System.out.println("You are purchasing " + itemQuantity + " " + itemName + "(s) at " + itemPrice + " each.");
        System.out.printf("Amount due is " + df.format(amountDue));
    }
}
