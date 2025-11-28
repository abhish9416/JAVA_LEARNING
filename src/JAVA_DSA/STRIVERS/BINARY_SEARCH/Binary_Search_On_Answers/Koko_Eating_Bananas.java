package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Koko_Eating_Bananas {
    //bruteforce
    public static boolean ispossible(int[]A,int time,int H){
        int n = A.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=(int)Math.ceil((double)A[i]/time);
        }
        return sum<=H;
    }
    public static int bruteforce(int[]A,int h){
        int n = A.length;
        int ans = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(A[i],max);
        }

        for(int i=1;i<=max;i++){
            if(ispossible(A,i,h)){
                ans = Math.min(ans,i);
            }
        }
        return ans;
    }
    public static int solve(int[]A,int H){
        int n = A.length;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(A[i],max);
        }
        int start = 1,end = max,ans = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(ispossible(A,mid,H)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]A = {7, 15, 6, 3};
        int h = 8;
        System.out.println(bruteforce(A,h));
    }
}
