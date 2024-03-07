import java.util.ArrayList;

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

        // stringArrSort
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("zebra");
        arr1.add("alpha");
        Sort.stringArrSSort(arr1);
        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("beta");
        arr2.add("alpha");
        arr2.add("delta");
        Sort.stringArrSSort(arr2);
        ArrayList<String> arr3 = new ArrayList<String>();
        arr3.add("bob");
        arr3.add("b");
        arr3.add("bo");
        Sort.stringArrSSort(arr3);

        // stringArrISort
        Sort.stringArrISort(arr1);
        Sort.stringArrISort(arr2);
        Sort.stringArrISort(arr3);

        // intSSort
        ArrayList<Integer> ints1 = new ArrayList<Integer>();
        ints1.add(-1);
        ints1.add(0);
        ints1.add(1);
        Sort.intSSort(ints1);
        ArrayList<Integer> ints2 = new ArrayList<Integer>();
        ints2.add(-8);
        ints2.add(20);
        ints2.add(-25);
        Sort.intSSort(ints2);
        ArrayList<Integer> ints3 = new ArrayList<Integer>();
        ints3.add(1);
        ints3.add(2);
        ints3.add(3);
        Sort.intSSort(ints3);

        // intISort
        Sort.intISort(ints1);
        Sort.intISort(ints2);
        Sort.intISort(ints3);

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