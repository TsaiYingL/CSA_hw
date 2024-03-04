public class Main {
    public static int[] yearCalculator(int month) {
        return new int[] { month / 12, month % 12 };
    }

    public static void main(String[] args) {
        System.out.println(yearCalculator(120));
    }
}
