import java.util.ArrayList;

public class Methods {
    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public static ArrayList<Integer> removeNum(ArrayList<Integer> list, int num) {
        list.removeIf(n -> n == num);
        return list;
    }

    public static ArrayList<Integer> addInAscending(ArrayList<Integer> list, int num) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= num) {
                list.add(i, num);
                return list;
            }
        }
        list.add(num);
        return list;
    }

    public static boolean isReverse(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(list2.size() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static int maxNum(ArrayList<Integer> nums) {
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max;
    }

    public static int minNum(ArrayList<Integer> nums) {
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return min;
    }

    public static String maxString(ArrayList<String> words) {
        String max = words.get(0);
        for (int i = 1; i < words.size(); i++) {
            if (words.get(i).length() > max.length()) {
                max = words.get(i);
            }
        }
        return max;
    }

    public static String minString(ArrayList<String> words) {
        String min = words.get(0);
        for (int i = 1; i < words.size(); i++) {
            if (words.get(i).length() < min.length()) {
                min = words.get(i);
            }
        }
        return min;
    }

    public static int maxAbsDiff(ArrayList<Integer> ints1, ArrayList<Integer> ints2) {
        int maxDiff = Integer.MIN_VALUE;
        for (int i : ints1) {
            for (int j : ints2) {
                int absDiff = Math.abs(i - j);
                if (absDiff > maxDiff) {
                    maxDiff = absDiff;
                }
            }
        }
        return maxDiff;
    }

    public static double average(ArrayList<Double> doubles) {
        double sum = 0;
        for (double d : doubles) {
            sum += d;
        }
        return sum / doubles.size();
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> ints) {
        ArrayList<Integer> revInt = new ArrayList<Integer>();
        for (int i = ints.size() - 1; i >= 0; i--) {
            revInt.add(ints.get(i));
        }
        return revInt;
    }

    public static boolean isConsec(ArrayList<Integer> ints) {
        for (int i = 1; i < ints.size(); i++) {
            if (ints.get(i) == ints.get(i - 1)) {
                return true;
            }
        }
        return false;
    }

    public static int indexNeg(ArrayList<Integer> ints) {
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) < 0) {
                return i;
            }
        }
        return -1;
    }

    public static boolean equalNum(ArrayList<Integer> ints) {
        for (int i = 0; i < ints.size(); i++) {
            for (int j = i + 1; j < ints.size(); j++) {
                if (ints.get(i) == ints.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}