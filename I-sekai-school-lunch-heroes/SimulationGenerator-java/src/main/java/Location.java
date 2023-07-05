import java.util.ArrayList;
import java.util.HashSet;
@Deprecated
public class Location {

    public int getCapacity(String locationID){
        int capacity = 0;
        if(locationID.charAt(2) == '0'){// 반
            capacity = 50*DataSlot.MaxDensity;
        }
        else if(locationID.charAt(2) == '1'){// 복도
            capacity = 100*DataSlot.MaxDensity;
        }
        else if(locationID.charAt(2) == '2'){// 계단
            capacity = 40*DataSlot.MaxDensity;
        }
        else if(locationID.charAt(2) == '3'){// 급식실
            capacity = 100;
        }
        return capacity;
    }
/*
    public ArrayList<String> getStudents(String locationID){
        ArrayList<String> students = new ArrayList<>();
        for (Student student : DataSlot.studentAL){
            if(student.nowLocation().equals(locationID)){
                students.add(student.studentID);
            }
        }
        return students;
    }*/
}
