package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;

public class Sum_of_All_Subarrays {
    public static int bruteforcesolve(int[] A) {
        int n = A.length;
        int overallsum = 0;

        for (int s = 0; s < n; s++) {
            for (int e = s; e < n; e++) {
                int sum = 0;
                for (int k = s; k <= e; k++) {
                    sum += A[k];
                }
                overallsum += sum;
            }
        }
        return overallsum;
    }

    public static long solve(int[] A) {
        int n = A.length;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int start = i + 1;
            int end = n - i;
            long freq = (long) start * end;
            sum += A[i] * freq;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(bruteforcesolve(A));
    }
}
