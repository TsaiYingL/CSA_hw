public class Main {
    public static void main(String[] args) {
        System.out.println("printInts:");
        Method.printInts(new int[] { 1, 2, 3 });
        Method.printInts(new int[] {});
        Method.printInts(new int[] { 1, 2, 3, 4, 5 });

        System.out.println("swap:");
        int[] array4 = { 1, 2, 3, 4 };
        Method.swap(array4, 1, 2);
        Method.printInts(array4);
        int[] array5 = { 3, 1, 2, 4, 5 };
        Method.swap(array5, 4, 1);
        Method.printInts(array5);
        int[] array6 = { 1, 2 };
        Method.swap(array6, 0, 1);
        Method.printInts(array6);

        System.out.println("max:");
        int[] array7 = { 3, 2, 1 };
        System.out.println(Method.max(array7));
        int[] array8 = { 1, 1, 5, 1, 1 };
        System.out.println(Method.max(array8));
        int[] array9 = { 0 };
        System.out.println(Method.max(array9));

        System.out.println("min:");
        System.out.println(Method.min(array7));
        System.out.println(Method.min(array8));
        System.out.println(Method.min(array9));

        System.out.println("minString:");
        String[] array10 = { "Hello,", "world", "!" };
        System.out.println(Method.minString(new String[] { "Hello,", "world", "!" }));
        String[] array11 = { "a", "aa", "aaa" };
        System.out.println(Method.minString(array11));
        String[] array12 = { "bb", "a", "cccccc" };
        System.out.println(Method.minString(array12));

        System.out.println("maxString:");
        System.out.println(Method.maxString(array10));
        System.out.println(Method.maxString(array11));
        System.out.println(Method.maxString(array12));

        System.out.println("absoluteDiff:");
        int[] array13 = { 2, 3, 4 };
        int[] array14 = { -1, -2, -3 };
        System.out.println(Method.absoluteDiff(array13, array14));
        int[] array15 = { -1, 3, -5, 7 };
        int[] array16 = { 2, -4, 6, -8 };
        System.out.println(Method.absoluteDiff(array15, array16));
        int[] array17 = { 1, 2, 3 };
        int[] array18 = { 4, 5, 6 };
        System.out.println(Method.absoluteDiff(array17, array18));

        System.out.println("mean:");
        System.out.println(Method.mean(new double[] { 2.0, 3.0, 4.0, 5.0 }));
        System.out.println(Method.mean(new double[] { -1, 3, -5, 7 }));
        System.out.println(Method.mean(new double[] { 0 }));

        System.out.println("reverseArray:");
        int[] array22 = { 1, 2, 3 };
        Method.reverseArray(array22);
        Method.printInts(array22);
        int[] array23 = { 2, -4, 6, -8 };
        Method.reverseArray(array23);
        Method.printInts(array23);
        int[] array24 = { 0 };
        Method.reverseArray(array24);
        Method.printInts(array24);

        System.out.println("consec:");
        System.out.println(Method.consec(new int[] { 1, 2, 3, 3, 4 }));
        System.out.println(Method.consec(new int[] { 2 }));
        System.out.println(Method.consec(new int[] { 1, 2, 3, 4, 5 }));

        System.out.println("firstNeg:");
        System.out.println(Method.firstNeg(new int[] { 1, 0, -1 }));
        System.out.println(Method.firstNeg(new int[] { 1, 2, 3, 4 }));
        System.out.println(Method.firstNeg(new int[] { 1, 2, -3, -4 }));

        System.out.println("hasTwo:");
        System.out.println(Method.hastwo(new int[] { 1, 2, 3, 2 }));
        System.out.println(Method.hastwo(new int[] { 1, 3, 2, 2 }));
        System.out.println(Method.hastwo(new int[] { 1, 2, 3, 4 }));

        System.out.println("maxStreak:");
        System.out.println(Method.maxStreak(new int[] { 1, 2, 1, 1, 1 }, 1));
        System.out.println(Method.maxStreak(new int[] { 1, 1, 1, 1, 1 }, 1));
        System.out.println(Method.maxStreak(new int[] { 1, 2, 1, 1, 1 }, 2));
        System.out.println(Method.maxStreak(new int[] { 1, 2, 1, 2, 1 }, 1));

        System.out.println("lastAlpha:");
        System.out.println(Method.lastAlpha(new String[] { "zebra", "alpha" }));
        System.out.println(Method.lastAlpha(new String[] { "banana", "banann" }));
        System.out.println(Method.lastAlpha(new String[] { "ban", "ana" }));

        System.out.println("sameNum");
        System.out.println(Method.sameNum(new int[] { 1, 2 }, new int[] { 3, 4 }));
        System.out.println(Method.sameNum(new int[] { 1, 1 }, new int[] { 3, 4 }));
        System.out.println(Method.sameNum(new int[] { 1, 2 }, new int[] { 2, 4 }));
    }
}
