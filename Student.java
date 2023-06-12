public class Student {
    String name,address,school,course;
    int age;
    double grades;

public void IntroduceInfo(String Name,String School, String Course, String Address){
System.out.println("I am "+Name);
System.out.println("I study at "+School);
System.out.println("My current course is "+Course);
System.out.println("I live at "+Address);
    }
public void IntroduceAge(int Age){
System.out.println("My age is "+Age);
    }
public void IntroduceGrades(double Grades){
System.out.println("My average grade is "+Grades);
    }

}