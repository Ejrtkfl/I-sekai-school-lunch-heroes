import java.util.ArrayList;
import java.util.HashMap;

public class init {

    public void init(){
        setupLocation();
        setupStudents();
    }

    /**
     * 학생 오브젝트 생성, 현재 위치에 학생 투입
     * @param grade 학년
     * @param classroom 반
     * @param amount 반 학생 수
     */
    private void createStudents(int grade, int classroom, int amount){
        Student student = new Student(grade,classroom);
        int nowLocationNum = student.routeAL.get(0);
        Location location = DataSlot.locationHM.get(nowLocationNum);
        for (int i=0;i<amount;i++){
            location.add(student);
        }
        DataSlot.locationHM.put(nowLocationNum,location);
    }

    private void setupStudents(){
        createStudents(1,1,35);
        createStudents(1,2,35);
        createStudents(1,3,35);
        createStudents(1,4,35);
        createStudents(1,5,35);
        createStudents(1,6,35);
        createStudents(1,7,35);
        createStudents(1,8,35);
        createStudents(1,9,35);
        createStudents(1,10,35);
        createStudents(1,11,35);
        createStudents(1,12,35);
        createStudents(1,13,35);
        createStudents(1,14,35);

        createStudents(2,1,33);
        createStudents(2,2,33);
        createStudents(2,3,33);
        createStudents(2,4,33);
        createStudents(2,5,33);
        createStudents(2,6,33);
        createStudents(2,7,33);
        createStudents(2,8,33);
        createStudents(2,9,33);
        createStudents(2,10,33);
        createStudents(2,11,33);
        createStudents(2,12,33);
        createStudents(2,13,33);

        createStudents(3,1,31);
        createStudents(3,2,31);
        createStudents(3,3,31);
        createStudents(3,4,31);
        createStudents(3,5,31);
        createStudents(3,6,31);
        createStudents(3,7,31);
        createStudents(3,8,31);
        createStudents(3,9,31);
        createStudents(3,10,31);
        createStudents(3,11,31);
        createStudents(3,12,31);
        createStudents(3,13,31);
    }
    private void createLocation(int building, int floor, int locationNumber){
        Location location = new Location(building, floor, locationNumber);
        DataSlot.locationHM.put(location.locationNumber,location);
    }
    private void setupLocation(){
        createLocation(0,1,100);
        createLocation(1,2,101);
    }
}
