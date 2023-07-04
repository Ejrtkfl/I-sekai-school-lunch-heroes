import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * public variables
 */
public class DataSlot {
    /**
     * 학생들 현재 위치 방 단위로 저장
     * 매 틱마다 급식실에 가까운 순서대로 이동 연산
     */
    public static HashMap<String,Location> locationHM = new HashMap<>(); // LocationNumber / LocationData
    public static ArrayList<Student> studentAL = new ArrayList<>();

    public static MultiValueMap<Integer,String> startSequence3 = new LinkedMultiValueMap<>(); // tick / LocationString
    public static MultiValueMap<Integer,String> startSequence2 = new LinkedMultiValueMap<>(); // tick / LocationString
    public static MultiValueMap<Integer,String> startSequence1 = new LinkedMultiValueMap<>(); // tick / LocationString
    public static MultiValueMap<Integer,Student> eatingStudent = new LinkedMultiValueMap<>();

    /**
     * 학생 인구 밀도
     */
    public static int MaxDensity = 1;
}
