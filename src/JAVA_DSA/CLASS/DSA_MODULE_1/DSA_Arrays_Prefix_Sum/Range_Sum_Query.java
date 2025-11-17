package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class Range_Sum_Query {
    public static long[] solve(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        long[] pf = new long[n];
        //creating the prefix sum of the array
        pf[0] = A[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + A[i];
        }
        long[] arr = new long[m];
        for (int i = 0; i < m; i++) {
            int start = B[i][0];
            int end = B[i][1];
            if(start==0){
                arr[i] = pf[end];
            }else{
                arr[i] = pf[end] - pf[start-1];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[][] b = {{0, 3}, {1, 2}};
        int[] c = {2, 2, 2};
        int[][] d = {{0, 0}, {1, 2}};
        System.out.println(Arrays.toString(solve(c, d)));
    }
}
