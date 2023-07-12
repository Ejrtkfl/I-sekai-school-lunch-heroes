import java.util.ArrayList;
import java.util.List;

public class Utils {
    /**
     * 학생의 현재 위치
     * @param studentID 학생의 ID
     * @return 학생의 현재 위치
     */
    public String getLocation(String studentID){
        int movingCount = DataSlot.StudentMovingCountHM.get(studentID);
        return DataSlot.StudentMVM.get(studentID).get(movingCount);
    }

    /**
     * 해당 장소에 있는 모든 학생들
     * @param locationID 장소 고유번호
     * @return students in location
     */
    public List<String> getStudents(String locationID){
        return DataSlot.LocationMVM.get(locationID);
    }

    /**
     * 학생을 다음 장소로 이동
     * @param studentID 학생번호
     */
    public void move(String studentID){
        int movingCount = DataSlot.StudentMovingCountHM.get(studentID);
        //System.out.printf("%d : %s\n",movingCount,getLocation(studentID));
        String afterLocationID = "";
        try {
            afterLocationID = DataSlot.StudentMVM.get(studentID).get(movingCount+1);
            DataSlot.LocationMVM.remove(getLocation(studentID),studentID);
            DataSlot.StudentMovingCountHM.put(studentID,movingCount+1);
            DataSlot.LocationMVM.add(getLocation(studentID),studentID);
            //System.out.printf("%d : %s\n",DataSlot.StudentMovingCountHM.get(studentID),getLocation(studentID));
        } catch (IndexOutOfBoundsException ignored){}
    }
}
