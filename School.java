package About_Collage;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Classroom> classrooms;

    public School(){
        classrooms = new ArrayList<>();
    }

    public void createClassroom(int classId){
        Classroom classroom = new Classroom(classId);
        classrooms.add(classroom);
    }

    public void removeClassroom(int classId){
        Classroom classroom = new Classroom(classId);
        for(Classroom classroom1 : classrooms){
            if(classroom1.getClassId() == classId){
                classrooms.remove(classroom);
                return;
            }
        }
    }
    public List<Classroom> listClassrooms() {
        return classrooms;
    }
}
