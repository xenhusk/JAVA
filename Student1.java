public class Student1 extends Inheritance{
   
    public String toString(){
        System.out.print("Enter First Name: ");
        String Fname =  input.nextLine();
        System.out.print("Enter Last Name: ");
        String Lname = input.nextLine();
        System.out.print("Enter School: ");
        String school = input.nextLine();
        System.out.println("The name is "+Fname+" "+Lname+"\nSchool: "+school);
        return Fname;
        }
 
}