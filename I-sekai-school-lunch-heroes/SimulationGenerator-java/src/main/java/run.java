import java.util.ArrayList;
import java.util.HashSet;

public class run {
    boolean done = false;
    int tick = 0;
    public void run(){
        while(!done){

            moveStudents(DataSlot.locationHM.get("02300"));

            moveStudents(DataSlot.locationHM.get("02100"));
            moveStudents(DataSlot.locationHM.get("02101"));
            moveStudents(DataSlot.locationHM.get("02102"));
            moveStudents(DataSlot.locationHM.get("02103"));
            moveStudents(DataSlot.locationHM.get("02104"));
            moveStudents(DataSlot.locationHM.get("02105"));

            moveStudents(DataSlot.locationHM.get("12104"));
            moveStudents(DataSlot.locationHM.get("12103"));
            moveStudents(DataSlot.locationHM.get("12102"));
            moveStudents(DataSlot.locationHM.get("12101"));
            moveStudents(DataSlot.locationHM.get("12100"));

            moveStudents(DataSlot.locationHM.get("02200"));
            moveStudents(DataSlot.locationHM.get("02201"));
            moveStudents(DataSlot.locationHM.get("01200"));
            moveStudents(DataSlot.locationHM.get("03200"));
            moveStudents(DataSlot.locationHM.get("03201"));
            moveStudents(DataSlot.locationHM.get("04200"));
            moveStudents(DataSlot.locationHM.get("04201"));
            moveStudents(DataSlot.locationHM.get("05200"));
            moveStudents(DataSlot.locationHM.get("05201"));

            moveStudents(DataSlot.locationHM.get("12200"));
            moveStudents(DataSlot.locationHM.get("13200"));
            moveStudents(DataSlot.locationHM.get("14200"));

            moveStudents(DataSlot.locationHM.get("01100"));
            moveStudents(DataSlot.locationHM.get("01101"));

            moveStudents(DataSlot.locationHM.get("03100"));
            moveStudents(DataSlot.locationHM.get("03102"));
            moveStudents(DataSlot.locationHM.get("03101"));

            moveStudents(DataSlot.locationHM.get("03103"));
            moveStudents(DataSlot.locationHM.get("03104"));
            moveStudents(DataSlot.locationHM.get("03105"));
            moveStudents(DataSlot.locationHM.get("03106"));
            moveStudents(DataSlot.locationHM.get("03107"));
            moveStudents(DataSlot.locationHM.get("03108"));

            moveStudents(DataSlot.locationHM.get("04100"));
            moveStudents(DataSlot.locationHM.get("04102"));
            moveStudents(DataSlot.locationHM.get("04101"));

            moveStudents(DataSlot.locationHM.get("04103"));
            moveStudents(DataSlot.locationHM.get("04104"));
            moveStudents(DataSlot.locationHM.get("04105"));
            moveStudents(DataSlot.locationHM.get("04106"));
            moveStudents(DataSlot.locationHM.get("04107"));
            moveStudents(DataSlot.locationHM.get("04108"));

            moveStudents(DataSlot.locationHM.get("05100"));
            moveStudents(DataSlot.locationHM.get("05102"));
            moveStudents(DataSlot.locationHM.get("05101"));

            moveStudents(DataSlot.locationHM.get("05103"));
            moveStudents(DataSlot.locationHM.get("05104"));
            moveStudents(DataSlot.locationHM.get("05105"));
            moveStudents(DataSlot.locationHM.get("05106"));
            moveStudents(DataSlot.locationHM.get("05107"));
            moveStudents(DataSlot.locationHM.get("05108"));

            // modified

            tick++;
        }
    }

    private void moveStudents(Location location){
        int remain = location.capacity - location.studentAL.size();
        for (int i = 0;i < remain;i++){
            moveStudent(location);
        }
    }

    private void moveStudent(Location location){
        for (Student student : DataSlot.studentAL){
            String beforeRoute = student.routeAL.get(0);
            String afterRoute = student.routeAL.get(1);
            if (beforeRoute.equals(location.locationString)){
                Location beforeLocation = DataSlot.locationHM.get(beforeRoute);
                DataSlot.locationHM.put(beforeRoute,beforeLocation.remove(student));

                DataSlot.studentAL.remove(student);
                student = student.removeAL(0);

                Location afterLocation = DataSlot.locationHM.get(afterRoute);
                DataSlot.locationHM.put(afterRoute,afterLocation.add(student));

                DataSlot.studentAL.add(student);
                break;
            }
        }
    }
}
