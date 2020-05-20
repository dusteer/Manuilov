import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Lecture> lectures=new ArrayList<Lecture>();

    public  Student(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void addLecture(Lecture lecture){
        lecture.add(lecture);
    }

    public ArrayList<Lecture> getLectures() {
        return lectures;
    }
}
