package CLASS.DSA_MODULE_1.Sorting_Basics;

import java.util.Arrays;

public class Arithmetic_Progression {
    public static int solve(int[]A){
        int n = A.length;
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        int diff = A[1] - A[0];
        System.out.println(diff);
        for(int i=1;i<n-1;i++){
            if(A[i+1]-A[i]!=diff){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        int[] A = {1,3,5};
        System.out.println(solve(A));
    }
}
