package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

public class Counting_Subarrays_Easy {
    public static int solve(int[] A, int B) {
        int n = A.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                long sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += A[k];
                }
                if (sum < B) count++;
            }
        }
        return count;
    }

    public static int solveA(int[] A, int B) {
        int n = A.length;
        int runsum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                //System.out.println(sum);
                if (sum < B) {
                    count++;
                }
            }

        }
        return count;
    }

    //prefix sum approach
    public static int prefix(int[] A, int B) {
        int n = A.length;
        int[] pf = new int[n];
        int count = 0;
        pf[0] = A[0];
        for (int i = 1; i < n; i++) {
            pf[i] = pf[i-1]+A[i];
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                if (i == 0) {
                    sum = pf[j];
                } else {
                    sum = pf[j] - pf[i - 1];
                }
                if (sum < B) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {2, 5, 6};
        int B = 10;
//        System.out.println(solve(A,B));
        System.out.println(solveA(A, B));
        System.out.println(prefix(A, B));
    }
}
