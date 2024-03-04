import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(6);
        numbers.add(3);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        int j = 0;
        while (j < numbers.size()) {
            System.out.println(numbers.get(j));
            j++;
        }

        for (int num : numbers) {
            System.out.println(num);
        }

        removeInstances(numbers, 3);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void removeInstances(ArrayList<Integer> list, int target) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) == target) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }
}
