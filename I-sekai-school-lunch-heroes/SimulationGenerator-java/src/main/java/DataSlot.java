import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.*;

/**
 * public variables
 */
public class DataSlot {
    /**
     * 학생 번호에 따라서 이동경로 저장
     */
    public static MultiValueMap<String,String> StudentMVM = new LinkedMultiValueMap<>(); // StudentID / LocationIDs
    /**
     * 해당 HS 안에 있는 학생들은 매 틱마다 이동. ID로 저장
     */
    public static HashSet<String> WalkingStudentHS = new HashSet<>(); // ID
    /**
     * 급식실 내부에 있는 학생들. 일정 시간 후 FinishedStudentHM으로 이동 WalkingStudentHS와 중복
     */
    public static MultiValueMap<Integer,String> EatingStudentMVM = new LinkedMultiValueMap<>(); // Time / ID
    /**
     * 식사를 마친 학생들. Size == 1355 일때 시뮬레이션 종료
     */
    public static HashSet<String> FinishedStudentHS = new HashSet<>(); // ID
    /**
     * 학생들의 위치 데이터
     */
    public static HashMap<String,Integer> StudentMovingCountHM = new HashMap<>(); // ID / Count
    /**
     * 현재 해당 장소에 있는 학생들의 ID
     */
    public static MultiValueMap<String,String> LocationMVM = new LinkedMultiValueMap<>(); // LocationID / StudentsID
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
}
