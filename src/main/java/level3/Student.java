package level3;

public class Student {

    private String name;
    private int age;
    private String course;
    private double grade;

    public Student(String name, int age, String course, double grade) {

        if (name == null || name.trim().isEmpty() || name.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Invalid name.");
        }

        if (age < 0) {
            throw new IllegalArgumentException("Invalid age.");
        }

        if (course == null || course.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid course.");
        }

        if (grade < 0 || grade > 10) {
            throw new IllegalArgumentException("Invalid grade.");
        }

        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ", course: " + course + ", grade: " + grade;
    }
}
