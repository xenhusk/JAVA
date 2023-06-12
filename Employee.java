import java.util.Scanner;
public class Employee {
    private String name;
    Scanner input = new Scanner(System.in);
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void output(){
System.out.print(name);
    }
}
