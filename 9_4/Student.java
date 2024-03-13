public class Student extends Class {
    private String name;

    public Student(String name, int classNum) {
        super(classNum);
        this.name = name;
    }

    public void printInfo() {
        System.out.println(name + " has " + super.getclassNum() + " class(es).");
        if (super.getclassNum() > 8) {
            System.out.println(name + " is tired.");
        }
    }

    public void addStudentClass() {
        super.addClass();
    }
}
