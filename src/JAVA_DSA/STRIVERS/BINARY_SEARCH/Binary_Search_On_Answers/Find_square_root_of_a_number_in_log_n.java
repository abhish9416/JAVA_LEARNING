package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Find_square_root_of_a_number_in_log_n {
    public static int solve(int n){
        int start = 1,end = n,ans = 0;
        while(start<=end){
            int mid = start + (end-start) / 2;
            long sq = (long)mid * mid;
            if(sq==n){
                return mid;
            }else if(sq<n){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[]args){
        int n = 28;
        System.out.println(solve(n));
    }
}
