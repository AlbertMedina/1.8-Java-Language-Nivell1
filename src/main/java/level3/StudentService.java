package level3;

import Utils.LambdasStreamsUtils;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private final List<Student> studentsList = new ArrayList<>();

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

        System.out.println("Students names and ages:");
        System.out.println(getStudentsNamesAndAges());

        System.out.println();

        System.out.println("Students whose name starts with 'A':");
        filterStudentsStartingWithLetter('A').forEach(System.out::println);

        System.out.println();

        System.out.println("Students with a grade of 5 or higher:");
        filterStudentsWithMinGrade(5).forEach(System.out::println);

        System.out.println();

        System.out.println("PHP students with a grade of 5 or higher:");
        filterStudentsWithMinGradeByCourse(5, "PHP").forEach(System.out::println);

        System.out.println();

        System.out.println("JAVA students with aged 18 or older:");
        filterStudentsWithMinAgeByCourse(18, "JAVA").forEach(System.out::println);
    }

    private void addStudent(String name, int age, String course, double grade) {
        try {
            studentsList.add(new Student(name, age, course, grade));
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    private String getStudentsNamesAndAges() {
        StringBuilder sb = new StringBuilder();
        studentsList.forEach(s -> sb.append("Name: ").append(s.getName()).append(", age: ").append(s.getAge()).append("\n"));
        return sb.toString();
    }

    private List<Student> filterStudentsStartingWithLetter(char letter) {
        return studentsList.stream().filter(s -> Character.toLowerCase(s.getName().charAt(0)) == Character.toLowerCase(letter)).toList();
    }

    private List<Student> filterStudentsWithMinGrade(double grade) {
        return studentsList.stream().filter(s -> s.getGrade() >= grade).toList();
    }

    private List<Student> filterStudentsWithMinGradeByCourse(double grade, String course) {
        return studentsList.stream().filter(s -> s.getGrade() >= grade && s.getCourse().equalsIgnoreCase(course)).toList();
    }

    private List<Student> filterStudentsWithMinAgeByCourse(int age, String course) {
        return studentsList.stream().filter(s -> s.getAge() >= age && s.getCourse().equalsIgnoreCase(course)).toList();
    }
}
