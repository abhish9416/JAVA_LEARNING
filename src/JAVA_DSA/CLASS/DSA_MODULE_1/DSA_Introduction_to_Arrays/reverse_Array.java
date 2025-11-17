package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

import java.util.Arrays;

public class reverse_Array {
    public static int[] solve(int[]A){
        int n = A.length;
        int[] arr = new int[n];
        int j = 0;

        for(int i=n-1;i>=0;i--){
            arr[j] = A[i];
            j++;
        }
        return arr;
    }
    public static int[] inplace(int[]A){
        int n = A.length;
        for(int i=0,j=n-1;i<j;i++,j--){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        return A;
    }
    public static void main(String[] args){
        int[]A = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(solve(A)));
    }
}
