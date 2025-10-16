package level3;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private final List<Student> students;

    public StudentRepository() {
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void addStudent(Student student) {
        if (student == null) {
            throw new NullPointerException("Cannot add a null Student.");
        }
        students.add(student);
    }
}
