package CLASS.DSA_MODULE_3.DSA_Searching_2_Binary_Search_on_Answer;

public class Painters_Partition_Problem {
    public static boolean ispossible(int[] A, int mid, int k) {
        int n = A.length;
        int need = 1;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total+=A[i];
            if(total > mid){
                need++;
                total = A[i];
            }
        }
        if(need<=k){
            return true;
        }else{
            return false;
        }
    }

    public static int solve(int A, int B, int[] C) {
        int n = C.length;
        int max = Integer.MIN_VALUE;
        //finding the max of the array
        for (int i = 0; i < n; i++) {
            max = Math.max(max, C[i]);
        }
        //finding the sum of the Array
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += C[i];
        }
        int start = max;
        int end = sum;
        long ans = 0;
        int mod = 10000003;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(ispossible(C,mid,A)){
                ans = (1L *mid * B)%mod;
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        int A = 2;
        int B = 5;
        int[] C = {1, 10};
        System.out.println(solve(A, B, C));
    }
}
