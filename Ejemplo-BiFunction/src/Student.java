public class Student {
    private String StudentName;
    private String Grade;

    public Student (String StudentName, String Grade){
        this.StudentName = StudentName;
        this. Grade = Grade;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }
}
