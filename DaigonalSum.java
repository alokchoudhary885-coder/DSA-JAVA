public class DaigonalSum {
    public static int diagonalsum(int[][] arg) {
        int sum = 0;
        for (int i = 0; i < arg.length; i++) {
            // Primary diagonal
            sum += arg[i][i];
            // Secondary diagonal
            if (i != arg.length - 1 - i) {  // Avoid double-counting middle element
                sum += arg[i][arg.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        System.out.println(diagonalsum(matrix));
    }
}