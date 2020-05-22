import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Lecturer> lecturers=new ArrayList<Lecturer>();

    public  Student(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void addLecture(Lecturer lecturer){
        lecturers.add(lecturer);
    }

    public ArrayList<Lecturer> getLectures() {
        return lecturers;
    }
}
