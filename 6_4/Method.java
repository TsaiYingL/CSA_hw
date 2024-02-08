public class Method {
    public static void printInts(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] ints, int index1, int index2) {
        int index = ints[index1];
        ints[index1] = ints[index2];
        ints[index2] = index;
    }

    public static int max(int[] ints) {
        int maxInt = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > maxInt) {
                maxInt = ints[i];
            }
        }
        return maxInt;
    }

    public static int min(int[] ints) {
        int minInt = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < minInt) {
                minInt = ints[i];
            }
        }
        return minInt;
    }

    public static String minString(String[] strings) {
        String minString = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() < minString.length()) {
                minString = strings[i];
            }
        }
        return minString;
    }

    public static String maxString(String[] strings) {
        String maxString = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() > maxString.length()) {
                maxString = strings[i];
            }
        }
        return maxString;
    }

    public static int absoluteDiff(int[] ints1, int[] ints2) {
        int int1;
        int int2;

        if (max(ints1) > max(ints2)) {
            int1 = max(ints1);
        } else {
            int1 = max(ints2);
        }

        if (min(ints1) < min(ints2)) {
            int2 = min(ints1);
        } else {
            int2 = min(ints2);
        }

        return Math.abs(int1 - int2);
    }

    public static double mean(double[] doubles) {
        double sum = 0;
        for (double i : doubles) {
            sum += i;
        }
        return sum / doubles.length;
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static boolean consec(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] == ints[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static int firstNeg(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static boolean hastwo(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] == ints[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int maxStreak(int[] ints, int num) {
        int streak = 0;
        int maxStreak = 0;
        for (int i : ints) {
            if (i == num) {
                streak++;
            } else {
                streak = 0;
            }
            if (maxStreak < streak) {
                maxStreak = streak;
            }
        }
        return maxStreak;
    }

    public static String lastAlpha(String[] words) {
        if (words == null || words.length == 0) {
            return null;
        }

        String lastWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].compareTo(lastWord) > 0) {
                lastWord = words[i];
            }
        }
        return lastWord;
    }

    public static boolean sameNum(int[] ints1, int[] ints2) {
        for (int i : ints1) {
            for (int j : ints2) {
                if (i == j) {
                    return true;
                }
            }
        }
        return false;
    }
}
