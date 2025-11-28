package STRIVERS.BINARY_SEARCH.Binary_Search_On_Answers;

public class Capacity_to_Ship_Packages_within_D_Days {
    public static boolean ispossible(int[]A,int d,int k){
        int n = A.length;
        int days = 1;
        int weight = 0;
        for(int i=0;i<n;i++){
            if(weight + A[i] > k ){
                days++;
                weight = A[i];
            }else{
                weight+=A[i];
            }
        }
        return days <= d;
    }
    public static int bruteforce(int[]A,int d){
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i:A){
            max = Math.max(max,i);
            sum+=i;
        }
        int ans = -1;
        for(int i=max;i<=sum;i++){
            if(ispossible(A,d,i)){
                ans = i;
                break;
            }
        }
        return ans;
    }
    public static int solve(int[]A,int D){
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i:A){
            max = Math.max(max,A[i]);
            sum+=A[i];
        }
        int start = max,end = sum,ans = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(ispossible(A,D,mid)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]A = {5, 4, 5, 2, 3, 4, 5, 6};
        int D = 5;
        System.out.println(bruteforce(A,D));
        System.out.println(solve(A,D));
    }
}
