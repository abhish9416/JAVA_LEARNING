package CLASS.DSA_MODULE_3.Binary_Search;

import java.util.Arrays;

public class Floor_and_Ceil_in_Sorted_Array {
    public static int floor(int[]A,int K){
        int n = A.length;
        int start = 0,end = n-1,ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(A[mid]<=K){
                ans = A[mid];
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static int ceil(int[]A,int K){
        int n = A.length;
        int start = 0,end = n-1,ans = -1;
        while(start<=end){
            int mid = start+(end-start) / 2;
            if(A[mid]>=K){
                ans = A[mid];
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static int[] solve(int[]A,int K){
        int floor = floor(A,K);
        int ceil = ceil(A,K);
        return new int[] {floor,ceil};
    }
    public static void main(String[] args) {
        int[]A = {3, 4, 4, 7, 8, 10};
        int K = 5;
        System.out.println(floor(A,K));
        System.out.println(ceil(A,K));
        System.out.println(Arrays.toString(solve(A,K)));
    }
}
