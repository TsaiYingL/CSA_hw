public class Main {
    public static void main(String[] args) {
        int[][] ints = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        double[][] doubles = { { 1.5, 3.5 }, { 7.5, 9.5 } };
        boolean[][] bools = { { true, false, false, true }, { false, false, true, true } };
        String[][] strings = { { "a", "b", "c" }, { "d", "e", "f" } };
        Pencil[][] pencils = new Pencil[3][3];

        ints[0][2] = 30;
        doubles[0][0] = 1.5;
        bools[1][1] = true;
        strings[1][2] = "Hello";
        pencils[0][1] = new Pencil();

        for (int[] row : ints) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (double[] row : doubles) {
            for (double i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (boolean[] row : bools) {
            for (boolean i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (String[] row : strings) {
            for (String i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (Pencil[] row : pencils) {
            for (Pencil i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < ints.length; j++) {
            for (int i = 0; i < ints[j].length; i++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < doubles.length; j++) {
            for (int i = 0; i < doubles[j].length; i++) {
                System.out.print(doubles[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < bools.length; j++) {
            for (int i = 0; i < bools[j].length; i++) {
                System.out.print(bools[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < strings.length; j++) {
            for (int i = 0; i < strings[j].length; i++) {
                System.out.print(strings[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < pencils.length; j++) {
            for (int i = 0; i < pencils[j].length; i++) {
                System.out.print(pencils[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void columnMajor(Object[][] array) {
        int numRows = array.length;
        int numCols = array[0].length;

        for (int j = 0; j < numCols; j++) {
            for (int i = 0; i < numRows; i++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
