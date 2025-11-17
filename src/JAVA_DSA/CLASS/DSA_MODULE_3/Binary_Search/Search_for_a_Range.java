package JAVA_DSA.CLASS.DSA_MODULE_3.Binary_Search;

import java.util.Arrays;

public class Search_for_a_Range {
    public static int firstOccurance(int[]A,int K){
        int n = A.length;
        int start = 0,end = n-1,ans = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(A[mid]==K) {
                ans = mid;
                end = mid - 1;
            }else if(A[mid] < K){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static int lastOccurance(int[]A,int K){
        int n = A.length;
        int start = 0,end = n-1,ans = -1;
        while (start<=end){
            int mid = start+(end-start) / 2;
            if(A[mid] == K){
                ans = mid;
                start = mid+1;
            }else if(A[mid] < K){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static int[] solve(int[]A,int B){
        int start = firstOccurance(A,B);
        int last = lastOccurance(A,B);
        return new int[]{start,last};
    }
    public static void main(String[] args) {
        int[]A = {5, 7, 7, 8, 8, 10};
        int K = 8;
        System.out.println(firstOccurance(A,K));
        System.out.println(lastOccurance(A,K));
        System.out.println(Arrays.toString(solve(A,K)));
    }
}
