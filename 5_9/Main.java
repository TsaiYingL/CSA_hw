public class Main {
    public static void main(String[] args) {
        // creating the csa class
        Class csa = new Class(30, "Mr. Holmer");

        // testing the if false cases
        csa.attendence(15);
        csa.teacherInClass("Mr. Shuman");

        // testing the if true cases
        csa.attendence(30);
        csa.teacherInClass("Mr. Holmer");
    }
}
