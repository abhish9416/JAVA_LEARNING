package CLASS.DSA_MODULE_1.Two_Dimensionall_Array;

public class Add_the_matrices {
    public static int[][] solve(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = A[i][j]+B[i][j];
            }
        }
        return arr;
    }
}
