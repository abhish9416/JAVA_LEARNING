package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Minimum_in_Rotated_Sorted_Array {
    public static int solve(int[]A){
        int n = A.length;
        int start = 0,end = n-1;
        if(n==1){
            return A[0];
        }
        while(start<end){
            int mid = start+(end-start)/2;
            if(A[mid] > A[end]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return A[start];
    }
    public static void main(String[] args) {
        int[]A = {4,5,6,7,0,1,2,3};
        int[] B = {3,1,2};
        int[] C = {3,4,5,1,2};
        System.out.println(solve(C));
    }
}
