package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public static boolean ispossible(int[]A,int K,int J){
        int n = A.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=(int)Math.ceil((double)A[i]/J);
        }
        return sum <= K;
    }
    public static int brute(int[]A,int K){
        int n = A.length;
        int max = Integer.MIN_VALUE;
        for(int i:A){
            max = Math.max(max,i);
        }
        int ans = max;
        for(int i=1;i<=max;i++){
            if(ispossible(A,K,i)){
                ans = i;
                break;
            }
        }
        return ans;
    }
    public static int solve(int[]A,int K){
        int n = A.length;
        int max = Integer.MIN_VALUE;
        for(int i:A){
            max = Math.max(max,i);
        }
        int start = 1,end = max,ans = max;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(ispossible(A,K,mid)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]A = {1,2,3,4,5};
        int K = 8;
        System.out.println(brute(A,K));
        System.out.println(solve(A,K));
    }
}
