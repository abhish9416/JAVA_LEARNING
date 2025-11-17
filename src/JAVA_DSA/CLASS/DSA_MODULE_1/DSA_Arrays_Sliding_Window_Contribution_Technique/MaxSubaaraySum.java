package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;

public class MaxSubaaraySum {
    public static int brutesolve(int[] A, int B, int C) {
        int n = A.length;
        int start = 0;
        int end = B - 1;
        int ans = Integer.MIN_VALUE;
        while (end < n) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += A[i];
            }
            ans = Math.max(ans, sum);
            start++;
            end++;
        }
        return ans;
    }

    public static int solve(int[] A, int B, int C) {
        int n = A.length;
        int sum = 0;

        //calculating the first window sum
        for (int i = 0; i <= B-1; i++) {
            sum+=A[i];
        }
        int ans = sum;
        int start = 1;
        int end = B;
        while (end < n){
            sum = sum - A[start-1] + A[end];
            ans = Math.max(ans,sum);
            start++;
            end++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {4, 3, 2, 6, 1};
        System.out.println(brutesolve(A, 3, 11));
        System.out.println(solve(A,3,11));
    }
}
