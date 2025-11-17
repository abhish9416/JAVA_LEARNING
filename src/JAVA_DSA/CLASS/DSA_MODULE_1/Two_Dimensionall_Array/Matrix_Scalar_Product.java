package CLASS.DSA_MODULE_1.Two_Dimensionall_Array;

public class Matrix_Scalar_Product {
    public static int[][] solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = A[i][j]*2;
            }
        }
        return A;
    }
}
