package About_Collage;

public class School_Test {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Vishal Pandey",22.4f,'B');
        Student s2 = new Student(102,"Shivam Tiwari",26.4f,'A');

        Teacher t1 = new Teacher(444,"Raj Mohan Pandey","Java web development");
        Classroom c1 = new Classroom(10);
        System.out.println("information student number 1");
        c1.assignTeacher(t1);
        c1.addStudent(s1);
        School school = new School();
        school.createClassroom(10);
        c1.displayClassInfo();

//        for student 2
        System.out.println("information student number 2");
        c1.assignTeacher(t1);
        c1.addStudent(s2);
        school.createClassroom(10);
        c1.displayClassInfo();
    }
}
