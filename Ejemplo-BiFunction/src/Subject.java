public class Subject {
    private String Name;
    private String TeacherName;

    public Subject (String Name, String TeacherName){
        this.Name = Name;
        this.TeacherName = TeacherName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }
}
