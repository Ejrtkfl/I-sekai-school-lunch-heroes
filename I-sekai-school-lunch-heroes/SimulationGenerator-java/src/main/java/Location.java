import java.util.ArrayList;
import java.util.HashSet;

public class Location {
    int building;
    int floor;
    String locationNumber;
    int capacity;
    ArrayList<Student> studentAL = new ArrayList<>();

    Location(int building, int floor, String locationNumber){
        this.building = building;
        this.floor = floor;
        this.locationNumber = locationNumber;

        if(Integer.parseInt(locationNumber)%100==0){// 반
            this.capacity = 50*DataSlot.MaxDensity;
        }
        else if(Integer.parseInt(locationNumber)%100==1){// 복도
            this.capacity = 100*DataSlot.MaxDensity;
        }
        else if(Integer.parseInt(locationNumber)%100==2){// 계단
            this.capacity = 40*DataSlot.MaxDensity;
        }
        else if(Integer.parseInt(locationNumber)%100==3){// 급식실
            this.capacity = 600;
        }
    }

    public Location add(Student student){
        studentAL.add(student);
        return this;
    }
}
