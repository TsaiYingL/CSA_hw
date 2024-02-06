public class Main {
    public static void main(String[] args) {
        int[] ints = { 1, 2, 3, 4, 5 };
        for (int i : ints) {
            System.out.print(i + " ");
        }
        System.out.println("");

        String[] strings = { "a", "b", "c", "d", "e" };
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println("");

        Person[] people = { new Person("aaa"), new Person("bbb"), new Person("ccc") };
        int index = 0;
        while (index < people.length) {
            System.out.print(people[index] + " ");
            index++;
        }
        System.out.println("");

        for (int i : ints) {
            i += 1;
        }
        System.out.println(ints[0]);
    }
}