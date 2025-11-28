package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Find_peak_element {
    public static int safeget(int[] A, int i) {
        int n = A.length;
        if (i >= 0 && i < n) {
            return A[i];
        }
        return Integer.MIN_VALUE;
    }

    public static int solve(int[] A) {
        int n = A.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] > safeget(A, mid - 1) && A[mid] > safeget(A, mid + 1)) {
                return mid;
            } else if (A[mid] > safeget(A, mid - 1) && A[mid] < safeget(A, mid + 1)) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        System.out.println(solve(A));
    }
}
