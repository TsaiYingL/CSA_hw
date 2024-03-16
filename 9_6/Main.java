public class Main {
    public static void main(String[] args) {
        Superclass s = new Subclass(2024);

        System.out.println(s.equals(new Subclass(2024)));
        System.out.println(s.toString());

        s.print();
    }
}