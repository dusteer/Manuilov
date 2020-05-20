import java.util.ArrayList;

public class Course {
    private int id;
    private ArrayList<Lecture> group = new ArrayList<Lecture>();
    private Lecture lecture;
    private String name;

    public String getName(){
        return name;
    }
}
