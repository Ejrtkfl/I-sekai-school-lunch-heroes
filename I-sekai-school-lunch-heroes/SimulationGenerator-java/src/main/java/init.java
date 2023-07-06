import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;
import java.util.HashSet;

public class init {

    public void init(){
        setupStudents();
        setupStartSequence();
    }

    /**
     * 학생 오브젝트 생성, 현재 위치에 학생 투입
     * @param IDPrefix 학년 + 반
     * @param amount 반 학생 수
     */
    private void createStudents(String IDPrefix, int amount){
        for (int i=1;i<=amount;i++){
            Student student = new Student(String.format("%s%02d",IDPrefix,i));
            DataSlot.StudentHM.put(student.studentID,student);
            DataSlot.StudentMovingCountHM.put(student.studentID,0);
            DataSlot.LocationMVM.add(student.locationAL.get(0),student.studentID);
        }
    }

    /**
     * 학생 오브젝트 생성
     */
    private void setupStudents(){
        for (int i = 1;i <= 14;i++){
            String IDPrefix = String.format("1%02d",i);
            createStudents(IDPrefix,35);
        }
        for (int i = 1;i <= 14;i++){
            String IDPrefix = String.format("2%02d",i);
            createStudents(IDPrefix,33);
        }
        for (int i = 1;i <= 13;i++){
            String IDPrefix = String.format("3%02d",i);
            createStudents(IDPrefix,31);
        }
    }

    /**
     * 학생들 출발 속도 초기화 / 기본값은 1355명의 학생들이 동시에 출발한다
     */
    private void setupStartSequence(){
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

        DataSlot.startSequence2.add(0,"03000");
        DataSlot.startSequence2.add(0,"03001");
        DataSlot.startSequence2.add(0,"03002");
        DataSlot.startSequence2.add(0,"03003");
        DataSlot.startSequence2.add(0,"03004");
        DataSlot.startSequence2.add(0,"04010");
        DataSlot.startSequence2.add(0,"04011");
        DataSlot.startSequence2.add(0,"04000");
        DataSlot.startSequence2.add(0,"04001");
        DataSlot.startSequence2.add(0,"04002");
        DataSlot.startSequence2.add(0,"04003");
        DataSlot.startSequence2.add(0,"04004");
        DataSlot.startSequence2.add(0,"04005");
        DataSlot.startSequence2.add(0,"04006");

        DataSlot.startSequence1.add(0,"13000");
        DataSlot.startSequence1.add(0,"13001");
        DataSlot.startSequence1.add(0,"13002");
        DataSlot.startSequence1.add(0,"14000");
        DataSlot.startSequence1.add(0,"14001");
        DataSlot.startSequence1.add(0,"14002");
        DataSlot.startSequence1.add(0,"03005");
        DataSlot.startSequence1.add(0,"03006");
        DataSlot.startSequence1.add(0,"03007");
        DataSlot.startSequence1.add(0,"03008");
        DataSlot.startSequence1.add(0,"03009");
        DataSlot.startSequence1.add(0,"02000");
        DataSlot.startSequence1.add(0,"01000");
        DataSlot.startSequence1.add(0,"01001");
    }

    public void reset(){
        DataSlot.StudentHM = new HashMap<>(); // ID / Student
        DataSlot.WalkingStudentHM = new HashSet<>(); // ID
        DataSlot.EatingStudentMVM = new LinkedMultiValueMap<>(); // Time / ID
        DataSlot.FinishedStudentHM = new HashSet<>(); // ID
        DataSlot.StudentMovingCountHM = new HashMap<>(); // ID / Count
        DataSlot.LocationMVM = new LinkedMultiValueMap<>(); // LocationID / StudentsID

        DataSlot.startSequence3 = new LinkedMultiValueMap<>(); // tick / LocationString
        DataSlot.startSequence2 = new LinkedMultiValueMap<>(); // tick / LocationString
        DataSlot.startSequence1 = new LinkedMultiValueMap<>(); // tick / LocationString

        run.done = false;
        run.tick = 0;
    }
}
