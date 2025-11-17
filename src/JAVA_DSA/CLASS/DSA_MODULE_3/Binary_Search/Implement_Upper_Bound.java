package JAVA_DSA.CLASS.DSA_MODULE_3.Binary_Search;

public class Implement_Upper_Bound {
    public static int bruteforce(int[]A,int K){
        int n = A.length;
        int ans = n;
        for(int i=0;i<n;i++){
            if(A[i]>K){
                ans = Math.min(ans,i);
            }
        }
        return ans;
    }
    public static int solve(int[]A,int K){
        int n = A.length;
        int start = 0,end = n-1,ans = n;
        while(start<=end){
            int mid = start+(end-start) / 2;
            if(A[mid] > K){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]A = {3,5,8,15,19};
        int x = 9;
        System.out.println(bruteforce(A,x));
    }
}
