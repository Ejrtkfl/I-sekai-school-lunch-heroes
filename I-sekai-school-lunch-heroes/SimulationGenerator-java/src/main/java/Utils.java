import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Utils {
    /**
     * 학생의 현재 위치
     * @param studentID 학생의 ID
     * @return 학생의 현재 위치
     */
    public String getLocation(String studentID){
        return DataSlot.StudentHMQ.get(studentID).peek();
    }

    /**
     * 해당 장소에 있는 모든 학생들
     * @param locationID 장소 고유번호
     * @return students in location
     */
    public ArrayList<String> getStudents(String locationID){
        return DataSlot.LocationHMAL.get(locationID);
    }

    /**
     * locationAL에 학생 추가
     * @param locationID 위치
     * @param studentID 학생
     */
    public void add(String locationID, String studentID){
        ArrayList<String> students = DataSlot.LocationHMAL.get(locationID);
        try {
            students.add(studentID);
        } catch (NullPointerException exception){
            students = new ArrayList<>();
            students.add(studentID);
        }
        DataSlot.LocationHMAL.put(locationID,students);
    }
    /**
     * locationAL에 학생 제거
     * @param locationID 위치
     * @param studentID 학생
     */
    public void remove(String locationID, String studentID){
        ArrayList<String> students = DataSlot.LocationHMAL.get(locationID);
        students.remove(studentID);
        DataSlot.LocationHMAL.put(locationID,students);
    }
    /**
     * 학생을 다음 장소로 이동
     * @param studentID 학생 번호
     */
    public void move(String studentID,boolean ignoreCapacity){
        Queue<String> routeQueue = DataSlot.StudentHMQ.get(studentID);
        String beforeLocation = routeQueue.peek();
        routeQueue.remove();
        String afterLocation = routeQueue.peek();
        if (beforeLocation.equals("02300")){ // 이미 급식실
            DataSlot.WalkingStudentHS.remove(studentID);
            DataSlot.FinishedStudentHS.add(studentID);
            /*ArrayList<String> arrayList = new ArrayList<>();
            if (DataSlot.EatingStudentHMAL.get(run.tick+30)!=null){
                arrayList = DataSlot.EatingStudentHMAL.get(run.tick+30);
            }
            arrayList.add(studentID);
            DataSlot.EatingStudentHMAL.put(run.tick+30,arrayList);
            return;*/
        }
        if (ignoreCapacity){
            DataSlot.StudentHMQ.put(studentID,routeQueue);

            remove(beforeLocation,studentID);
            add(afterLocation,studentID);
        }
        else {
            int capacity = 0;
            //System.out.println(beforeLocation);
            //System.out.println(afterLocation);
            if (afterLocation.charAt(2) == '0') capacity = 1000;
            else if (afterLocation.charAt(2) == '1') capacity = 1000;
            else if (afterLocation.charAt(2) == '2') capacity = 1000;
            else if (afterLocation.charAt(2) == '3') capacity = 1000;

            int size;
            if (getStudents(afterLocation)==null) size = 0;
            else size = getStudents(afterLocation).size();
            int remain = capacity - size;
            if (remain >= 1) {
                DataSlot.StudentHMQ.put(studentID,routeQueue);

                remove(beforeLocation,studentID);
                add(afterLocation,studentID);
            }
        }
    }
}
