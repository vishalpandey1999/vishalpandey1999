package About_Collage;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private int classId;
    private List<Student> students;
    private Teacher teacher;

    public Classroom(){}
    public Classroom(int classId){
        this.classId = classId;
        students = new ArrayList<>();
           }

    public void assignTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void displayClassInfo(){
        System.out.println("Class ID: "+classId);
        System.out.println("Teacher Information: ");
        teacher.displayTeacherInfo();
        System.out.println("Student in the class");
        for(Student student : students){
            student.displayStudentInfo();
        }
    }

    public int getClassId() {
        return classId;
    }
}
