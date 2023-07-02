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

        String nowLocationNum = student.routeAL.get(0).getLocationNumber();

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
    private void createLocation(int building, int floor, String locationNumber){
        Location location = new Location(building, floor, locationNumber);
        DataSlot.locationHM.put(location.locationNumber,location);
    }
    private void setupLocation(){
        createLocation(0,1,"000");
        createLocation(0,1,"001");

        createLocation(0,1,"100");
        createLocation(0,1,"101");
        createLocation(0,1,"102");

        createLocation(0,1,"200");


        createLocation(0,2,"000");

        createLocation(0,2,"100");
        createLocation(0,2,"101");
        createLocation(0,2,"102");
        createLocation(0,2,"103");
        createLocation(0,2,"104");
        createLocation(0,2,"105");

        createLocation(0,2,"200");
        createLocation(0,2,"201");

        createLocation(0,2,"300");


        createLocation(0,3,"000");
        createLocation(0,3,"001");
        createLocation(0,3,"002");
        createLocation(0,3,"003");
        createLocation(0,3,"004");
        createLocation(0,3,"005");
        createLocation(0,3,"006");
        createLocation(0,3,"007");
        createLocation(0,3,"008");
        createLocation(0,3,"009");

        createLocation(0,3,"100");
        createLocation(0,3,"101");
        createLocation(0,3,"102");
        createLocation(0,3,"103");
        createLocation(0,3,"104");
        createLocation(0,3,"105");
        createLocation(0,3,"106");
        createLocation(0,3,"107");
        createLocation(0,3,"108");

        createLocation(0,3,"200");
        createLocation(0,3,"201");


        createLocation(0,4,"000");
        createLocation(0,4,"001");
        createLocation(0,4,"002");
        createLocation(0,4,"003");
        createLocation(0,4,"004");
        createLocation(0,4,"005");
        createLocation(0,4,"006");
        createLocation(0,4,"007");
        createLocation(0,4,"008");
        createLocation(0,4,"009");
        createLocation(0,4,"010");
        createLocation(0,4,"011");

        createLocation(0,4,"100");
        createLocation(0,4,"101");
        createLocation(0,4,"102");
        createLocation(0,4,"103");
        createLocation(0,4,"104");
        createLocation(0,4,"105");
        createLocation(0,4,"106");
        createLocation(0,4,"107");
        createLocation(0,4,"108");

        createLocation(0,4,"200");
        createLocation(0,4,"201");


        createLocation(0,5,"000");
        createLocation(0,5,"001");
        createLocation(0,5,"002");
        createLocation(0,5,"003");
        createLocation(0,5,"004");
        createLocation(0,5,"005");
        createLocation(0,5,"006");
        createLocation(0,5,"007");
        createLocation(0,5,"008");
        createLocation(0,5,"009");

        createLocation(0,5,"100");
        createLocation(0,5,"101");
        createLocation(0,5,"102");
        createLocation(0,5,"103");
        createLocation(0,5,"104");
        createLocation(0,5,"105");
        createLocation(0,5,"106");
        createLocation(0,5,"107");
        createLocation(0,5,"108");

        createLocation(0,5,"200");
        createLocation(0,5,"201");


        createLocation(1,2,"100");
        createLocation(1,2,"101");
        createLocation(1,2,"102");
        createLocation(1,2,"103");
        createLocation(1,2,"104");

        createLocation(1,2,"200");


        createLocation(1,3,"000");
        createLocation(1,3,"001");
        createLocation(1,3,"002");

        createLocation(1,3,"100");
        createLocation(1,3,"101");
        createLocation(1,3,"102");

        createLocation(1,3,"200");


        createLocation(1,4,"000");
        createLocation(1,4,"001");
        createLocation(1,4,"002");

        createLocation(1,4,"100");
        createLocation(1,4,"101");
        createLocation(1,4,"102");
        createLocation(1,4,"103");

        createLocation(1,4,"200");
    }
}
