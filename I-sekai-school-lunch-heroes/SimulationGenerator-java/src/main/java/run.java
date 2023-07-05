public class run {
    boolean done = false;
    public static int tick = 0;

    /**
     * 급식실에서 가까운 순서대로 이동 및 정해진 타이밍에 맞춰 반 출발
     */
    public void run(){
        while(!done){

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

            moveStudents("03103");
            moveStudents("03104");
            moveStudents("03105");
            moveStudents("03106");
            moveStudents("03107");
            moveStudents("03108");

            moveStudents("04100");
            moveStudents("04102");
            moveStudents("04101");

            moveStudents("04103");
            moveStudents("04104");
            moveStudents("04105");
            moveStudents("04106");
            moveStudents("04107");
            moveStudents("04108");

            moveStudents("05100");
            moveStudents("05102");
            moveStudents("05101");

            moveStudents("05103");
            moveStudents("05104");
            moveStudents("05105");
            moveStudents("05106");
            moveStudents("05107");
            moveStudents("05108");

            // 바뀐 순서로 이동

            RandSPoint.startMoving(tick);

            finishEating();
            if(DataSlot.FinishedStudentHM.size()==1322){
                System.out.println(tick);
            }

            /*System.out.println(String.format("Walking : %d  Eating : %d  Finished : %d",
                    DataSlot.WalkingStudentHM.size(),
                    DataSlot.EatingStudentMVM.size(),
                    DataSlot.FinishedStudentHM.size()));*/

            System.out.println(String.format("%s %d %s",
                    DataSlot.StudentHM.get("30201").studentID,
                    DataSlot.StudentMovingCountHM.get("30201"),
                    DataSlot.StudentHM.get("30201").locationAL.get(DataSlot.StudentMovingCountHM.get("30201"))));
            tick++;
        }
    }
    /**
     * 해당 장소에 있는 학생들을 다음 공간으로 이동시킨다
     * @param locationID 해당 장소
     */
    public static void moveStudents(String locationID){
        if (DataSlot.LocationMVM.get(locationID)==null) return;

        for (String studentID : DataSlot.getStudents(locationID)){
            int movingCount = DataSlot.StudentMovingCountHM.get(studentID);
            String afterLocationID = DataSlot.StudentHM.get(studentID).locationAL.get(movingCount+1);

            int capacity=0;

            if (afterLocationID.charAt(2) == '0') capacity = 40;
            else if (afterLocationID.charAt(2) == '1') capacity = 50;
            else if (afterLocationID.charAt(2) == '2') capacity = 50;
            else if (afterLocationID.charAt(2) == '3') capacity = 600;

            int afterLocationRemain = capacity;
            if (DataSlot.LocationMVM.get(afterLocationID)!=null)
                afterLocationRemain -= DataSlot.LocationMVM.get(afterLocationID).size();

            if (afterLocationID.equals("02300")){
                DataSlot.LocationMVM.remove(locationID,studentID);

                DataSlot.StudentMovingCountHM.put(studentID, movingCount+1);

                DataSlot.WalkingStudentHM.remove(studentID);
                DataSlot.EatingStudentMVM.add(run.tick + 1000, studentID);
            }
            else if(afterLocationRemain>0){
                DataSlot.LocationMVM.remove(locationID,studentID);

                DataSlot.StudentMovingCountHM.put(studentID, movingCount+1);
                DataSlot.LocationMVM.add(afterLocationID,studentID);
            }

        }

    }
    /**
     * EatingStudentMVM에 있는 학생을 FinishedStudentHM으로 옮긴다
     */
    public void finishEating(){
        if (DataSlot.EatingStudentMVM.get(tick)!=null){
            for (String studentID : DataSlot.EatingStudentMVM.get(tick)){
                DataSlot.FinishedStudentHM.add(studentID);
            }
            DataSlot.EatingStudentMVM.remove(tick);
        }
    }
}
