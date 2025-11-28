package STRIVERS.BINARY_SEARCH.Binary_search_1D_Arrays;

public class Search_Element_in_a_Rotated_Sorted_Array {
    public static int solve(int[] A,int K){
        int n = A.length;
        int start = 0,end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(A[mid]==K){
                return mid;
            }
            if(A[start] <= A[mid]){
                //= is used becuase first element also can be the K
                if(A[start]<=K&&K<A[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                //== is used because last element also can be the K
                if(A[mid] < K && K<= A[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {4, 5, 6, 7, 0, 1, 2};
        int K = 0;
        int[]B = {5,1,3};
        int J = 3;
        System.out.println(solve(B,J));
        System.out.println(solve(A,K));
    }
}
