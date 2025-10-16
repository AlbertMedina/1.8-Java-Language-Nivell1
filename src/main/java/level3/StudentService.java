package level3;

import Utils.LambdasStreamsUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {

    private final List<Student> studentsList = new ArrayList<>();

    public void addStudent(String name, int age, String course, double grade) {
        try {
            studentsList.add(new Student(name, age, course, grade));
        } catch (IllegalArgumentException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    public String getStudentsNamesAndAges() {
        return studentsList.stream().map(s -> "Name: " + s.getName() + ", age: " + s.getAge()).collect(Collectors.joining("\n"));
    }

    public List<Student> filterStudentsStartingWithLetter(char letter) {
        return studentsList.stream().filter(s -> Character.toLowerCase(s.getName().charAt(0)) == Character.toLowerCase(letter)).toList();
    }

    public List<Student> filterStudentsWithMinGrade(double grade) {
        return studentsList.stream().filter(s -> s.getGrade() >= grade).toList();
    }

    public List<Student> filterStudentsWithMinGradeByCourse(double grade, String course) {
        return studentsList.stream().filter(s -> s.getGrade() >= grade && s.getCourse().equalsIgnoreCase(course)).toList();
    }

    public List<Student> filterStudentsWithMinAgeByCourse(int age, String course) {
        return studentsList.stream().filter(s -> s.getAge() >= age && s.getCourse().equalsIgnoreCase(course)).toList();
    }
}
