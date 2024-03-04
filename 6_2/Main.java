public class Main {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5 };

        String[] stringArray = { "a", "b", "c", "d" };

        // Traverse and print elements of the int array
        System.out.println("Elements of intArray:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // Traverse and print elements of the string array
        System.out.println("\nElements of stringArray:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}