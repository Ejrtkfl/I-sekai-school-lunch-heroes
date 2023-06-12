import java.util.HashSet;

public class Location {
    int building;
    int floor;
    int locationNumber;
    int capacity;
    HashSet<Student> studentHS = new HashSet<>();

    Location(int building, int floor, int locationNumber){
        this.building = building;
        this.floor = floor;
        this.locationNumber = locationNumber;

        if(locationNumber%100==1){// 복도
            this.capacity = 20*DataSlot.MaxDensity;
        }
        else if(locationNumber%100==2){// 계단
            this.capacity = 20*DataSlot.MaxDensity;
        }
        else if(locationNumber%100==3){// 교실
            this.capacity = 20*DataSlot.MaxDensity;
        }
        else if(locationNumber%100==4){// 급식실
            this.capacity = 20*DataSlot.MaxDensity;
        }
    }

    public Location add(Student student){
        studentHS.add(student);
        return this;
    }
}
