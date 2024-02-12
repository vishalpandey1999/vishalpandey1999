package About_Collage;

public class Teacher {
    private int teacher_id;
    private String name;
    private String subject;

    public Teacher(){}
    public Teacher(int teacher_id, String name, String subject){
        this.teacher_id = teacher_id;
        this.name = name;
        this.subject = subject;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void updateTeacherInfo(int teacher_id, String name, String subject){
        this.teacher_id = teacher_id;
        this.name = name;
        this.subject = subject;
    }

    public void displayTeacherInfo(){
        System.out.println("Teacher Id: "+teacher_id);
        System.out.println("Teacher Name: "+name);
        System.out.println("Subject: "+subject);
    }
}
