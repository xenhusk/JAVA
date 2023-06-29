import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String studentID = sc.nextLine();

        try {
            File file = new File("StudentRecord.txt");
            Scanner fileScanner = new Scanner(file);
            boolean found = false;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] info = line.split("\t");
                if (info[0].equals(studentID)) {
                    found = true;
                    System.out.println("Student Name: " + info[1]);
                    System.out.println("Student ID: " + info[0]);
                    System.out.println("Tuition Paid: " + info[2]);
                    System.out.println("Number of Courses Enrolled: " + info[3]);
                    System.out.println("Course No\tCourse Name\t\t\t\tCredits\tGrade");
                    int totalCredits = 0;
                    double totalGrade = 0;
                    for (int i = 4; i < info.length; i += 3) {
                        String courseNo = info[i];
                        String courseName = info[i + 1];
                        int credits = Integer.parseInt(info[i + 2]);
                        totalCredits += credits;
                        String grade = "***";
                        if (info[2].equals("Y")) {
                            grade = info[i + 3];
                            totalGrade += Double.parseDouble(grade) * credits;
                        }
                        System.out.println(courseNo + "\t" + courseName + "\t\t\t\t" + credits + "\t" + grade);
                    }
                    System.out.println("Total number of credit hours: " + totalCredits);
                    if (info[2].equals("Y")) {
                        double gpa = totalGrade / totalCredits;
                        System.out.println("Second Semester GPA: " + gpa);
                    } else {
                        System.out.println("Balance to be paid: " + info[4]);
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Student not found!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}