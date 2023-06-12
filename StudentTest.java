import java.util.Scanner;
public class StudentTest {
 public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Name: ");
    String name = input.nextLine();

    System.out.print("Enter School: ");
    String school = input.nextLine();

    System.out.print("Enter Course: ");
    String course = input.nextLine();

    System.out.print("Enter Address: ");
    String address = input.nextLine();

    System.out.print("Enter Age: ");
    int age = input.nextInt();

    System.out.print("Enter Grades: ");
    double grades = input.nextDouble();

    System.out.println("___________________________");
    System.out.printf("\n");
    Student stud = new Student();

    stud.IntroduceInfo(name,school,course,address);
    stud.IntroduceAge(age);
    stud.IntroduceGrades(grades);
    System.out.println("___________________________");
 }
}
