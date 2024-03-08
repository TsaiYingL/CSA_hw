public class CSAClass {
    int classSize;

    public CSAClass() {
        classSize = 0;
    }

    public CSAClass(int size) {
        classSize = size;
    }

    public int getClassSize() {
        return classSize;
    }

    public int addStudent() {
        classSize += 1;
        System.out.println("there are " + classSize + " students in class");
        return classSize;
    }
}