import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class run {
    public static boolean done = false;
    public static int tick = 0;
    /**
     * 급식실에서 가까운 순서대로 이동 및 정해진 타이밍에 맞춰 반 출발
     */
    public int run(){
        log.logging(tick);
        while(!done){
            //System.out.println(DataSlot.StudentHMQ.get("30101").peek());
            finishEating();
            if(DataSlot.FinishedStudentHS.size()>=1000){
                break;
            }
            moveStudents("02300");

            moveStudents("02100");
            moveStudents("02101");
            moveStudents("02102");
            moveStudents("02103");
            moveStudents("02104");
            moveStudents("02105");

            moveStudents("12104");
            moveStudents("12103");
            moveStudents("12102");
            moveStudents("12101");
            moveStudents("12100");

            moveStudents("02200");
            moveStudents("02201");
            moveStudents("01200");
            moveStudents("03200");
            moveStudents("03201");
            moveStudents("04200");
            moveStudents("04201");
            moveStudents("05200");
            moveStudents("05201");

            moveStudents("12200");
            moveStudents("13200");
            moveStudents("14200");

            moveStudents("01100");
            moveStudents("01101");

            moveStudents("03100");
            moveStudents("03102");
            moveStudents("03101");

            moveStudents("03108");
            moveStudents("03107");
            moveStudents("03106");
            moveStudents("03105");
            moveStudents("03104");
            moveStudents("03103");

            moveStudents("04100");
            moveStudents("04102");
            moveStudents("04101");

            moveStudents("04108");
            moveStudents("04107");
            moveStudents("04106");
            moveStudents("04105");
            moveStudents("04104");
            moveStudents("04103");

            moveStudents("05100");
            moveStudents("05102");
            moveStudents("05101");

            moveStudents("05108");
            moveStudents("05107");
            moveStudents("05106");
            moveStudents("05105");
            moveStudents("05104");
            moveStudents("05103");

            RandSPoint.startMoving(tick);

            log.logging(tick);

            /*
            System.out.println(String.format("Walking : %d  Eating : %d  Finished : %d",
                    DataSlot.WalkingStudentHM.size(),
                    DataSlot.EatingStudentMVM.size(),
                    DataSlot.FinishedStudentHM.size()));
            System.out.println(DataSlot.LocationMVM.get("02100"));

            System.out.println(String.format("%s %d %s",
                    DataSlot.StudentHM.get("20201").studentID,
                    DataSlot.StudentMovingCountHM.get("20201"),
                    DataSlot.StudentHM.get("20201").locationAL.get(DataSlot.StudentMovingCountHM.get("20201"))));
            */
            tick++;
            // System.out.println(tick);
            if(tick==500){
                break;
            }
        }
        return tick;
    }
    /**
     * 해당 장소에 있는 학생들을 다음 공간으로 이동시킨다
     * @param locationID 해당 장소
     */
    public static void moveStudents(String locationID){
        Utils utils = new Utils();
        if (utils.getStudents(locationID)==null) return;

        int size = utils.getStudents(locationID).size();
        for (int i=0;i<size;i++) {
            String student = utils.getStudents(locationID).get(0);
            if (!DataSlot.WalkingStudentHS.contains(student)) return;
            utils.move(student,false);
        }

    }
    /**
     * EatingStudentMVM에 있는 학생을 FinishedStudentHM으로 옮긴다
     */
    public void finishEating(){
        /*Utils utils = new Utils();
        utils.getStudents("00000");
        if (DataSlot.EatingStudentHMAL.get(tick)==null) return;
        System.out.println(DataSlot.EatingStudentHMAL.get(tick).toString());
        for (String studentID : DataSlot.EatingStudentHMAL.get(tick)){
            DataSlot.FinishedStudentHS.add(studentID);
            utils.remove("02300",studentID);
            utils.add("00000",studentID);
        }*/
    }
}
