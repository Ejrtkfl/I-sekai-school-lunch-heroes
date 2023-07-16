import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Student{
    /**
     * 학생 이동 경로 반환
     * @param studentID 학번
     * @return 학생 이동 경로
     */
    public Queue<String> getRouteAL(String studentID){
        return switch (studentID.charAt(0)) {
            case '1' -> setupRouteGrade1(studentID.substring(1,3));
            case '2' -> setupRouteGrade2(studentID.substring(1,3));
            case '3' -> setupRouteGrade3(studentID.substring(1,3));
            default -> null;
        };
    }

    /**
     * 1학년 이동경로
     * @param classNumber 반
     * @return 1학년 학생 이동경로
     */
    private Queue<String> setupRouteGrade1(String classNumber){
        Queue<String> routes = new LinkedList<>();
        switch (classNumber){
            case "01":
                routes.add("13000");
                routes.add("13100");
                routes.add("13101");
                routes.add("13102");
                routes.add("13200");
                routes.add("12200");
                routes.add("12100");
                routes.add("12101");
                routes.add("12102");
                routes.add("12103");
                routes.add("12104");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "02":
                routes.add("13001");
                routes.add("13100");
                routes.add("13101");
                routes.add("13102");
                routes.add("13200");
                routes.add("12200");
                routes.add("12100");
                routes.add("12101");
                routes.add("12102");
                routes.add("12103");
                routes.add("12104");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "03":
                routes.add("13002");
                routes.add("13101");
                routes.add("13102");
                routes.add("13200");
                routes.add("12200");
                routes.add("12100");
                routes.add("12101");
                routes.add("12102");
                routes.add("12103");
                routes.add("12104");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "04":
                routes.add("14000");
                routes.add("14100");
                routes.add("14101");
                routes.add("14102");
                routes.add("14103");
                routes.add("14200");
                routes.add("13200");
                routes.add("12200");
                routes.add("12100");
                routes.add("12101");
                routes.add("12102");
                routes.add("12103");
                routes.add("12104");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "05":
                routes.add("14001");
                routes.add("14101");
                routes.add("14102");
                routes.add("14103");
                routes.add("14200");
                routes.add("13200");
                routes.add("12200");
                routes.add("12100");
                routes.add("12101");
                routes.add("12102");
                routes.add("12103");
                routes.add("12104");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "06":
                routes.add("14002");
                routes.add("14102");
                routes.add("14103");
                routes.add("14200");
                routes.add("13200");
                routes.add("12200");
                routes.add("12100");
                routes.add("12101");
                routes.add("12102");
                routes.add("12103");
                routes.add("12104");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "07":
                routes.add("03005");
                routes.add("03105");
                routes.add("03106");
                routes.add("03107");
                routes.add("03108");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "08":
                routes.add("03006");
                routes.add("03106");
                routes.add("03107");
                routes.add("03108");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "09":
                routes.add("03007");
                routes.add("03107");
                routes.add("03108");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "10":
                routes.add("03008");
                routes.add("03108");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "11":
                routes.add("03009");
                routes.add("03108");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "12":
                routes.add("02000");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "13":
                routes.add("01000");
                routes.add("01100");
                routes.add("01101");
                routes.add("01102");
                routes.add("01200");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "14":
                routes.add("01001");
                routes.add("01101");
                routes.add("01102");
                routes.add("01200");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
        }
        return routes;
    }
    /**
     * 2학년 이동경로
     * @param classNumber 반
     * @return 2학년 학생 이동경로
     */
    private Queue<String> setupRouteGrade2(String classNumber){
        Queue<String> routes = new LinkedList<>();
        switch (classNumber){
            case "01":
                routes.add("03000");
                routes.add("03100");
                routes.add("03101");
                routes.add("03200");
                routes.add("02200");
                routes.add("02300");
                routes.add("00000");
            case "02":
                routes.add("03001");
                routes.add("03101");
                routes.add("03200");
                routes.add("02200");
                routes.add("02300");
                routes.add("00000");
            case "03":
                routes.add("03002");
                routes.add("03102");
                routes.add("03101");
                routes.add("03200");
                routes.add("02200");
                routes.add("02300");
                routes.add("00000");
            case "04":
                routes.add("03003");
                routes.add("03103");
                routes.add("03102");
                routes.add("03101");
                routes.add("03200");
                routes.add("02200");
                routes.add("02300");
                routes.add("00000");
            case "05":
                routes.add("03004");
                routes.add("03104");
                routes.add("03103");
                routes.add("03102");
                routes.add("03101");
                routes.add("03200");
                routes.add("02200");
                routes.add("02300");
                routes.add("00000");
            case "06":
                routes.add("04010");
                routes.add("04102");
                routes.add("04103");
                routes.add("04104");
                routes.add("04105");
                routes.add("04106");
                routes.add("04107");
                routes.add("04108");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "07":
                routes.add("04011");
                routes.add("04103");
                routes.add("04104");
                routes.add("04105");
                routes.add("04106");
                routes.add("04107");
                routes.add("04108");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "08":
                routes.add("04000");
                routes.add("04100");
                routes.add("04101");
                routes.add("04102");
                routes.add("04103");
                routes.add("04104");
                routes.add("04105");
                routes.add("04106");
                routes.add("04107");
                routes.add("04108");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "09":
                routes.add("04001");
                routes.add("04101");
                routes.add("04102");
                routes.add("04103");
                routes.add("04104");
                routes.add("04105");
                routes.add("04106");
                routes.add("04107");
                routes.add("04108");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "10":
                routes.add("04002");
                routes.add("04102");
                routes.add("04103");
                routes.add("04104");
                routes.add("04105");
                routes.add("04106");
                routes.add("04107");
                routes.add("04108");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "11":
                routes.add("04003");
                routes.add("04103");
                routes.add("04104");
                routes.add("04105");
                routes.add("04106");
                routes.add("04107");
                routes.add("04108");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "12":
                routes.add("04004");
                routes.add("04104");
                routes.add("04105");
                routes.add("04106");
                routes.add("04107");
                routes.add("04108");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "13":
                routes.add("04005");
                routes.add("04105");
                routes.add("04106");
                routes.add("04107");
                routes.add("04108");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "14":
                routes.add("04006");
                routes.add("04106");
                routes.add("04107");
                routes.add("04108");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
        }
        return routes;
    }
    /**
     * 3학년 이동경로
     * @param classNumber 반
     * @return 3학년 학생 이동경로
     */
    private Queue<String> setupRouteGrade3(String classNumber){
        Queue<String> routes = new LinkedList<>();
        switch (classNumber){
            case "01":
                routes.add("05000");
                routes.add("05100");
                routes.add("05101");
                routes.add("05200");
                routes.add("04200");
                routes.add("03200");
                routes.add("02200");
                routes.add("02300");
                routes.add("00000");
            case "02":
                routes.add("05001");
                routes.add("05101");
                routes.add("05200");
                routes.add("04200");
                routes.add("03200");
                routes.add("02200");
                routes.add("02300");
                routes.add("00000");
            case "03":
                routes.add("05002");
                routes.add("05102");
                routes.add("05101");
                routes.add("05200");
                routes.add("04200");
                routes.add("03200");
                routes.add("02200");
                routes.add("02300");
                routes.add("00000");
            case "04":
                routes.add("05003");
                routes.add("05103");
                routes.add("05104");
                routes.add("05105");
                routes.add("05106");
                routes.add("05107");
                routes.add("05108");
                routes.add("05201");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "05":
                routes.add("05004");
                routes.add("05104");
                routes.add("05105");
                routes.add("05106");
                routes.add("05107");
                routes.add("05108");
                routes.add("05201");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "06":
                routes.add("05005");
                routes.add("05105");
                routes.add("05106");
                routes.add("05107");
                routes.add("05108");
                routes.add("05201");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "07":
                routes.add("05006");
                routes.add("05106");
                routes.add("05107");
                routes.add("05108");
                routes.add("05201");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "08":
                routes.add("05007");
                routes.add("05107");
                routes.add("05108");
                routes.add("05201");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "09":
                routes.add("05008");
                routes.add("05108");
                routes.add("05201");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "10":
                routes.add("05009");
                routes.add("05108");
                routes.add("05201");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "11":
                routes.add("04009");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "12":
                routes.add("04008");
                routes.add("04108");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
            case "13":
                routes.add("04007");
                routes.add("04107");
                routes.add("04108");
                routes.add("04201");
                routes.add("03201");
                routes.add("02201");
                routes.add("02105");
                routes.add("02104");
                routes.add("02103");
                routes.add("02102");
                routes.add("02101");
                routes.add("02100");
                routes.add("02300");
                routes.add("00000");
        }
        return routes;
    }


}
