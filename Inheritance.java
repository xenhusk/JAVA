import java.util.Scanner;
import java.text.DecimalFormat;
public class Inheritance {
    
    Scanner input = new Scanner(System.in);
    private String Fname;
    private String Lname;

public String toString(){
System.out.print("Enter First Name: ");
Fname =  input.nextLine();
System.out.print("Enter Last Name: ");
Lname = input.nextLine();
System.out.println("The name is "+Fname+" "+Lname);
return Lname;
}

public void setName(String first, String last){

    Fname = first;
    Lname = last;
}
public String getFname(){
    return Fname;
}
public String getLname(){
    return Lname;
}

}

