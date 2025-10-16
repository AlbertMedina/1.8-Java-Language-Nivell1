package level3;

import java.util.List;
import java.util.stream.Collectors;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(String name, int age, String course, double grade) {
        try {
            studentRepository.addStudent(new Student(name, age, course, grade));
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    public String getStudentsNamesAndAges() {
        return studentRepository.getStudents().stream().map(s -> "Name: " + s.getName() + ", age: " + s.getAge()).collect(Collectors.joining("\n"));
    }

    public List<Student> filterStudentsStartingWithLetter(char letter) {
        return studentRepository.getStudents().stream().filter(s -> Character.toLowerCase(s.getName().charAt(0)) == Character.toLowerCase(letter)).toList();
    }

    public List<Student> filterStudentsWithMinGrade(double grade) {
        return studentRepository.getStudents().stream().filter(s -> s.getGrade() >= grade).toList();
    }

    public List<Student> filterStudentsWithMinGradeByCourse(double grade, String course) {
        return studentRepository.getStudents().stream().filter(s -> s.getGrade() >= grade && s.getCourse().equalsIgnoreCase(course)).toList();
    }

    public List<Student> filterStudentsWithMinAgeByCourse(int age, String course) {
        return studentRepository.getStudents().stream().filter(s -> s.getAge() >= age && s.getCourse().equalsIgnoreCase(course)).toList();
    }
}
