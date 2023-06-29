public class Student extends Person {
    private int studentId;
    private int numberOfCourses;
    private boolean isTuitionPaid;
    private Course[] courseEnrolled;
    private double[] courseGrade;

    public Student() {
        super();
        studentId = 0;
        numberOfCourses = 0;
        isTuitionPaid = false;
        courseEnrolled = new Course[0];
        courseGrade = new double[0];
    }

 public void setInfo(String firstName, String lastName, String studentID, int numCourses, boolean isTuitionPaid, Course[] courses, double[] grades) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.studentID = studentID;
    this.numCourses = numCourses;
    this.isTuitionPaid = isTuitionPaid;
    this.courseEnrolled = courses;
    this.courseGrade = grades;
}

    public void setStudentId(int id) {
        studentId = id;
    }

    public void setIsTuitionPaid(boolean tuitionPaid) {
        isTuitionPaid = tuitionPaid;
    }

    public void setNumberOfCourses(int numCourses) {
        numberOfCourses = numCourses;
    }

    public void setCourseEnrolled(Course[] courses, double[] grades) {
        courseEnrolled = courses;
        courseGrade = grades;
        sortCourses();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Student Name: ").append(getFirstName()).append(" ").append(getLastName()).append("\n");
        builder.append("Student ID: ").append(studentId).append("\n");
        builder.append("Tuition Paid: ").append(isTuitionPaid ? "Y" : "N").append("\n");
        builder.append("Number of Courses Enrolled: ").append(numberOfCourses).append("\n");
        builder.append("Course No\tCourse Name\t\t\t\tCredits\tGrade\n");

        for (int i = 0; i < numberOfCourses; i++) {
            builder.append(courseEnrolled[i].getCourseNumber()).append("\t");
            builder.append(courseEnrolled[i].getCourseName()).append("\t\t");
            builder.append(courseEnrolled[i].getCredits()).append("\t");

            if (isTuitionPaid) {
                builder.append(courseGrade[i]);
            } else {
                builder.append("***");
            }

            builder.append("\n");
        }

        builder.append("\nTotal number of credit hours: ").append(getHoursEnrolled()).append("\n");
        builder.append("Second Semester GPA: ").append(getGpa()).append("\n");

        return builder.toString();
    }

    public int getStudentId() {
        return studentId;
    }

    public boolean getIsTuitionPaid() {
        return isTuitionPaid;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

public Course[] getCourseEnrolled() {
    return courseEnrolled;
}

public Course getCourse(int index) {
    return courseEnrolled[index];
}


    public double getGrade(int index) {
        return courseGrade[index];
    }

    public int getHoursEnrolled() {
        int totalCredits = 0;
        for (int i = 0; i < numberOfCourses; i++) {
            totalCredits += courseEnrolled[i].getCredits();
        }
        return totalCredits;
    }

    public double getGpa() {
        double totalPoints = 0;
        int totalCredits = getHoursEnrolled();

        for (int i = 0; i < numberOfCourses; i++) {
            totalPoints += courseGrade[i] * courseEnrolled[i].getCredits();
        }

        return totalPoints / totalCredits;
    }

    public double billingAmount(double creditHourCost) {
        if (!isTuitionPaid) {
            int totalCredits = getHoursEnrolled();
            return totalCredits * creditHourCost;
        }
        return 0.0;
    }

    private void sortCourses() {
        for (int i = 0; i < numberOfCourses - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numberOfCourses; j++) {
                if (courseEnrolled[j].getCourseNumber().compareTo(courseEnrolled[minIndex].getCourseNumber()) < 0) {
                    minIndex = j;
                }
            }
            swapCourses(i, minIndex);
        }
    }

    private void swapCourses(int index1, int index2) {
        Course tempCourse = courseEnrolled[index1];
        double tempGrade = courseGrade[index1];
        courseEnrolled[index1] = courseEnrolled[index2];
        courseGrade[index1] = courseGrade[index2];
        courseEnrolled[index2] = tempCourse;
        courseGrade[index2] = tempGrade;
    }
}