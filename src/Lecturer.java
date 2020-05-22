import java.util.ArrayList;

public class Lecturer {
    private int id;
    private String name;
    private ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();

    public Lecturer(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void add(Lecturer lecturer) {
        lecturer.add(lecturer);
    }
}
