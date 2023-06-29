public class Course {
    private String courseName;
    private String courseNumber;
    private int courseCredits;

    public Course() {
        courseName = "";
        courseNumber = "";
        courseCredits = 0;
    }

    public Course(String name, String number, int credits) {
        courseName = name;
        courseNumber = number;
        courseCredits = credits;
    }

    public void setCourseInfo(String name, String number, int credits) {
        courseName = name;
        courseNumber = number;
        courseCredits = credits;
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public void setCourseNumber(String number) {
        courseNumber = number;
    }

    public void setCourseCredits(int credits) {
        courseCredits = credits;
    }

    @Override
    public String toString() {
        return "Course Name: " + courseName + "\n" +
                "Course Number: " + courseNumber + "\n" +
                "Credits: " + courseCredits;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public int getCredits() {
        return courseCredits;
    }

    public void copyCourseInfo(Course other) {
        courseName = other.courseName;
        courseNumber = other.courseNumber;
        courseCredits = other.courseCredits;
    }

    // Add a constructor or method for copying a Course object directly if needed
}
