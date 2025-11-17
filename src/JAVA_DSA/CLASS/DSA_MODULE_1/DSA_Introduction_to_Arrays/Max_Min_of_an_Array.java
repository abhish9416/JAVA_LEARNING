package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

public class Max_Min_of_an_Array {
    public static int solve(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max,A[i]);
            min = Math.min(min,A[i]);
        }
        return max+min;
    }
    public static void main(String[] args){
        int[]A = {-2, 1, -4, 5, 3};
        System.out.println(solve(A));
    }
}
