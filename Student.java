package About_Collage;

public class Student {
    private int student_id;
    private String name;
    private float age;
    private char grade;
    public Student(){}
    public Student(int student_id, String name, float age, char grade){
        this.student_id = student_id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }

//    student information Update information
    public void updateStudentInformation(String name, float age, char grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayStudentInfo(){
        System.out.println("Student Id: "+student_id);
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
        System.out.println("Student Grade: "+grade);
    }
}
