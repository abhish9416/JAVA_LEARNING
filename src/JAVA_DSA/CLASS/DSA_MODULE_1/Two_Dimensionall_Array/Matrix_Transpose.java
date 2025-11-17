package CLASS.DSA_MODULE_1.Two_Dimensionall_Array;

public class Matrix_Transpose {
    public static int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] arr = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[j][i] = A[i][j];
            }
        }
        return arr;
    }
    public static void print(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print(solve(A));
    }
}
