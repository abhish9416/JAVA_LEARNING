package CLASS.DSA_MODULE_1.Sorting_Basics;

import java.util.Arrays;

public class Nobel_Integer_Greater {
    public static int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        // 1 2 3 3
        for (int i = 0; i < n-1; i++) {
            if(A[i]!=A[i+1]&&A[i] ==(n-i-1)){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {3, 2, 1, 3};

    }

}
