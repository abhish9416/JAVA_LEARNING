package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

import java.util.ArrayList;

public class Leaders_in_an_array {
    public static int[] bruteforce(int[] A) {
        int n = A.length;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (A[j] > A[i]) {
                    count++;
                }
            }
            if (count == 0) {
                al.add(A[i]);
            }
        }
        int[] arr = new int[al.size()];
        for (int i = 0; i < n; i++) {
            arr[i] = al.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};
        System.out.println(bruteforce(A));
    }
}
