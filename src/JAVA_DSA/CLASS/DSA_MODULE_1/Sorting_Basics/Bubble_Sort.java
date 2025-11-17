package CLASS.DSA_MODULE_1.Sorting_Basics;

import jdk.nashorn.internal.runtime.JSONListAdapter;

import java.util.Arrays;

public class Bubble_Sort {
    public static int[] BubbleSort(int[]A){
        int n = A.length;
        for(int i=n-1;i>=0;i--){
            boolean iswapped = false;
            for(int j=0;j<i;j++){
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                    iswapped = true;
                }
            }
            if(!iswapped) break;
            System.out.println("runs");
        }
        return A;
    }
    public static void main(String[] args){
        int[]A = {64,34,25,12,22,11,90};
        int[] B = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(BubbleSort(B)));
    }
}
