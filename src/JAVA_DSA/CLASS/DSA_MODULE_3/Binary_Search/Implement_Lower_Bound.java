package JAVA_DSA.CLASS.DSA_MODULE_3.Binary_Search;

public class Implement_Lower_Bound {
    public static int bruteforce(int[]A,int K){
        int n = A.length;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(A[i]>=K){
                ans = Math.min(ans,i);
            }
        }
        return ans;
    }
    public static int solve(int[]A,int K){
        int n = A.length,start = 0,end = n-1,ans = -1;
        while(start<=end){
            int mid = start+(end-start) / 2;
            if(A[mid]>=K){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {1,2,2,3};
        int x = 2;
        System.out.println(bruteforce(A,x));
        System.out.println(solve(A,x));
    }
}
