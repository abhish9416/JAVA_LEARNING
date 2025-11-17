package CLASS.DSA_MODULE_1.Two_Dimensionall_Array;

public class Minor_Diagonal_Sum {
    public static int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int i = 0;
        int j = m - 1;
        int sum = 0;
        while (i < n && j >= 0) {
            sum+=A[i][j];
            i++;j--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] A = {{1, -2, -3}, {-4, 5, -6}, {-7, -8, 9}};
    }
}
