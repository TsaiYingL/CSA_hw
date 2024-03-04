/**
 * This class is a demonstration of selection sort and insertion sort
 * for AP Computer Science A.
 * 
 * @author Mr Holmer
 */
public class Sort {

    /**
     * Prints an array.
     * 
     * @param arr the array to be printed
     */
    public static void print(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++)
            str += arr[i] + ", ";
        str += arr[arr.length - 1] + "]";
        System.out.println(str);
    }

    public static void print(String[] strings) {
        String str = "[";
        for (int i = 0; i < strings.length - 1; i++)
            str += strings[i] + ", ";
        str += strings[strings.length - 1] + "]";
        System.out.println(str);
    }

    /**
     * Returns an int array of one or two digit numbers
     * 
     * @param length the length of the array
     * @return an int array of specified length
     */
    public static int[] random(int length) {
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = (int) (Math.random() * 100);
        }
        return ints;
    }

    /**
     * Returns the index of the minimum value in an int array
     * beginning at a specified index
     * 
     * @param index the starting index to search
     * @param arr   the array to search
     * @return the index of the minimum value
     */
    public static int findMinIndex(int index, int[] arr) {
        int minUpdate = 0;
        int min = arr[index];
        for (int i = index; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
                minUpdate++;
            }
        }
        System.out.println("Minimum Updates: " + minUpdate);
        return index;
    }

    /**
     * Returns the index of the minimum value in an int array
     * beginning at a specified index
     * 
     * @param index   the starting index to search
     * @param strings the array to search
     * @return the index of the word that comes first alphabetically
     */
    public static int findMaxString(int index, String[] strings) {
        if (index > strings.length - 1) {
            return index;
        }
        String max = strings[index];
        for (int i = index + 1; i < strings.length; i++) {
            if (max.compareTo(strings[i]) > 0) {
                max = strings[i];
                index = i;
            }
        }
        return index;
    }

    /**
     * Swaps the elements of two indices of an array
     * 
     * @param arr the array in which to swap
     * @param i   the index of the first element
     * @param j   the index of the second element
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Sorts an int array in ascending order with selection sort
     * 
     * @param arr the int array to be sorted
     */
    public static void selectionSort(int[] arr) {
        int swaps = 0;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = findMinIndex(i, arr);
            if (minIndex != i) {
                swap(arr, i, minIndex);
                swaps++;
            }
            print(arr);
        }
        System.out.println("Swaps: " + swaps);
    }

    public static void insertionSort(int[] arr) {
        int swaps = 0;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int index = i;
            while (index > 0 && temp < arr[index - 1]) {
                swap(arr, index, index - 1);
                swaps++;
                index--;
            }
            print(arr);
        }
        System.out.println("Swaps: " + swaps);
    }

    /**
     * Swaps the elements of two indices of an array
     * 
     * @param word1 the first string
     * @param word2 the second string
     * @return -1 if same string; 0 if word1 comes before word2; 1 if word1 comes
     *         after word2
     */
    public static int compareString(String word1, String word2) {
        char[] chars = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        int length = chars.length;
        if (chars.length > chars2.length) {
            length = chars2.length;
        }

        for (int i = 0; i < length; i++) {
            char lowerC = Character.toLowerCase(chars[i]);
            char lowerC2 = Character.toLowerCase(chars2[i]);
            System.out.println((int) lowerC + " " + (int) lowerC2);
            if ((int) lowerC > (int) lowerC2) {
                return 1;
            } else if ((int) lowerC < (int) lowerC2) {
                return 0;
            }
        }
        return -1;
    }

    public static void stringSSort(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            int maxWord = findMaxString(i, strings);
            if (maxWord != i) {
                swap(strings, i, maxWord);
            }
        }
        print(strings);
    }

    public static void stringISort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String temp = arr[i];
            int index = i;
            while (index > 0 && temp.compareTo(arr[index - 1]) < 0) {
                swap(arr, index, index - 1);
                index--;
            }
        }
        print(arr);
    }

    
}