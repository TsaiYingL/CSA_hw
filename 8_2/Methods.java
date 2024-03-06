public class Methods {
    public static int elementNum(String[][] strings, String str) {
        int count = 0;
        for (String[] row : strings) {
            for (String element : row) {
                if (element.contains(str)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean haveInt(int[][] ints, int num) {
        for (int[] row : ints) {
            for (int element : row) {
                if (element == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] findIndices(int[][] array, int searchInt) {
        int[] indices = { -1, -1 };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == searchInt) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }

        return indices;
    }

    public static int[] getDiagonal(int[][] array) {
        int[] ints = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ints[i] = array[i][i];
        }

        return ints;
    }

    public static String colString(String[][] array, int columnIndex) {
        StringBuilder concatenatedStrings = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                concatenatedStrings.append(" ");
            }
            concatenatedStrings.append(array[i][columnIndex]);
        }

        return concatenatedStrings.toString();
    }

    public static int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;

        for (int[] row : array) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }

        return max;
    }

    public static int findMin(int[][] array) {
        int min = Integer.MAX_VALUE; // Initialize min to the largest possible integer

        for (int[] row : array) {
            for (int element : row) {
                if (element < min) {
                    min = element;
                }
            }
        }

        return min;
    }

    public static String minString(String[][] array) {
        String shortestString = null; // Initialize shortestString to null

        for (String[] row : array) {
            for (String element : row) {
                if (shortestString == null || element.length() < shortestString.length()) {
                    shortestString = element;
                }
            }
        }

        return shortestString;
    }

    public static String maxString(String[][] array) {
        String longestString = null; // Initialize longestString to null

        for (String[] row : array) {
            for (String element : row) {
                if (longestString == null || element.length() > longestString.length()) {
                    longestString = element;
                }
            }
        }

        return longestString;
    }

    public static int maxAbsDiff(int[][] array1, int[][] array2) {
        int maxAbsDiff = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                int absDiff = Math.abs(array1[i][j] - array2[i][j]);
                if (absDiff > maxAbsDiff) {
                    maxAbsDiff = absDiff;
                }
            }
        }

        return maxAbsDiff;
    }

    public static double average(double[][] array) {
        double sum = 0.0;
        int count = 0;

        for (double[] row : array) {
            for (double element : row) {
                sum += element;
                count++;
            }
        }

        if (count == 0) {
            return 0.0; // Return 0 if the array is empty to avoid division by zero
        }

        return sum / count;
    }

    public static boolean equalVal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int currentValue = array[i][j];
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array[k].length; l++) {
                        if ((i != k || j != l) && array[k][l] == currentValue) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static String lastWord(String[][] array) {
        String lastWord = null;

        for (String[] row : array) {
            for (String word : row) {
                if (lastWord == null || word.compareTo(lastWord) > 0) {
                    lastWord = word;
                }
            }
        }

        return lastWord;
    }
}
