import java.util.HashSet;

public class Route {
    int building; // 0->본관 1->후관
    int floor; // 층 1~5
    String locationNumber; // 세부 위치

    Route(int building, int floor, String locationNumber){
        this.building = building;
        this.floor = floor;
        this.locationNumber = locationNumber;
    }

    public String getLocationNumber(){
        return this.locationNumber;
    }
}