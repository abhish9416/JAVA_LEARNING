package STRIVERS.Stacks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Daily_Temperature {
    public static int[] bruteforce(int[] A) {
        int n = A.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            boolean isfound = false;
            for (int j = i + 1; j < n; j++) {
                if (A[j] > A[i]) {
                    arr[i] = j - i;
                    isfound = true;
                    break;
                }
            }
            if (!isfound) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static int[] solve(int[] A) {
        int n = A.length;
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && A[st.peek()] <= A[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                arr[i] = 0;
            } else {
                arr[i] = st.peek() - i;
            }
            st.push(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {73, 74, 75, 71, 69, 72, 76, 73};
        //        0  1  2  3  4  5  6  7   8   9
        System.out.println(Arrays.toString(bruteforce(A)));
        System.out.println(Arrays.toString(solve(A)));
    }
}
