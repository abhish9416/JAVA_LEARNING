package CLASS.DSA_MODULE_3.DSA_Searching_2_Binary_Search_on_Answer;

public class Allocate_Books {
    public static boolean ispossible(int[] A, int mid, int k) {
        int n = A.length;
        int book = 1;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += A[i];
            if(total > mid){
                book++;
                total = A[i];
            }
        }
        if(book <=k){
            return true;
        }else{
            return false;
        }
    }

    public static int solve(int[] A, int B) {
        int n = A.length;
        // Edge case: Not enough books for students
        if (B > n) {
            return -1;
        }
        //calculating the Max Element for the start point
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, A[i]);
        }
        //calculating the sum of the array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
        }
        int start = max;
        int end = sum;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(ispossible(A,mid,B)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {12, 34, 67, 90};
        int B = 2;
        System.out.println(solve(A, B));
    }
}
