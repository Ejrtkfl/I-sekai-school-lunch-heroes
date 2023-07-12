import java.util.List;

public class RandSPoint {


    public static void firstMoving(String classLocationID){
        Utils utils = new Utils();
        for (String studentID : utils.getStudents(classLocationID)){
            utils.move(studentID);
            DataSlot.WalkingStudentHS.add(studentID);
        }
    }

    public static void startMoving(int tick){
        if(DataSlot.startSequence3.containsKey(tick)){
            for (String classLocation : DataSlot.startSequence3.get(tick)){
                firstMoving(classLocation);
            }
        }
        if(DataSlot.startSequence2.containsKey(tick)){
            for (String classLocation : DataSlot.startSequence2.get(tick)){
                firstMoving(classLocation);
            }
        }
        if(DataSlot.startSequence1.containsKey(tick)){
            for (String classLocation : DataSlot.startSequence1.get(tick)){
                firstMoving(classLocation);
            }
        }

    }
}
