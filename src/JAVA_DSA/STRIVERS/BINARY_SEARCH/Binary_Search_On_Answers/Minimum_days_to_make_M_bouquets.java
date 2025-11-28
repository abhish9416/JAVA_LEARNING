package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Minimum_days_to_make_M_bouquets {
    public static boolean ispossible(int[]A,int M,int K,int J){
        int n = A.length;
        int bloomed = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(A[i]<=J){
                count++;
            }else{
                bloomed += count / K;
                count = 0;
            }
        }
        bloomed+=count/K;
        return bloomed>=M;
    }
    public static int brute(int[]A,int M ,int K){
        int n = A.length;
        if( n < M*K){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,A[i]);
            max = Math.max(max,A[i]);
        }
        int ans = Integer.MAX_VALUE;
        for(int i=min;i<=max;i++){
            if(ispossible(A,M,K,i)){
                ans = i;
                break;
            }
        }
        return ans;
    }
    public static int solve(int[]A,int M,int K){
        int n = A.length;
        if((long)M * K > n){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : A){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        int start = min,end = max,ans = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(ispossible(A,M,K,mid)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]A = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2;
        int k = 3;
        System.out.println(solve(A,m,k));
    }
}
