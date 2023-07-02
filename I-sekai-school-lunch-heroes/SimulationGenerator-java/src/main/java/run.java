import java.util.ArrayList;
import java.util.HashSet;

public class run {
    boolean done = false;
    int tick = 0;
    public void run(){
        while(!done){



            tick++;
        }
    }

    private void moveStudents(){

    }

    private void moveStudent(String locationNum){
        Location startLocation = DataSlot.locationHM.get(locationNum);
        ArrayList<Student> studentAL = startLocation.studentAL;
        Student removedStudent = studentAL.remove(0);
        removedStudent.routeAL.remove(0);
        String target = removedStudent.routeAL.get(0).locationNumber;
        DataSlot.locationHM.put(target,DataSlot.locationHM.get(target).add(removedStudent));
    }
}
