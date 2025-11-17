package CLASS.DSA_MODULE_1.Sorting_Basics;

import java.util.Arrays;

public class Elements_Removal {
    public static void reverse(int[]A){
        int n = A.length;
        int start = 0;
        int end = n-1;
        while (start < end){
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;end--;
        }
    }
    public static int solve(int[] A){
        int n = A.length;
        Arrays.sort(A);
        reverse(A);
        System.out.println(Arrays.toString(A));
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=A[i] *(i+1);
            System.out.println(sum);
        }
        return sum;
    }
    public static void main(String[] args){
        int[] A = {8,0,10};
        System.out.println(solve(A));
    }
}
