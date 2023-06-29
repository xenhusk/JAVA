import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.text.DecimalFormat;

// MAIN CLASS
public class Main {    // Create a class named as "Main"
    private static final String FILE_PATH = "C:\\Users\\David Paul Desuyo\\Desktop\\FINALS EXAM\\New folder\\StudentRecord2.txt";    // Create a string "FILE_PATH" which store the file path
    public static void main(String[] args) {    // main() function

                                                System.out.println("╔══════════════════════════╗");
                                                System.out.println("║     WELCOME TO MY        ║");
                                                System.out.println("║      ██████╗ ██████╗     ║");
                                                System.out.println("║      ██╔══██╗██╔══██╗    ║");
                                                System.out.println("║      ██║  ██║██████╔╝    ║");
                                                System.out.println("║      ██║  ██║██╔═══╝     ║");
                                                System.out.println("║      ██████╔╝██║         ║");
                                                System.out.println("║      ╚═════╝ ╚═╝         ║");
                                                System.out.println("║       PROGRAM            ║");
                                                System.out.println("╚══════════════════════════╝");
                                                System.out.println("DAVID PAUL C. DESUYO BSCS 1-A");

System.out.println("Loading program...");

for (int i = 0; i <= 100; i++) {
    System.out.print("Progress: " + i + "%");
    System.out.print(" [");

    int j;
    for (j = 0; j < i; j += 5) {
        System.out.print("=");
    }
    for (; j < 100; j += 5) {
        System.out.print(" ");
    }

    System.out.print("]");
    System.out.print("\r");

    try {
        Thread.sleep(50);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
                                            System.out.println("\nLoading complete!");
                                            System.out.println("\n");
                                            System.out.println("╔══════════════════════════════════╗");
                                            System.out.println("║       GRADE-REPORT PROGRAM       ║");
                                            System.out.println("╚══════════════════════════════════╝");
                                            System.out.println();

        Scanner scanner = new Scanner(System.in);    // Initialize scanner class
        String studentID;    // Initialize studentID variable

        do {    // Start a do-while loop
                System.out.print("Enter the number of students to add: ");    // Print message to console
                int numStudents = 0;    // Initialize numStudents variable
                try {    // Start try-catch block
                    numStudents = Integer.parseInt(scanner.nextLine());    // Parse the input as an integer
                    if (numStudents < 0 || numStudents > 50) {    // Check if numStudents is greater than 50 or not
                        throw new IllegalArgumentException("Number of students must be between 0 and 50.");    // Throw an exception
                    }
                } catch (NumberFormatException e) {    // Catch NumberFormatException
                    System.out.println("Invalid input. Please enter a valid integer.");    // Print message on console
                    continue; // Restart the loop
                } catch (IllegalArgumentException e) {    // Catch IllegalArgumentException
                    System.out.println("Invalid input. " + e.getMessage());    // Print message on console
                    continue; // Restart the loop
                }


            for (int i = 0; i < numStudents; i++) {    // Start a for loop
                System.out.println("Enter details for student " + (i + 1) + ":");    // Print message on console

                System.out.print("First Name: ");    // Print message on console
                String firstName = "";    // Initialize firstName variable
                try {    // start try-catch block
                    firstName = scanner.nextLine();    // Assign value of firstName from input
                    if (!firstName.matches("[a-zA-Z ]+")) {    // check if firstName is alphabet or not
                        throw new IllegalArgumentException("Invalid input. Only alphabets are allowed for the first name.");    // Throw an exception
                    }
                } catch (Exception e) {    // catch block
                    System.out.println(e.getMessage());    // Print message on console
                    i--; // Retry input for the same student
                    continue; // Skip the rest of the loop body
                }

                System.out.print("Last Name: ");    // Print message on console
                String lastName = "";    // Initialize lastName variable
                try {    // start try-catch block
                    lastName = scanner.nextLine();    // Assign value of lastName from input
                    if (!lastName.matches("[a-zA-Z ]+")) {    // Check if lastName is alphabet or not
                        throw new IllegalArgumentException("Invalid input. Only alphabets are allowed for the last name.");    // Throw an exception
                    }
                } catch (Exception e) {    // catch block
                    System.out.println(e.getMessage());    // Print message on console
                    i--; // Retry input for the same student
                    continue; // Skip the rest of the loop body
                }

                    System.out.print("Student ID: ");    // Print message on console
                    studentID = "";    // Initialize studentID variable
                    try {    // Start try-catch block
                        boolean validID = false;
                        while (!validID) {
                            studentID = scanner.nextLine();    // Assign value of studentID from input
                            studentID = studentID.replace("-", "");    // Replace - with ""

                            if (studentID.matches("\\d{9}")) {    // Check if studentID has exactly 9 digits
                                validID = true;
                            } else {
                                System.out.println("Invalid input. Student ID must be a 9-digit number.");
                                System.out.print("Please enter a valid student ID: ");
                            }
                        }
                    } catch (Exception e) {    // catch block
                        System.out.println(e.getMessage());    // Print message on console
                        i--; // Retry input for the same student
                        continue; // Skip the rest of the loop body
                    }

                    System.out.print("Number of Courses: ");    // Print message on console
                    int numCourses = 0;    // Initialize numCourses variable
                    boolean validCourses = false;
                    while (!validCourses) {
                        try {    // Start try-catch block
                            numCourses = Integer.parseInt(scanner.nextLine());    // Assign value of numCourses from input

                            if (numCourses >= 0 && numCourses <= 10) {    // Check if numCourses is between 0 and 10 (inclusive)
                                validCourses = true;
                            } else {
                                System.out.println("Invalid input. Number of courses must be between 0 and 10.");
                                System.out.print("Please enter a valid number of courses: ");
                            }
                        } catch (NumberFormatException e) {    // catch block for invalid integer input
                            System.out.println("Invalid input. Please enter an integer.");
                            System.out.print("Please enter a valid number of courses: ");
                        }
                    }

                    boolean isTuitionPaid = false;    // Initialize isTuitionPaid variable

                    while (true) {    // Loop until valid input is provided
                        System.out.print("Is Tuition Paid? (Y/N): ");    // Print message on console
                        String tuitionPaidStr = scanner.nextLine();    // Read input

                        if (tuitionPaidStr.equalsIgnoreCase("Y")) {
                            isTuitionPaid = true;
                            break;    // Break the loop if valid input is provided
                        } else if (tuitionPaidStr.equalsIgnoreCase("N")) {
                            isTuitionPaid = false;
                            break;    // Break the loop if valid input is provided
                        } else {
                            System.out.println("Invalid input. Please enter either 'Y' or 'N'.");    // Print error message
                        }
                    }

                Course[] courses = new Course[numCourses];    // Initialize courses array
                double[] grades = new double[numCourses];    // Initialize grades array

                for (int j = 0; j < numCourses; j++) {    // Start a for loop
                    System.out.println("Enter details for course " + (j + 1) + ":");    // Print message on console

                    System.out.print("Course Name: ");    // Print message on console
                    String courseName = scanner.nextLine();    // Initialize courseName and assign value from input

                    System.out.print("Course Number: ");    // Print message on console
                    String courseNumber = scanner.nextLine();    // Initialize courseNumber and assign value from input

                    System.out.print("Credits: ");    // Print message on console
                    int credits = 0;    // Initialize credits
                    try {    // Start try-catch block
                        credits = scanner.nextInt();    // Assign value of credits from input
                        scanner.nextLine(); // Consume the newline character

                        if (credits < 0 || credits > 5) {    // Check if credits is greater than 5 or not
                            throw new IllegalArgumentException("Invalid input. Credits must be between 0 and 5.");    // Throw an exception
                        }
                    } catch (Exception e) {    // Catch block
                        System.out.println("Invalid input. " + e.getMessage());    // Print message on console
                        j--; // Retry input for the same course
                        continue; // Skip the rest of the loop body
                    }

                    System.out.print("Grade: ");    // Print message on console
                    double grade = 0;    // Initialize grade variable
                    try {    // Start try-catch block
                        grade = scanner.nextDouble();    // Assign value of grade from input
                        scanner.nextLine();

                        if (grade < 0 || grade > 100) {    // Check if grade is greater than 100 or not
                            throw new IllegalArgumentException("Invalid input. Grade must be between 0 and 100.");    // Throw an exception
                        }
                    } catch (Exception e) {    // catch block
                        System.out.println("Invalid input. " + e.getMessage());    // Print message on console
                        j--; 
                        continue; 
                    }

                    courses[j] = new Course(courseName, courseNumber, credits);    // Initialize courses object
                    grades[j] = grade;    // Assign value of grade in grades array
                }

                Student student = new Student();    // Initialize student object
                student.setInfo(firstName, lastName, studentID, numCourses, isTuitionPaid, courses, grades);    // Call setInfo() function

                appendStudentDataToFile(student);    // Call appendStudentDataToFile() function
            }

                System.out.println("Saving File...");
                for (int i = 0; i <= 100; i++) {
                    System.out.print("Progress: " + i + "%");
                    System.out.print(" [");

                    int j;
                    for (j = 0; j < i; j += 5) {
                        System.out.print("=");
                    }
                    for (; j < 100; j += 5) {
                        System.out.print(" ");
                    }

                    System.out.print("]");
                    System.out.print("\r");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            System.out.println("Student data has been saved to the file: " + FILE_PATH);    // Print message on console

            System.out.print("Enter the student ID to view their record: ");    // Print message on console
            String searchID = "";    // Initialize searchID variable
            try {    // Start try-catch block
                boolean validID = false;
                while (!validID) {
                    searchID = scanner.nextLine();    // Assign value of searchID from input
                    searchID = searchID.replace("-", "");    // Replace "-" with ""

                    if (searchID.matches("\\d{9}")) {    // Check if searchID has exactly 9 digits
                        validID = true;
                    } else {
                        System.out.println("Invalid input. Student ID must be a 9-digit number.");
                        System.out.print("Please enter a valid student ID: ");
                    }
                }
            } catch (Exception e) {    // catch block
                System.out.println(e.getMessage());    // Print message on console
                // Handle the exception as per your requirements
            }
            System.out.println("\n");    // Print a newline

            searchAndDisplayStudentRecord(searchID);    // Call searchAndDisplayStudentRecord() function
        } while (true);    // End the do-while loop
    }


private static void appendStudentDataToFile(Student student) {    // Append student data to file

        File file = new File(FILE_PATH);    // Get the File instance
if (!file.exists()) {    // Check if file exists or not
    try {    // Try block
        file.createNewFile();    // Create new file
    } catch (IOException e) {    // Catch block
        System.out.println("Error occurred while creating the file.");    // print message on console
        e.printStackTrace();    // print error on console
    }
}
        try {    // Try block
            FileWriter fileWriter = new FileWriter(file, true);    // FileWriter
            PrintWriter printWriter = new PrintWriter(fileWriter);    // PrintWriter

            printWriter.println(student.getFirstName() + "\t" +    // Append data of student on file
                    student.getLastName() + "\t" +
                    student.getStudentId() + "\t" +
                    (student.getIsTuitionPaid() ? "Y" : "N") + "\t" +
                    student.getNumberOfCourses());

            Course[] courses = student.getCourseEnrolled();    // Get courses
            double[] grades = student.getCourseGrade();    // Get grade

            for (int i = 0; i < student.getNumberOfCourses(); i++) {    // Iterate over student's courses
                printWriter.println(courses[i].getCourseNumber() + "\t" +
                        courses[i].getCourseName() + "\t" +
                        courses[i].getCredits() + "\t" +
                        grades[i]);
            }

            printWriter.println();

            printWriter.close();
        } catch (IOException e) {    // Catch Block
            System.out.println("Error occurred while writing to the file.");    // print message on console
            e.printStackTrace();    // print error on console
        }
    }

private static void searchAndDisplayStudentRecord(String searchID) {    // This method is used to search for a student record
    File file = new File(FILE_PATH);    // Create an object of File class
    try {    // try-catch block
        Scanner scanner = new Scanner(file);    // Create an object of Scanner class to read file

        boolean found = false;    // set found flag to false
System.out.println("Searching Student Data...");

for (int i = 0; i <= 100; i++) {
    System.out.print("Progress: " + i + "%");
    System.out.print(" [");

    int j;
    for (j = 0; j < i; j += 5) {
        System.out.print("=");
    }
    for (; j < 100; j += 5) {
        System.out.print(" ");
    }

    System.out.print("]");
    System.out.print("\r");

    try {
        Thread.sleep(80);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}System.out.println();
        while (scanner.hasNextLine()) {    // loop over each line in file
            String line = scanner.nextLine();    // read next line
            if (line.contains(searchID)) {    // check if the line contains searchID or not
                System.out.println("Student Data Found!\n");
                found = true;    // if true, set found flag to true
                String[] studentData = line.split("\t");    // split the line with tab delimiter and store in studentData array.

                String firstName = studentData[0];    // store firstName in firstName variable
                String lastName = studentData[1];    // store lastName in lastName variable
                String studentID = studentData[2];    // store studentID in studentID variable
                String tuitionPaid = studentData[3];    // store tuitionPaid in tuitionPaid variable
                int numCourses = Integer.parseInt(studentData[4]);    // store numCourses in numCourses variable

                System.out.println("Student Name: " + firstName + " " + lastName);    // print student FirstName and LastName
                System.out.println("Student ID: " + studentID);    // print student ID
                System.out.println("Tuition Paid: " + (tuitionPaid.equalsIgnoreCase("Y") ? "Yes" : "No"));    // print if tuition is paid or not
                System.out.println("Number of Courses Enrolled: " + numCourses + "\n");    // print number of courses enrolled

                double totalCredits = 0.0;    // define totalCredits variable
                double totalGradePoints = 0.0;    // define totalGradePoints variable
                boolean gradesHeld = false;    // define gradesHeld variable
                System.out.println("Course No\tCourse Name\t\t\t      Credits  Grade");    // print course details
                for (int i = 0; i < numCourses; i++) {    // loop over each course
                    String courseLine = scanner.nextLine();    // read next line
                    String[] courseData = courseLine.split("\t");    // split course details with tab delimiter and store in courseData array

                    String courseNumber = courseData[0];    // store course number in courseNumber variable
                    String courseName = courseData[1];    // store course name in courseName variable
                    double credits = Double.parseDouble(courseData[2]);    // store number of credits in credits variable
                    String grade = courseData[3];    // store grade in grade variable

                    if (tuitionPaid.equalsIgnoreCase("Y")) {    // check if tuition is paid or not
                        System.out.printf("%-10s%-40s%8d%10s\n", courseNumber, courseName, (int) credits, grade);    // print course details

                        if (!grade.equals("***")) {    // check if grade is present or not
                            double gradePoint = Double.parseDouble(grade);    // convert grade to double
                            totalGradePoints += gradePoint * credits;    // calculate total grade points
                        } else {
                            gradesHeld = true;    // set gradesHeld flag to true
                        }
                    } else if (tuitionPaid.equalsIgnoreCase("N")) {    // check if tuition is paid or not
                        System.out.printf("%-10s%-40s%8d%10s\n", courseNumber, courseName, (int) credits, "***");    // print course details

                        gradesHeld = true;    // set gradesHeld flag to true
                    }

                    totalCredits += credits;    // calculate total number of credits  
                }
                DecimalFormat decii = new DecimalFormat("0"); 
                System.out.println("\nTotal number of credit hours: " + decii.format(totalCredits));    // print total number of credit hours
                 DecimalFormat deci = new DecimalFormat("0.00");    // define decimal format
                if (!gradesHeld) {    // check if gradesHeld is true or false
                    double gpa = totalGradePoints / totalCredits;    // calculate gpa
                    System.out.println("Second Semester GPA: " + deci.format(gpa));    // print gpa
                } else {
                    System.out.println("*** Grades are being held for not paying the tuition. ***");    // print message on console
                    double amountDue = 8895.75;  // Set the fixed amount due    // set amountDue variable
                    System.out.println("Amount Due: " + amountDue);    // print amountDue on console
                }

                break;    // break the loop
            }
        }

        scanner.close();    // close the scanner

        if (!found) {    // check if found flag is set to true or false
            System.out.println("Student record not found for the provided ID: " + searchID);    // print message on console
        }
    } catch (FileNotFoundException e) {    // catch block
        System.out.println("Error occurred while searching for student record: File not found.");    // print message on console
        e.printStackTrace();    // print stack trace
    }
    System.out.println("\n*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*\n");    // print the star pattern
}

}


// COURSE CLASS
class Course {    // Defining Class name "Course"
    private String courseName;    // Declaring CourseName variable as String
    private String courseNumber;    // Declaring CourseNumber variable as String
    private int courseCredits;    // Declaring courseCredits variable as int

    public Course() {    // Constructor of Course class
        courseName = "";    // initialize coursename with ""
        courseNumber = "";    // initialize courseNumber with ""
        courseCredits = 0;    // initialize courseCredits with 0
    }

    public Course(String name, String number, int credits) {    // Parameterized constructor with String name, String number, int credits
        courseName = name;    // initialize courseName with value of "name"
        courseNumber = number;    // initialize courseNumber with value of "number"
        courseCredits = credits;    // initialize courseCredits with value of "credits"
    }

    public void setCourseInfo(String name, String number, int credits) {    // Defining setCourseInfo function
        courseName = name;    // initialize courseName with value of "name"
        courseNumber = number;    // initialize courseNumber with value of "number"
        courseCredits = credits;    // initialize courseCredits with value of "credits"
    }

    public void setCourseName(String name) {    // Defining setCourseName function
        courseName = name;    // initialize courseName with value of "name"
    }

    public void setCourseNumber(String number) {    // Defining setCourseNumber function
        courseNumber = number;    // initialize courseNumber with value of "number"
    }

    public void setCourseCredits(int credits) {    // Defining setCourseCredits function
        courseCredits = credits;    // initialize courseCredits with value of "credits"
    }

    @Override    // Override toString function
    public String toString() {
        return "Course Name: " + courseName + "\n" +
                "Course Number: " + courseNumber + "\n" +
                "Credits: " + courseCredits;
    }

    public String getCourseName() {    // Defining getCourseName function
        return courseName;    // Return the value of courseName
    }

    public String getCourseNumber() {    // Defining getCourseNumber function
        return courseNumber;    // Return the value of courseNumber
    }

    public int getCredits() {    // Defining getCredits function
        return courseCredits;    // Return the value of courseCredits
    }

    public void copyCourseInfo(Course other) {    // Defining copyCourseInfo function with Course object
        courseName = other.courseName;    // Copy the value of courseName of "other" object to courseName of current object
        courseNumber = other.courseNumber;    // Copy the value of courseNumber of "other" object to courseNumber of current object
        courseCredits = other.courseCredits;    // Copy the value of courseCredits of "other" object to courseCredits of current object
    }
}


// PERSON CLASS
class Person {    // Defining class name "Person"
    private String firstName;    // Declare firstName variable as String
    private String lastName;    // Declare lastName variable as String

    public Person() {    // Constructor of Person class
        firstName = "";    // initialize firstName with ""
        lastName = "";    // initialize lastName with ""
    }

    public Person(String first, String last) {    // Parameterized constructor with String first, String last
        firstName = first;    // initialize firstName with value of "first"
        lastName = last;    // initialize lastName with value of "last"
    }

    public void setName(String first, String last) {    // Defining setName function
        firstName = first;    // initialize firstName with value of "first"
        lastName = last;    // initialize lastName with value of "last"
    }

    public String getFirstName() {    // Defining getFirstName function
        return firstName;    // Return the value of firstName
    }

    public String getLastName() {    // Defining getLastName function
        return lastName;    // Return the value of lastName
    }

    @Override    // Override toString function
    public String toString() {
        return firstName + " " + lastName;
    }
}

// STUDENT CLASS
class Student extends Person {    // Student class inherited from Person class
    private String studentId;    // Variable to store student ID
    private int numberOfCourses;    // Variable to store number of courses
    private boolean isTuitionPaid;    // Variable to check if tuition is paid or not
    private Course[] courseEnrolled;    // Array of courses
    private double[] courseGrade;    // Array of grades

    public Student() {    // Constructor to initialize the class
        super();    // Calling the super class constructor
        studentId = "";    // Initializing studentId as empty
        numberOfCourses = 0;    // Initializing numberOfCourses as 0
        isTuitionPaid = false;    // Initializing isTuitionPaid as false
        courseEnrolled = new Course[0];    // Initializing courseEnrolled as empty array
        courseGrade = new double[0];    // Initializing courseGrade as empty array
    }

    public void setInfo(String firstName, String lastName, String studentID, int numCourses, boolean isTuitionPaid, Course[] courses, double[] grades) {    // Function to set info
        setName(firstName, lastName);    // Calling setName function
        studentId = studentID;    // Setting studentId
        numberOfCourses = numCourses;    // Setting numberOfCourses
        this.isTuitionPaid = isTuitionPaid;    // Setting isTuitionPaid
        courseEnrolled = courses;    // Setting courseEnrolled
        courseGrade = grades;    // Setting courseGrade
    }

    public void setStudentId(String id) {    // Function to set StudentId
        studentId = id;    // Setting studentId
    }

    public void setIsTuitionPaid(boolean tuitionPaid) {    // Function to set isTuitionPaid
        isTuitionPaid = tuitionPaid;    // Setting isTuitionPaid
    }

    public void setNumberOfCourses(int numCourses) {    // Function to set numberOfCourses
        numberOfCourses = numCourses;    // Setting numberOfCourses
    }

    public void setCourseEnrolled(Course[] courses, double[] grades) {    // Function to set courseEnrolled and courseGrade
        courseEnrolled = courses;    // Setting courseEnrolled
        courseGrade = grades;    // Setting courseGrade
        sortCourses();    // Calling sortCourse function
    }

    @Override    // Overriding the toString() function
    public String toString() {
        StringBuilder builder = new StringBuilder();    // Creating a stringBuilder
        builder.append("Student Name: ").append(getFirstName()).append(" ").append(getLastName()).append("\n");    // Adding first name and last name to stringBuilder
        builder.append("Student ID: ").append(studentId).append("\n");    // Adding studentId to stringBuilder
        builder.append("Tuition Paid: ").append(isTuitionPaid ? "Y" : "N").append("\n");    // Adding isTuitionPaid to stringBuilder
        builder.append("Number of Courses Enrolled: ").append(numberOfCourses).append("\n");    // Adding numberOfCourses to stringBuilder
        builder.append("Course No\tCourse Name\t\t\t\tCredits\tGrade\n");    // Adding courseNo, courseName, credits and Grade to stringBuilder

        for (int i = 0; i < numberOfCourses; i++) {
            builder.append(courseEnrolled[i].getCourseNumber()).append("\t");    // Add course number to stringBuilder
            builder.append(courseEnrolled[i].getCourseName()).append("\t\t");    // Add course name to stringBuilder
            builder.append(courseEnrolled[i].getCredits()).append("\t");    // Add credit to stringBuilder

            if (isTuitionPaid) {
                builder.append(courseGrade[i]);    // Add grade to stringBuilder
            } else {
                builder.append("***");    // Add *** to stringBuilder
            }

            builder.append("\n");    // Add new line to stringBuilder
        }

        builder.append("\nTotal number of credit hours: ").append(getHoursEnrolled()).append("\n");    // Add total credit hours to stringBuilder
        builder.append("Second Semester GPA: ").append(getGpa()).append("\n");    // Add GPA to stringBuilder

        return builder.toString();    // Return the string from stringBuilder
    }

    public String getStudentId() {    // Function to get studentId
        return studentId;    // Return studentId
    }

    public boolean getIsTuitionPaid() {    // Function to get isTuitionPaid
        return isTuitionPaid;    // Return isTuitionPaid
    }

    public int getNumberOfCourses() {    // Function to get numberOfCourses
        return numberOfCourses;    // Return numberOfCourses
    }

    public Course[] getCourseEnrolled() {    // Function to get courseEnrolled
        return courseEnrolled;    // Return courseEnrolled
    }

    public Course getCourse(int index) {    // Function to get course at index
        return courseEnrolled[index];    // Return course at index
    }
    public double[] getCourseGrade() {    // Function to get courseGrade
        return courseGrade;    // Return courseGrade
    }
    public double getGrade(int index) {    // Function to get grade at index
        return courseGrade[index];    // Return grade at index
    }

    public int getHoursEnrolled() {    // Function to get hoursEnrolled
        int totalCredits = 0;    // Initialize totalCredits to 0
        for (int i = 0; i < numberOfCourses; i++) {
            totalCredits += courseEnrolled[i].getCredits();    // Get the total credits
        }
        return totalCredits;    // Return the total credits
    }

    public double getGpa() {    // Function to get GPA of the student
        double totalPoints = 0;    // Initialize totalPoints to 0
        int totalCredits = getHoursEnrolled();    // Get the total credits

        for (int i = 0; i < numberOfCourses; i++) {
            totalPoints += courseGrade[i] * courseEnrolled[i].getCredits();    // Get the total points
        }

        return totalPoints / totalCredits;    // Return the GPA
    }

    public double billingAmount(double creditHourCost) {    // Function to get billingAmount
        if (!isTuitionPaid) {    // Check if isTuitionPaid is false
            int totalCredits = getHoursEnrolled();    // Get the total credits
            return totalCredits * creditHourCost;    // Return the billingAmount
        }
        return 0.0;    // Return 0 if isTuitionPaid is true
    }

    private void sortCourses() {    // Function to sort the courses
        for (int i = 0; i < numberOfCourses - 1; i++) {    // Loop to sort the courses
            int minIndex = i;    // Initialize minIndex to i
            for (int j = i + 1; j < numberOfCourses; j++) {    // Loop to find the minIndex
                if (courseEnrolled[j].getCourseNumber().compareTo(courseEnrolled[minIndex].getCourseNumber()) < 0) {    // Check if course number is less than minIndex
                    minIndex = j;    // Update minIndex
                }
            }
            swapCourses(i, minIndex);    // Call the swapCourses function
        }
    }

    private void swapCourses(int index1, int index2) {    // Function to swap courses
        Course tempCourse = courseEnrolled[index1];    // Make a temporary copy of index1
        double tempGrade = courseGrade[index1];    // Make a temporary copy of index1 grade
        courseEnrolled[index1] = courseEnrolled[index2];    // Set index1 to index2
        courseGrade[index1] = courseGrade[index2];    // Set index1 to index2
        courseEnrolled[index2] = tempCourse;    // Set index2 to tempCourse
        courseGrade[index2] = tempGrade;    // Set index2 to tempGrade
    }
}
