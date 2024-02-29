import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // isLessThan
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(-1);
        ints.add(0);
        ints.add(1);
        ArrayList<Integer> ints2 = new ArrayList<Integer>();
        ints2.add(-1);
        ints2.add(0);
        ints2.add(-10);
        ArrayList<Integer> ints3 = new ArrayList<Integer>();
        ints3.add(11);
        ints3.add(10);
        ints3.add(10);
        System.out.println(Searching.lessThanZero(ints));
        System.out.println(Searching.lessThanZero(ints2));
        System.out.println(Searching.lessThanZero(ints3));

        // isSame
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("string");
        ArrayList<String> strings2 = new ArrayList<String>();
        strings2.add("a");
        strings2.add("b");
        strings2.add("a");
        System.out.println(Searching.isSame(strings, "string"));
        System.out.println(Searching.isSame(strings2, "a"));
        System.out.println(Searching.isSame(strings2, "c"));

        // inBoth
        ArrayList<Integer> ints4 = new ArrayList<Integer>();
        ints4.add(1);
        ints4.add(2);
        ArrayList<Integer> ints5 = new ArrayList<Integer>();
        ints5.add(2);
        ints5.add(3);
        ArrayList<Integer> ints6 = new ArrayList<Integer>();
        ints6.add(4);
        ints6.add(5);
        ints6.add(6);
        System.out.println(Searching.inBoth(ints4, ints5));
        System.out.println(Searching.inBoth(ints5, ints6));
        System.out.println(Searching.inBoth(ints4, ints));

        // indexOf
        ArrayList<Integer> ints7 = new ArrayList<Integer>();
        ints7.add(1);
        ints7.add(2);
        ints7.add(3);
        ArrayList<Integer> ints8 = new ArrayList<Integer>();
        ints8.add(0);
        ints8.add(10);
        ints8.add(20);
        ArrayList<Integer> ints9 = new ArrayList<Integer>();
        System.out.println(Searching.indexOf(ints7, 2));
        System.out.println(Searching.indexOf(ints8, 2));
        System.out.println(Searching.indexOf(ints9, 2));

        // indexOf2
        int[] arrayInt = { 1, 2, 3 };
        int[] arrayInt2 = { 4, 3, 25, 6, 6, 1 };
        System.out.println(Searching.indexOf2(arrayInt, 2));
        System.out.println(Searching.indexOf2(arrayInt2, 6));
        System.out.println(Searching.indexOf2(new int[] { 4, 0, 3, 1 }, 2));
    }
}