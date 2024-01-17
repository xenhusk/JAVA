import java.util.*;

public class HashMapPractice {  
    public static void main(String[] args){
        HashMap <String, Integer> Employee = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Input Employee Name:");
        String EmpName = input.next();
        System.out.print("Input Employee ID: ");
        int EmpID = input.nextInt();
        Employee.put(EmpName, EmpID);
        System.out.print(Employee);
    }
}