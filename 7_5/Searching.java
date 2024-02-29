import java.util.ArrayList;

public class Searching {
    public static int lessThanZero(ArrayList<Integer> ints) {
        int count = 0;
        for (int num : ints) {
            if (num < 0) {
                count += 1;
            }
        }
        return count;
    }

    public static boolean isSame(ArrayList<String> strings, String word) {
        for (String str : strings) {
            if (str.equals(word)) {
                return true;
            }
        }
        return false;
    }

    public static boolean inBoth(ArrayList<Integer> ints1, ArrayList<Integer> ints2) {
        for (int int1 : ints1) {
            for (int int2 : ints2) {
                if (int1 == int2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int indexOf(ArrayList<Integer> ints, int num) {
        int index = -1;
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) == num) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOf2(int[] ints, int num) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == num) {
                return i;
            }
        }
        return -1;
    }
}