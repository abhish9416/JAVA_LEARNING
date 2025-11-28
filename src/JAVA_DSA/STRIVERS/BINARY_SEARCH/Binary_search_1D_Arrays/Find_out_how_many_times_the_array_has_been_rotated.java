package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Find_out_how_many_times_the_array_has_been_rotated {
    public static int solve(int[]A){
        int n = A.length;
        int start = 0,end = n-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(A[mid] > A[end]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[]A = {4,5,6,7,0,1,2,3};
        System.out.println(solve(A));
    }
}
