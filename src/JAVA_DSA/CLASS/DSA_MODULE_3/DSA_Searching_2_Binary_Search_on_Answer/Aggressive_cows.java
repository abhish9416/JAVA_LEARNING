package CLASS.DSA_MODULE_3.DSA_Searching_2_Binary_Search_on_Answer;

import java.util.Arrays;

public class Aggressive_cows {
    public static boolean ispossible(int[] A, int mid, int k) {
        int n = A.length;
        int last = A[0];
        int cow = 1;
        for (int i = 1; i < n; i++) {
            int diff = A[i] - last;
            if (diff >= mid) {
                last = A[i];
                cow++;
            }
        }
        if (cow >= k) {
            return true;
        } else {
            return false;
        }
    }

    public static int solve(int[] A, int B) {
        Arrays.sort(A);
        int n = A.length;
        // Getting the minimum for the start point of the binary Search
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int num = A[i + 1] - A[i];
            min = Math.min(min, num);
        }
        // Getting the maximum for the last for the binary Search
        int max = A[n - 1] - A[0];
//        System.out.println(min + " " + max);

        int start = min;
        int end = max;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (ispossible(A, mid, B)) {
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B = 3;
        int[] c = {5,17,100,11};
        int D = 2;
        System.out.println(solve(c,D));
    }
}
