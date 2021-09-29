package exercise.exam;

public class Exam {
    private String name;
    private String studentName;
    private int grade;


    public Exam(String name, String studentName, int grade) {
        this.name = name;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
