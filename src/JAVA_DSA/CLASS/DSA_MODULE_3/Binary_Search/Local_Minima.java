package JAVA_DSA.CLASS.DSA_MODULE_3.Binary_Search;

public class Local_Minima {
    public static int safeget(int[] A, int i) {
        int n = A.length;
        if (i >= 0 && i < n) {
            return A[i];
        }
        return Integer.MAX_VALUE;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] < safeget(A, mid - 1) && A[mid] < safeget(A, mid + 1)) {
                return A[mid];
            }else if(A[mid] > safeget(A,mid+1)){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {9, 6, 3, 14, 5, 7, 4};
        System.out.println(solve(A));
    }
}
