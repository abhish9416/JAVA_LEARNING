package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Count_Occurrences_in_Sorted_Array {
    public static int first(int[] A, int K) {
        int n = A.length;
        int start = 0, end = n - 1, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == K) {
                ans = mid;
                end = mid - 1;
            } else if (A[mid] < K) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int last(int[] A, int K) {
        int n = A.length;
        int start = 0, end = n - 1, ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (A[mid] == K) {
                ans = mid;
                start = mid + 1;
            } else if (A[mid] < K) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int solve(int[] A, int K) {
        int first = first(A, K);
        int last = last(A, K);
        return last-first + 1;
    }

    public static void main(String[] args) {
        int[] A = {2, 2, 3, 3, 3, 3, 4};
        int K = 3;
        System.out.println(solve(A,K));
    }
}
