import java.util.ArrayList;
/**
 * 학생 데이터
 */
public class Student {

    int grade; // 학년 1~3
    int classroom; // 반 1~14
    ArrayList<Integer> routeAL;
    Student(int grade, int classroom){
        this.grade = grade;
        this.classroom = classroom;
        this.routeAL = setupRouteAL(grade,classroom);
    }

    /**
     * 학생 이동 경로 반환
     * @param grade 학년
     * @param classroom 반
     * @return 학생 이동 경로
     */
    private ArrayList<Integer> setupRouteAL(int grade,int classroom){
        return switch (grade) {
            case 1 -> setupRouteGrade1(classroom);
            case 2 -> setupRouteGrade2(classroom);
            case 3 -> setupRouteGrade3(classroom);
            default -> null;
        };
    }

    private ArrayList<Integer> setupRouteGrade1(int classroom){
        ArrayList<Integer> routes = new ArrayList<>();
        switch (classroom){
            case 1:
                routes.add(100);//현재위치
                routes.add(105);//다음위치
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,2,15));
            case 2:
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,2,15));
        }

        return routes;
    }
    private ArrayList<Integer> setupRouteGrade2(int classroom){
        ArrayList<Integer> routes = new ArrayList<>();
        switch (classroom){
            case 1:
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,2,15));
            case 2:
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,2,15));
        }

        return routes;
    }
    private ArrayList<Integer> setupRouteGrade3(int classroom){
        ArrayList<Integer> routes = new ArrayList<>();
        switch (classroom){
            case 1:
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,2,15));
            case 2:
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,3,15));
                routes.add(new Route(0,2,15));
        }

        return routes;
    }
}
