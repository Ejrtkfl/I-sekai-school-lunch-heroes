import java.util.List;

public class RandSPoint {

    //default

    public static void firstMoving(String classLocationID){
        for (String studentID : DataSlot.getStudents(classLocationID)){
            DataSlot.WalkingStudentHM.add(studentID);
            DataSlot.LocationMVM.remove(classLocationID,studentID);

            DataSlot.StudentMovingCountHM.put(studentID, 1);
            String afterLocationID = DataSlot.getLocation(studentID);
            DataSlot.LocationMVM.add(afterLocationID,studentID);
        }
    }

    public static void startMoving(int tick){
        if(DataSlot.startSequence3.containsKey(tick)){
            List<String> classes = DataSlot.startSequence3.get(tick);
            for (String classLocation : classes){
                firstMoving(classLocation);
            }
        }
        if(DataSlot.startSequence3.containsKey(tick)){
            List<String> classes = DataSlot.startSequence3.get(tick);
            for (String classLocation : classes){
                firstMoving(classLocation);
            }
        }
        if(DataSlot.startSequence3.containsKey(tick)){
            List<String> classes = DataSlot.startSequence3.get(tick);
            for (String classLocation : classes){
                firstMoving(classLocation);
            }
        }

    }
}
