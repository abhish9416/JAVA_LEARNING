package CLASS.DSA_MODULE_1.Two_Dimensionall_Array;

import java.util.Arrays;

public class Row_Sum {
    public static int[] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum+=A[i][j];
            }
            arr[i] = sum;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 2, 3, 4}};
        System.out.println(Arrays.toString(solve(A)));
    }
}
