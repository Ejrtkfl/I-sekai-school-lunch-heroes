import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;

public class init {
    Student student = new Student();
    public void setup(){
        setupStudents();
        setupStartSequence();
    }

    /**
     * 학생 오브젝트 생성, 현재 위치에 학생 투입
     * @param IDPrefix 학년 + 반
     * @param amount 반 학생 수
     */
    private void createStudents(String IDPrefix, int amount){
    }

    /**
     * 학생 오브젝트 생성
     */
    private void setupStudents(){
        Utils utils = new Utils();
        for (int i = 1;i <= 14;i++){
            for (int j=1;j<=35;j++){
                String ID = String.format("1%02d%02d",i,j);
                Queue<String> routeAL = student.getRouteAL(ID);
                DataSlot.StudentHMQ.put(ID,routeAL);
                utils.add(routeAL.peek(),ID);
            }
        }
        for (int i = 1;i <= 14;i++){
            for (int j=1;j<=33;j++){
                String ID = String.format("2%02d%02d",i,j);
                Queue<String> routeAL = student.getRouteAL(ID);
                DataSlot.StudentHMQ.put(ID,routeAL);
                utils.add(routeAL.peek(),ID);
            }
        }
        for (int i = 1;i <= 13;i++){
            for (int j=1;j<=31;j++){
                String ID = String.format("3%02d%02d",i,j);
                Queue<String> routeAL = student.getRouteAL(ID);
                DataSlot.StudentHMQ.put(ID,routeAL);
                utils.add(routeAL.peek(),ID);
            }
        }
    }

    /**
     * 학생들 출발 속도 초기화 / 기본값은 1355명의 학생들이 동시에 출발한다
     */
    private void setupStartSequence(){
        // 최적값
        DataSlot.startSequence3.put(5,"05001");
        DataSlot.startSequence3.put(8,"05000");
        DataSlot.startSequence3.put(11,"05002");
        DataSlot.startSequence3.put(6,"04009");
        DataSlot.startSequence3.put(9,"04008");
        DataSlot.startSequence3.put(12,"04007");
        DataSlot.startSequence3.put(15,"05009");
        DataSlot.startSequence3.put(17,"05008");
        DataSlot.startSequence3.put(19,"05007");
        DataSlot.startSequence3.put(21,"05006");
        DataSlot.startSequence3.put(23,"05005");
        DataSlot.startSequence3.put(25,"05004");
        DataSlot.startSequence3.put(27,"05003");

        DataSlot.startSequence2.put(40,"03001");
        DataSlot.startSequence2.put(42,"03000");
        DataSlot.startSequence2.put(44,"03002");
        DataSlot.startSequence2.put(46,"03003");
        DataSlot.startSequence2.put(48,"03004");
        DataSlot.startSequence2.put(41,"04006");
        DataSlot.startSequence2.put(43,"04005");
        DataSlot.startSequence2.put(45,"04004");
        DataSlot.startSequence2.put(47,"04003");
        DataSlot.startSequence2.put(51,"04011");
        DataSlot.startSequence2.put(55,"04002");
        DataSlot.startSequence2.put(59,"04010");
        DataSlot.startSequence2.put(61,"04001");
        DataSlot.startSequence2.put(63,"04000");

        DataSlot.startSequence1.put(75,"02000");
        DataSlot.startSequence1.put(77,"01001");
        DataSlot.startSequence1.put(79,"01000");
        DataSlot.startSequence1.put(81,"03009");
        DataSlot.startSequence1.put(83,"03008");
        DataSlot.startSequence1.put(85,"03007");
        DataSlot.startSequence1.put(87,"03006");
        DataSlot.startSequence1.put(89,"03005");
        DataSlot.startSequence1.put(100,"13002");
        DataSlot.startSequence1.put(102,"13001");
        DataSlot.startSequence1.put(104,"13000");
        DataSlot.startSequence1.put(106,"14002");
        DataSlot.startSequence1.put(108,"14001");
        DataSlot.startSequence1.put(110,"14000");
    }

    public void reset(){
        DataSlot.StudentHMQ = new HashMap<>(); // ID / Student
        DataSlot.WalkingStudentHS = new HashSet<>(); // ID
        //DataSlot.EatingStudentHMAL = new HashMap<>(); // Time / ID
        DataSlot.FinishedStudentHS = new HashSet<>(); // ID
        DataSlot.LocationHMAL = new HashMap<>(); // LocationID / StudentsID

        DataSlot.startSequence3 = new HashMap<>(); // tick / LocationString
        DataSlot.startSequence2 = new HashMap<>(); // tick / LocationString
        DataSlot.startSequence1 = new HashMap<>(); // tick / LocationString

        run.done = false;
        run.tick = 0;
    }
    // 기본 값
    /*
        DataSlot.startSequence3.add(0,"05000");
        DataSlot.startSequence3.add(0,"05001");
        DataSlot.startSequence3.add(0,"05002");
        DataSlot.startSequence3.add(0,"05003");
        DataSlot.startSequence3.add(0,"05004");
        DataSlot.startSequence3.add(0,"05005");
        DataSlot.startSequence3.add(0,"05006");
        DataSlot.startSequence3.add(0,"05007");
        DataSlot.startSequence3.add(0,"05008");
        DataSlot.startSequence3.add(0,"05009");
        DataSlot.startSequence3.add(0,"04009");
        DataSlot.startSequence3.add(0,"04008");
        DataSlot.startSequence3.add(0,"04007");

        DataSlot.startSequence2.put(40,"03001");
        DataSlot.startSequence2.put(42,"03000");
        DataSlot.startSequence2.put(44,"03002");
        DataSlot.startSequence2.put(46,"03003");
        DataSlot.startSequence2.put(48,"03004");
        DataSlot.startSequence2.put(41,"04006");
        DataSlot.startSequence2.put(43,"04005");
        DataSlot.startSequence2.put(45,"04004");
        DataSlot.startSequence2.put(47,"04003");
        DataSlot.startSequence2.put(51,"04011");
        DataSlot.startSequence2.put(55,"04002");
        DataSlot.startSequence2.put(59,"04010");
        DataSlot.startSequence2.put(61,"04001");
        DataSlot.startSequence2.put(63,"04000");

        DataSlot.startSequence1.put(75,"02000");
        DataSlot.startSequence1.put(77,"01001");
        DataSlot.startSequence1.put(79,"01000");
        DataSlot.startSequence1.put(81,"03009");
        DataSlot.startSequence1.put(83,"03008");
        DataSlot.startSequence1.put(85,"03007");
        DataSlot.startSequence1.put(87,"03006");
        DataSlot.startSequence1.put(89,"03005");
        DataSlot.startSequence1.put(100,"13002");
        DataSlot.startSequence1.put(102,"13001");
        DataSlot.startSequence1.put(104,"13000");
        DataSlot.startSequence1.put(106,"14002");
        DataSlot.startSequence1.put(108,"14001");
        DataSlot.startSequence1.put(110,"14000");
    */
}
