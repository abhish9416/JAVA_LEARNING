package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

public class Closest_MinMax {
    public static int bruteforce(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int length = Integer.MAX_VALUE;
        //finding the Max and Min
        for (int i = 0; i < n; i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                boolean hasmin = false;
                boolean hasmax = false;
                for (int k = i; k <= j; k++) {
                    if (A[k] == min) {
                        hasmin = true;
                    }
                    if (A[k] == max) {
                        hasmax = true;
                    }
                    if (hasmax && hasmin) {
                        length = Math.min(length, Math.abs(j - i + 1));
                    }
                }
            }
        }
        return length;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Integer.max(max, A[i]);
            min = Integer.min(min, A[i]);
        }
        int minIndex = -1;
        int maxIndex = -1;
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (A[i] == min) {
                minIndex = i;
                if (maxIndex != -1) {
                    length = Math.min(length, minIndex - maxIndex + 1);
                }
            }
            if (A[i] == max) {
                maxIndex = i;
                if (minIndex != -1) {
                    length = Math.min(length, maxIndex - minIndex + 1);
                }
            }
        }
        return length;
    }

    public static int solve1(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Integer.max(max, A[i]);
            min = Integer.min(min, A[i]);
        }
        int minIndex = -1;
        int maxIndex = -1;
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(A[i]==min){
                minIndex = i;
            }
            if(A[i]==max){
                maxIndex = i;
            }
            if(maxIndex!=-1&&minIndex!=-1){
                length = Math.min(length,Math.abs(maxIndex-minIndex)+1);
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] A = {2, 6, 1, 6, 9};
        System.out.println(bruteforce(A));
        System.out.println(solve(A));
        System.out.println(solve1(A));

    }
}
