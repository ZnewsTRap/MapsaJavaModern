package Semester_Info;

public class Course {
    private int id;
    private String courseName;
    private int age_RangeStart;
    private int age_RangeEnd;

    //constructor


    public Course(int id, String courseName, int age_RangeStart, int age_RangeEnd) {
        this.id = id;
        this.courseName = courseName;
        this.age_RangeStart = age_RangeStart;
        this.age_RangeEnd = age_RangeEnd;
    }
    public Course(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAge_RangeStart() {
        return age_RangeStart;
    }

    public void setAge_RangeStart(int age_RangeStart) {
        this.age_RangeStart = age_RangeStart;
    }

    public int getAge_RangeEnd() {
        return age_RangeEnd;
    }

    public void setAge_RangeEnd(int age_RangeEnd) {
        this.age_RangeEnd = age_RangeEnd;
    }
}
