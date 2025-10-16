package level3;

public class Main {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        studentService.start();

        studentService.addStudent("Albert", 25, "JAVA", 10);
        studentService.addStudent("Maria", 35, "PHP", 8);
        studentService.addStudent("Joan", 18, "JAVA", 6);
        studentService.addStudent("Anna", 30, "PHP", 4);
        studentService.addStudent("Pol", 36, "JAVA", 7.5);
        studentService.addStudent("Laia", 16, "PHP", 5);
        studentService.addStudent("Abel", 20, "PHP", 4.5);
        studentService.addStudent("Berta", 17, "JAVA", 7);
        studentService.addStudent("Quim", 22, "JAVA", 3);
        studentService.addStudent("Aina", 24, "PHP", 8.5);

        System.out.println("Students names and ages:");
        System.out.println(studentService.getStudentsNamesAndAges());

        System.out.println();

        System.out.println("Students whose name starts with 'A':");
        studentService.filterStudentsStartingWithLetter('A').forEach(System.out::println);

        System.out.println();

        System.out.println("Students with a grade of 5 or higher:");
        studentService.filterStudentsWithMinGrade(5).forEach(System.out::println);

        System.out.println();

        System.out.println("PHP students with a grade of 5 or higher:");
        studentService.filterStudentsWithMinGradeByCourse(5, "PHP").forEach(System.out::println);

        System.out.println();

        System.out.println("JAVA students aged 18 or older:");
        studentService.filterStudentsWithMinAgeByCourse(18, "JAVA").forEach(System.out::println);
    }
}
