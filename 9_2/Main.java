public class Main {
    public static void main(String[] args) {
        Subclass obj1 = new Subclass();
        System.out.println("Inherited superVariable: " + obj1.getSuperVariable());
        System.out.println("Subclass subVariable: " + obj1.getSubVariable());
        System.out.println();

        Subclass obj2 = new Subclass(5, 10);
        System.out.println("Inherited superVariable: " + obj2.getSuperVariable());
        System.out.println("Subclass subVariable: " + obj2.getSubVariable());
        System.out.println();

        Subclass obj3 = new Subclass(15);
        System.out.println("Inherited superVariable: " + obj3.getSuperVariable());
        System.out.println("Subclass subVariable: " + obj3.getSubVariable());
    }
}