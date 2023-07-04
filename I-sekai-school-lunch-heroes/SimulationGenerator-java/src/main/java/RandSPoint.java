import java.util.List;

public class RandSPoint {

    //default


    public void startMoving(int tick){
        if(DataSlot.startSequence3.containsKey(tick)){
            List<String> list = DataSlot.startSequence3.get(tick);
            for (String locationString : list){
                run r = new run();
                r.moveStudent(DataSlot.locationHM.get(locationString));
            }
        }
    }
}
