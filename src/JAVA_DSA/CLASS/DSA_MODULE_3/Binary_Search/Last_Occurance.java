package JAVA_DSA.CLASS.DSA_MODULE_3.Binary_Search;

public class Last_Occurance {
    public static int brute(int[]A,int K){
        int n = A.length;
        int ans = -1;
        for(int i=0;i<n;i++){
            if(A[i]==K){
                ans = i;
            }
        }
        return ans;
    }
    public static int solve(int[]A,int K){
        int n = A.length;
        int start = 0, end = n-1,ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(A[mid]==K){
                ans = mid;
                start = mid+1;
            }else if(A[mid]<K){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]A = {5, 7, 7, 8, 8, 10};
        int K = 7;
        System.out.println(brute(A,K));
        System.out.println(solve(A,K));
    }
}
