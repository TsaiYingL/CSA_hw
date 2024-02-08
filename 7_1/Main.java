import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        // ArrayList of Double
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(6.28);
        doubleList.add(9.42);

        // ArrayList of Boolean
        ArrayList<Boolean> boolList = new ArrayList<>();
        boolList.add(true);
        boolList.add(false);
        boolList.add(true);

        // ArrayList of String
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        // ArrayList of an original mutable reference type (Custom Object)
        ArrayList<Person> customList = new ArrayList<>();
        customList.add(new Person("a"));
        customList.add(new Person("b"));
        customList.add(new Person("c"));

        // Raw type of ArrayList
        ArrayList rawList = new ArrayList();
        rawList.add(100);
        rawList.add("Raw");
        rawList.add(true);
        rawList.add(3.14);

        // Displaying contents
        System.out.println("Integer List: " + intList);
        System.out.println("Double List: " + doubleList);
        System.out.println("Boolean List: " + boolList);
        System.out.println("String List: " + stringList);
        System.out.println("Custom Object List: " + customList);
        System.out.println("Raw List: " + rawList);
    }

}
