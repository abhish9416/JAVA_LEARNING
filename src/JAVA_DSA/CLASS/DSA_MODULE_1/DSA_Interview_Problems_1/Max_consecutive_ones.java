package CLASS.DSA_MODULE_1.DSA_Interview_Problems_1;

public class Max_consecutive_ones {
    public static int solve(int[] A) {
        int n = A.length;
        int ans = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<n;i++){
            count+=A[i];
        }
        if(count==n){
            return n;
        }
        for (int i = 0; i < n; i++) {
            if(A[i]==0){
                int leftcount = 0;
                for(int j = i-1;j>=0;j--){
                    if(A[j]==1){
                        leftcount++;
                    }else{
                        break;
                    }
                }
                int rightcount = 0;
                for(int j=i+1;j<n;j++){
                    if(A[j]==1){
                        rightcount++;
                    }else{
                        break;
                    }
                }
                ans = Math.max(ans,(leftcount+rightcount+1));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 0, 1, 1, 0, 1, 1, 1};
        System.out.println(solve(A));
    }
}
