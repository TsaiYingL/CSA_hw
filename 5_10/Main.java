import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5 };
        System.out.println("Original intArray: " + Arrays.toString(intArray));
        intArray[2] = 10;
        System.out.println("Modified intArray: " + Arrays.toString(intArray));

        String[] listFruit = { "apple", "banana", "orange", "grape", "kiwi" };
        System.out.println("Original stringArray: " + Arrays.toString(listFruit));
        listFruit[3] = "melon";
        System.out.println("Modified stringArray: " + Arrays.toString(listFruit));
    }
}