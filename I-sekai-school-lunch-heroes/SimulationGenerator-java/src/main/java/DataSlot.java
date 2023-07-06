import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.*;

/**
 * public variables
 */
public class DataSlot {
    /**
     * 모든 학생 데이터는 StudentHM에서만 저장되며 변경되지 않음
     */
    public static HashMap<String,Student> StudentHM = new HashMap<>(); // ID / Student
    /**
     * 해당 HS 안에 있는 학생들은 매 틱마다 이동. ID로 저장
     */
    public static HashSet<String> WalkingStudentHM = new HashSet<>(); // ID
    /**
     * 급식실 내부에 있는 학생들. 일정 시간 후 FinishedStudentHM으로 이동
     */
    public static MultiValueMap<Integer,String> EatingStudentMVM = new LinkedMultiValueMap<>(); // Time / ID
    /**
     * 식사를 마친 학생들. Size가 1355가 되면 시뮬레이션 종료
     */
    public static HashSet<String> FinishedStudentHM = new HashSet<>(); // ID
    /**
     * 학생들의 위치 데이터
     */
    public static HashMap<String,Integer> StudentMovingCountHM = new HashMap<>(); // ID / Count
    /**
     * 현재 해당 장소에 있는 학생들의 ID
     */
    public static LinkedMultiValueMap<String,String> LocationMVM = new LinkedMultiValueMap<>(); // LocationID / StudentsID

    /**
     * 학생의 현재 위치
     * @param studentID 학생의 ID
     * @return 학생의 현재 위치
     */
    public static String getLocation(String studentID){
        Student student = StudentHM.get(studentID);
        ArrayList<String> locationAL = student.locationAL;
        int movingCount = StudentMovingCountHM.get(studentID);
        return locationAL.get(movingCount);
    }

    /**
     * 해당 장소에 있는 모든 학생들
     * @param locationID 장소 고유번호
     * @return students in location
     */
    public static List<String> getStudents(String locationID){
        return LocationMVM.get(locationID);
    }

    /**
     * 3학년 출발 순서
     */
    public static MultiValueMap<Integer,String> startSequence3 = new LinkedMultiValueMap<>(); // tick / LocationString
    /**
     * 2학년 출발 순서
     */
    public static MultiValueMap<Integer,String> startSequence2 = new LinkedMultiValueMap<>(); // tick / LocationString
    /**
     * 1학년 출발 순서
     */
    public static MultiValueMap<Integer,String> startSequence1 = new LinkedMultiValueMap<>(); // tick / LocationString

    /**
     * 학생 인구 밀도 / 사용 안 함
     */
    @Deprecated
    public static int MaxDensity = 1;
}
