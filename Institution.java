import java.util.ArrayList;

public class Institution {
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Lecture> lectures = new ArrayList<Lecture>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    public void addSubject(Course course){
        courses.add(course);
    }
    public void removeSubject(int count) {
        courses.remove(count);
    }
    public void addLecture(Lecture lecture){
        lectures.add(lecture);
    }
    public void removeLecture(int count){
        lectures.remove(count);
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(int count){
        students.remove(count);
    }
}
