import java.util.ArrayList;
import java.util.List;

public class RandSPoint {


    public static void firstMoving(String classLocationID){
        Utils utils = new Utils();
        int size = utils.getStudents(classLocationID).size();
        for (int i=0;i<size;i++) {
            String student = utils.getStudents(classLocationID).get(0);
            utils.move(student, true);
            DataSlot.WalkingStudentHS.add(student);
        }
    }

    public static void startMoving(int tick){
        if(DataSlot.startSequence3.containsKey(tick)){
            firstMoving(DataSlot.startSequence3.get(tick));
        }
        if(DataSlot.startSequence2.containsKey(tick)){
            firstMoving(DataSlot.startSequence2.get(tick));
        }
        if(DataSlot.startSequence1.containsKey(tick)){
            firstMoving(DataSlot.startSequence1.get(tick));
        }

    }
}
