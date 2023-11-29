public class Main {
    public static void main(String[] args)
    {
        //testing digitCounter
        System.out.println("digitCounter test:");
        System.out.println("100: " + Algorithm.digitCounter(100));
        System.out.println("123456789: " + Algorithm.digitCounter(123456789));

        //testing divisible
         System.out.println("\ndivisible test:");
         System.out.println("9, 3: " + Algorithm.divisible(9, 3));
         System.out.println("11, 7: " + Algorithm.divisible(11, 7));

        //testing oddSum
        System.out.println("\noddSum test:");
        System.out.println("4, 9: " + Algorithm.oddSum(4, 9));
        System.out.println("1, 5: " + Algorithm.oddSum(1, 5));

        //testing multipleOfTen
        System.out.println("\nmultipleOfTen test:");
        System.out.println("10, 99: " + Algorithm.multipleOfTen(10, 99));
        System.out.println("1, 10: " + Algorithm.multipleOfTen(1, 10));

        //testing digitSum
        System.out.println("\ndigitSum test:");
        System.out.println("321: " + Algorithm.digitSum(321));
        System.out.println("3247: " + Algorithm.digitSum(3247));

        //testing powerTwo
        System.out.println("\npowerTwo test:");
        System.out.println("800: " + Algorithm.powerTwo(800));
        System.out.println("2: " + Algorithm.powerTwo(2));
    }
}
