import java.util.ArrayList;

public class Lecture {
    private int id;
    private String name;
    private ArrayList<Lecture> lectures = new ArrayList<Lecture>();

    public Lecture(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void add(Lecture lecture) {
        lecture.add(lecture);
    }
}
