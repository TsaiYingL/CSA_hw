public class Main {
    public static int[] randomArray(int size, int min, int max) {
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = (int) (Math.random() * (max - min + 1)) + min;
        }

        return result;
    }

    public static int RBinarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // Not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid; // Found
        } else if (arr[mid] < target) {
            return RBinarySearch(arr, target, mid + 1, high); // Search right half
        } else {
            return RBinarySearch(arr, target, low, mid - 1); // Search left half
        }
    }

    public static int IBinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Found
            } else if (arr[mid] < target) {
                low = mid + 1; // Search right half
            } else {
                high = mid - 1; // Search left half
            }
        }
        return -1; // Not found
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid); // Sort left half
            mergeSort(arr, mid + 1, high); // Sort right half
            merge(arr, low, mid, high); // Merge sorted halves
        }
    }

    public static void main(String[] args) {
        int size = 10;
        int min = 0;
        int max = 100;
        int[] randomArray = randomArray(size, min, max);

        // Sort the array
        mergeSort(randomArray, 0, randomArray.length - 1);

        // Test binary search
        int target = randomArray[(int) (Math.random() * size)]; // Random target from the array
        int indexRecursive = RBinarySearch(randomArray, target, 0, randomArray.length - 1);
        int indexIterative = IBinarySearch(randomArray, target);

        System.out.println("Generated Random Array:");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Target: " + target);
        System.out.println("Index found (recursive): " + indexRecursive);
        System.out.println("Index found (iterative): " + indexIterative);
    }

}