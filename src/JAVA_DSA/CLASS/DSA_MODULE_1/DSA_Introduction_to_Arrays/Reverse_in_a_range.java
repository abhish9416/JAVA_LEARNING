package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

public class Reverse_in_a_range {
    public static void reverse(int[]A,int i,int j){
        while (i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }
    public static int[] solve(int[]A,int B,int C){
        reverse(A,B,C);
        return A;
    }
}
