package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Find_the_Nth_root_of_a_number_using_binary_search {
    public static int solve(int M,int N){
        int start = 1,end = M,ans = 0;
        while (start<=end){
            int mid = start+(end-start)/2;
            long sq = 1;
            for(int i=1;i<=N;i++){
                sq *= mid;
            }
            if(sq==M){
                return mid;
            } else if (sq<M) {
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int M = 27;
        int N = 3;
    }
}
