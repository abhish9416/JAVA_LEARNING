package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class Even_numbers_in_a_range {
    //bruteforce
    public static int[] bruteforce(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            int start = B[i][0];
            System.out.println(System.identityHashCode(start) + " " + i);
            int end = B[i][1];
            System.out.println(System.identityHashCode(end) + " " + i);
            int count = 0;
            System.out.println(System.identityHashCode(count) + " " + i);
            for (int j = start; j <= end; j++) {
                if (A[j] % 2 == 0) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }

    public static int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;

        //creating the prefix sum for the even elements
        int[] pf = new int[n];
        if (A[0] % 2 == 0) {
            pf[0] = 1;
        } else {
            pf[0] = 0;
        }
        for (int i = 1; i < n; i++) {
            if (A[i] % 2 == 0) {
                pf[i] = pf[i - 1] + 1;
            } else {
                pf[i] = pf[i - 1];
            }
        }
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            int start = B[i][0];
            int end = B[i][1];
            if(start ==0){
                arr[i] = pf[end];
            }else{
                arr[i] = pf[end] - pf[start-1];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] b = {{0, 2}, {2, 4}, {1, 4}};
        System.out.println(Arrays.toString(bruteforce(A, b)));
        System.out.println(Arrays.toString(solve(A, b)));
    }
}
