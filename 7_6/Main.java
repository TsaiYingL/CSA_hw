public class Main {
    public static void main(String[] args) {
        // stringSSort
        Sort.stringSSort(new String[] { "zebra", "alpha" });
        Sort.stringSSort(new String[] { "c", "b", "a", "b" });
        Sort.stringSSort(new String[] { "CSA", "CalcBC", "CalcAB" });

        // stringISort
        Sort.stringISort(new String[] { "zebra", "alpha" });
        Sort.stringISort(new String[] { "c", "b", "a", "b" });
        Sort.stringISort(new String[] { "CSA", "CalcBC", "CalcAB" });

        /*
         * System.out.println("Selection Sort");
         * int[] arr = Sort.random(5);
         * Sort.print(arr);
         * Sort.selectionSort(arr);
         * System.out.println("Insertion Sort");
         * arr = Sort.random(5);
         * Sort.print(arr);
         * Sort.insertionSort(arr);
         */
    }
}