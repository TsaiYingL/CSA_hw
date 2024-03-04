import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // for removeDuplicate
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 3, 3, 3));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(3, 2, 1, 2, 1, 1));
        System.out.println(Methods.removeDuplicate(list1));
        System.out.println(Methods.removeDuplicate(list2));
        System.out.println(Methods.removeDuplicate(list3));

        // for removeNum
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3));
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 2, 2, 3, 3, 3));
        ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(3, 2, 1, 2, 1, 1));
        System.out.println(Methods.removeNum(list4, 2));
        System.out.println(Methods.removeNum(list5, 1));
        System.out.println(Methods.removeNum(list6, 4));

        // for addInAscending
        ArrayList<Integer> list7 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3));
        ArrayList<Integer> list8 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(Methods.addInAscending(list7, 4));
        System.out.println(Methods.addInAscending(list8, 3));
        System.out.println(Methods.addInAscending(list8, 0));

        // for isReverse
        ArrayList<Integer> list9 = new ArrayList<Integer>();
        list9.add(1);
        list9.add(2);
        list9.add(3);
        ArrayList<Integer> list10 = new ArrayList<Integer>();
        list10.add(3);
        list10.add(2);
        list10.add(1);
        ArrayList<Integer> list11 = new ArrayList<Integer>();
        list11.add(3);
        list11.add(3);
        list11.add(2);
        list11.add(2);
        list11.add(1);
        System.out.println(Methods.isReverse(list10, list9));
        System.out.println(Methods.isReverse(list11, list9));
        System.out.println(Methods.isReverse(list11, list10));

        // maxNum
        ArrayList<Integer> list12 = new ArrayList<Integer>();
        list12.add(3);
        list12.add(2);
        list12.add(1);
        ArrayList<Integer> list13 = new ArrayList<Integer>();
        list13.add(1);
        list13.add(8);
        list13.add(7);
        ArrayList<Integer> list14 = new ArrayList<Integer>();
        list14.add(3);
        System.out.println(Methods.maxNum(list12));
        System.out.println(Methods.maxNum(list13));
        System.out.println(Methods.maxNum(list14));

        // minNum
        System.out.println(Methods.minNum(list12));
        System.out.println(Methods.minNum(list13));
        System.out.println(Methods.minNum(list14));

        // maxString
        ArrayList<String> list15 = new ArrayList<String>();
        list15.add("Hello,");
        list15.add("world");
        list15.add("!");
        ArrayList<String> list16 = new ArrayList<String>();
        list16.add("a");
        ArrayList<String> list17 = new ArrayList<String>();
        list17.add("a");
        list17.add("b");
        list17.add("c");
        System.out.println(Methods.maxString(list15));
        System.out.println(Methods.maxString(list16));
        System.out.println(Methods.maxString(list17));

        // minString
        System.out.println(Methods.minString(list15));
        System.out.println(Methods.minString(list16));
        System.out.println(Methods.minString(list17));

        // maxAbsDiff
        ArrayList<Integer> list18 = new ArrayList<Integer>();
        list18.add(2);
        list18.add(3);
        list18.add(4);
        ArrayList<Integer> list19 = new ArrayList<Integer>();
        list19.add(-1);
        list19.add(-2);
        list19.add(-3);
        ArrayList<Integer> list20 = new ArrayList<Integer>();
        list20.add(-3);
        list20.add(5);
        list20.add(23);
        System.out.println(Methods.maxAbsDiff(list18, list19));
        System.out.println(Methods.maxAbsDiff(list19, list20));
        System.out.println(Methods.maxAbsDiff(list18, list20));

        // average
        ArrayList<Double> list21 = new ArrayList<Double>();
        list21.add(1.5);
        list21.add(3.5);
        list21.add(5.5);
        ArrayList<Double> list22 = new ArrayList<Double>();
        list22.add(20.3);
        list22.add(20.7);
        list22.add(20.3);
        ArrayList<Double> list23 = new ArrayList<Double>();
        list23.add(-3.0);
        list23.add(4.0);
        System.out.println(Methods.average(list21));
        System.out.println(Methods.average(list22));
        System.out.println(Methods.average(list23));

        // reverse
        System.out.println(Methods.reverse(list9));
        System.out.println(Methods.reverse(list10));
        System.out.println(Methods.reverse(list11));

        // isConsec
        ArrayList<Integer> list24 = new ArrayList<Integer>();
        list24.add(1);
        list24.add(2);
        list24.add(3);
        list24.add(3);
        list24.add(4);
        ArrayList<Integer> list25 = new ArrayList<Integer>();
        list25.add(1);
        list25.add(2);
        list25.add(3);
        ArrayList<Integer> list26 = new ArrayList<Integer>();
        list26.add(3);
        System.out.println(Methods.isConsec(list24));
        System.out.println(Methods.isConsec(list25));
        System.out.println(Methods.isConsec(list26));

        // indexNeg
        ArrayList<Integer> list27 = new ArrayList<Integer>();
        list27.add(1);
        list27.add(0);
        list27.add(-1);
        ArrayList<Integer> list28 = new ArrayList<Integer>();
        list28.add(-1);
        list28.add(0);
        list28.add(-2);
        ArrayList<Integer> list29 = new ArrayList<Integer>();
        list29.add(10);
        System.out.println(Methods.indexNeg(list27));
        System.out.println(Methods.indexNeg(list28));
        System.out.println(Methods.indexNeg(list29));

        // equalNum
        ArrayList<Integer> list30 = new ArrayList<Integer>();
        list30.add(1);
        list30.add(2);
        list30.add(3);
        list30.add(2);
        ArrayList<Integer> list31 = new ArrayList<Integer>();
        list31.add(1);
        list31.add(2);
        ArrayList<Integer> list32 = new ArrayList<Integer>();
        list32.add(3);
        list32.add(3);
        System.out.println(Methods.equalNum(list30));
        System.out.println(Methods.equalNum(list31));
        System.out.println(Methods.equalNum(list32));
    }

}