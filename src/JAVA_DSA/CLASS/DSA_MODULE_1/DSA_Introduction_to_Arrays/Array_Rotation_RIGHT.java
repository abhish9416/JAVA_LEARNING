package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

import java.util.Arrays;

public class Array_Rotation_RIGHT {
    public static void reverse(int[]A,int i,int j){
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }
    public static int[] solve(int[]A,int B){
        int n = A.length;
        B = B % n;
        //step 1 reverse the entire Array

        reverse(A,0,n-1);
        reverse(A,0,B-1);
        reverse(A,B,n-1);
        return A;
    }
    public static void main(String[] args){
        int[]A = {1,2,3,4,5,6,7};
        int b = 3;
        System.out.println(Arrays.toString(solve(A,b)));
    }
}
