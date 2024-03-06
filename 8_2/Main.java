public class Main {
    public static void main(String[] args) {
        // element Num
        System.out.println(Methods.elementNum(
                new String[][] { { "Hello,", "world", "!" }, { "It's", "me", "Genevieve" } }, "e"));
        System.out.println(Methods.elementNum(new String[][] { { "a", "c" }, { "b", "d" } }, "e"));
        System.out.println(Methods.elementNum(new String[][] { { "e", "c" }, { "b", "e" } }, "e"));

        // haveInt
        System.out.println(Methods.haveInt(new int[][] { { 1, 2 }, { 3, 4 } }, 5));
        System.out.println(Methods.haveInt(new int[][] { { 1, 2 }, { 3, 4 } }, 4));
        System.out.println(Methods.haveInt(new int[][] { { 1 }, { 3 } }, 2));

        // findIndices
        int[] ints1 = Methods.findIndices(new int[][] { { 1, 2 }, { 3, 4 } }, 3);
        System.out.println(ints1[0] + " " + ints1[1]);
        ints1 = Methods.findIndices(new int[][] { { 1, 2 }, { 3, 4 } }, 4);
        System.out.println(ints1[0] + " " + ints1[1]);
        ints1 = Methods.findIndices(new int[][] { { 1 }, { 3 } }, 2);
        System.out.println(ints1[0] + " " + ints1[1]);

        // getDiagonal
        int[] ints2 = Methods.getDiagonal(new int[][] { { 1, 2 }, { 3, 4 } });
        addToArr(ints2);
        ints2 = Methods.getDiagonal(new int[][] { { 9, 2, 3 }, { 3, 4, 7 } });
        addToArr(ints2);
        ints2 = Methods.getDiagonal(new int[][] { { 1, 2, 3 }, { 3, 4, 5 }, { 8, 9, 10 } });
        addToArr(ints2);

        // colString
        System.out.println(Methods.colString(new String[][] { { "Hello,", "world", "!" },
                { "It's", "me", "Margaret" } }, 1));
        System.out.println(Methods.colString(new String[][] { { "a", "b" }, { "c", "d" } }, 0));
        System.out.println(Methods.colString(new String[][] { { "a", "b" }, { "c", "d" } }, 1));

        // findMax
        System.out.println(Methods.findMax(new int[][] { { 3, 2, 1 }, { 4, 5, 6 } }));
        System.out.println(Methods.findMax(new int[][] { { -33, 2, 1 }, { 4, 5, -66 } }));
        System.out.println(Methods.findMax(new int[][] { { -33, 2 }, { 4, 0 } }));

        // findMin
        System.out.println(Methods.findMin(new int[][] { { 3, 2, 1 }, { 4, 5, 6 } }));
        System.out.println(Methods.findMin(new int[][] { { -33, 2, 1 }, { 4, 5, -66 } }));
        System.out.println(Methods.findMin(new int[][] { { -33, 2 }, { 4, 0 } }));

        // minString
        System.out.println(
                Methods.minString(new String[][] { { "Hello,", "world", "!" }, { "It's", "me", "Margaret" } }));
        System.out.println(Methods.minString(new String[][] { { "a", "a" }, { "b", "" } }));
        System.out.println(Methods.minString(new String[][] { { "asa", "ab" }, { "b", "f" } }));

        // maxString
        System.out.println(
                Methods.maxString(new String[][] { { "Hello,", "world", "!" }, { "It's", "me", "Margaret" } }));
        System.out.println(Methods.maxString(new String[][] { { "a", "a" }, { "b", "" } }));
        System.out.println(Methods.maxString(new String[][] { { "asa", "ab" }, { "b", "f" } }));

        // masAbsDiff
        int[][] array1 = { { 2, 3, 4 }, { -1, -2, -3 } };
        int[][] array2 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] array3 = { { -1, 2, -3 }, { 4, -5, 6 } };
        System.out.println(Methods.maxAbsDiff(array1, array2));
        System.out.println(Methods.maxAbsDiff(array3, array2));
        System.out.println(Methods.maxAbsDiff(array1, array3));

        // average
        System.out.println(Methods.average(new double[][] { { 1.6, 3.2, 5.4 }, { 6.3, 4.1, 2.5 } }));
        System.out.println(Methods.average(new double[][] { { 1.5, 2.5, 3.5 }, { 6.3, 4.1, 2.5 } }));
        System.out.println(Methods.average(new double[][] { { 1.5, 2.5, 3.5 }, { 4.5, 5.5, 6.5 } }));

        // equalVal
        System.out.println(Methods.equalVal(new int[][] { { 1, 2 }, { 3, 2 } }));
        System.out.println(Methods.equalVal(new int[][] { { 1, 4 }, { 3, 2 } }));
        System.out.println(Methods.equalVal(new int[][] { { 1, 2, 3 }, { 3, 2, 5 } }));

        // lastWord
        System.out.println(Methods.lastWord(new String[][] { { "bravo", "charlie" }, { "zebra", "alpha" } }));
        System.out.println(Methods.lastWord(new String[][] { { "b", "d" }, { "v", "a" } }));
        System.out.println(Methods.lastWord(new String[][] { { "b" }, { "a" } }));
    }

    public static void addToArr(int[] ints) {
        for (int i : ints) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
