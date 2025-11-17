package CLASS.DSA_MODULE_1.Two_Dimensionall_Array;

import java.util.Arrays;

public class Rotate_matrix {
    public static void reverse(int[]A,int i,int j){
        while (i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;j--;
        }
    }

    public static void solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            reverse(A[i],0,m-1);
        }
        print(A);
    }

    public static void print(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int m = A[i].length;
            System.out.print("[");
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.print("]");
        }
    }
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][]B = {{1,2},
                    {3,4}};
        solve(B);
    }
}
