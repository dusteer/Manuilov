import java.util.ArrayList;

public class Institution {
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    public void addSubject(Course course){
        courses.add(course);
    }
    public void removeSubject(int count) {
        courses.remove(count);
    }
    public void addLecturer(Lecturer lecturer){
        lecturers.add(lecturer);
    }
    public void removeLecturer(int count){
        lecturers.remove(count);
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(int count){
        students.remove(count);
    }
}
