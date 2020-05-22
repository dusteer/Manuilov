import java.util.ArrayList;

public class Course {
    private int id;
    private ArrayList<Lecturer> group = new ArrayList<Lecturer>();
    private Lecturer lecturer;
    private String name;
    private static int count = 0;

    public Course(String name) {
        this.id = ++count;
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
