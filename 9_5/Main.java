import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Superclass superClassRef = new Subclass();

        superClassRef.print();

        Superclass[] array = new Superclass[2];
        array[0] = new Subclass();
        array[1] = new Superclass();

        ArrayList<Superclass> supers = new ArrayList<Superclass>();
        supers.add(superClassRef);
    }
}