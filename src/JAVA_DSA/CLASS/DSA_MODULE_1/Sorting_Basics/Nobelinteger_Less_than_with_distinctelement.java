package CLASS.DSA_MODULE_1.Sorting_Basics;

import java.util.Arrays;

public class Nobelinteger_Less_than_with_distinctelement {
    public static int solve(int[]A){
        int n = A.length;
        Arrays.sort(A);
        int count = 0;
        for(int i=0;i<n;i++){
            if(A[i]==i){
                count++;
            }
        }
        System.out.println(Arrays.toString(A));
        return count;
    }
    public static void main(String[] args){
        int[] A = {1,-5,3,5,-10,4};
        System.out.println(solve(A));
    }
}
