public class Class {
    private int studentNum;
    private String teacher;

    public Class(int studentNum, String teacher) {
        this.studentNum = studentNum;
        this.teacher = teacher;
    }

    public void attendence(int studentInClass) {
        if (studentNum == studentInClass) {
            System.out.println("all students are in class");
        } else {
            System.out.println("class is missing " + (studentNum - studentInClass) + "student(s)");
        }
    }

    public void teacherInClass(String person) {
        if (this.teacher.equals(person)) {
            System.out.println("the teacher is teaching rn");
        } else {
            System.out.println("the teahcer might be absent");
        }
    }
}