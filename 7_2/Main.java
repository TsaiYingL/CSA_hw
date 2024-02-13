import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            System.out.println(ints.add(i));
        }
        System.out.println(ints + "\n" + ints.size());

        ints.add(5, 20);
        System.out.println(ints);

        System.out.println(ints.get(6));

        System.out.println(ints.set(6, 21) + "\n" + ints);

        System.out.println(ints.remove(5) + "\n" + ints);
    }
}