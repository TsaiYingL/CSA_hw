public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.addStudent();
        System.out.println(student.getClassSize());
        student.addStudent();
        System.out.println(student.getClassSize());
    }
}