package level3;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> studentsList;

    public StudentService() {
        studentsList = new ArrayList<>();
    }

    public void start() {

        addStudent("Albert", 25, "JAVA", 10);
        addStudent("Maria", 35, "PHP", 8);
        addStudent("Joan", 18, "JAVA", 6);
        addStudent("Anna", 30, "PHP", 4);
        addStudent("Pol", 36, "JAVA", 7.5);
        addStudent("Laia", 16, "PHP", 5);
        addStudent("Abel", 20, "PHP", 4.5);
        addStudent("Berta", 17, "JAVA", 7);
        addStudent("Quim", 22, "JAVA", 3);
        addStudent("Aina", 24, "PHP", 8.5);

        studentsList.forEach(System.out::println);
    }

    private void addStudent(String name, int age, String course, double grade) {
        try {
            studentsList.add(new Student(name, age, course, grade));
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }
}
