package CLASS.DSA_MODULE_1.Sorting_Basics;

import java.util.Arrays;

public class selection_sort {
    public static int[] solve(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i; j < n; j++) {
                if(A[j] < A[min_index]){
                    min_index = j;
                }
            }
            int temp = A[i];
            A[i] = A[min_index];
            A[min_index] = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {7, 4, 1, 9, 3};
        System.out.println(Arrays.toString(solve(A)));

    }
}
