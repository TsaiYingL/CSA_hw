import java.util.ArrayList;

public class Main {

    public static int rFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * rFactorial(n - 1);
    }

    public static int iFactorial(int n) {
        int num = 1;
        for (int i = 1; i < n + 1; i++) {
            num *= i;
        }
        return num;
    }

    public static void traverseString(String str, int index) {
        if (index >= str.length()) {
            return;
        }
        System.out.print(str.charAt(index) + " ");
        traverseString(str, index + 1);
    }

    public static void traverseArray(int[] arr, int index) {
        if (index >= arr.length) {
            return;
        }
        System.out.print(arr[index] + " ");
        traverseArray(arr, index + 1);
    }

    public static void traverseArrayList(ArrayList<Integer> list, int index) {
        if (index >= list.size()) {
            return;
        }
        System.out.print(list.get(index) + " ");
        traverseArrayList(list, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(rFactorial(4));
        System.out.println(iFactorial(4));

        String str = "Hello, world!";
        traverseString(str, 0);

        int[] arr = { 1, 2, 3, 4, 5 };
        traverseArray(arr, 0);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        traverseArrayList(list, 0);
    }
}