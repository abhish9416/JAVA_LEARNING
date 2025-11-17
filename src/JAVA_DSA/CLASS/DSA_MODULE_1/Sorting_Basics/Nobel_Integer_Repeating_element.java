package CLASS.DSA_MODULE_1.Sorting_Basics;

import java.util.Arrays;

public class Nobel_Integer_Repeating_element {
    public static int solve(int[]A) {
        int n = A.length;
        Arrays.sort(A);
        int ans = 0;
        int count_less_ele = 0;
        if(A[0]==0){
            ans++;
        }
        for(int i=1;i<n;i++){
            if(A[i]!=A[i-1]){
                count_less_ele = i;
            }
            if(count_less_ele==A[i]){
                ans++;
            }
        }
        System.out.println(Arrays.toString(A));
        return ans;
    }
    public static void main(String[]args){
        int[]A = {-10,1,1,2,4,4,4,8,10};
        System.out.println(solve(A));
    }
}
