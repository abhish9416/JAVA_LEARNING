package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

import java.util.ArrayList;
import java.util.Collections;

public class Generate_all_subarrays {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> al) {
        int n = al.size();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
//                System.out.println(j - i + 1);
                ArrayList<Integer> l = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    l.add(al.get(k));
                }
                arr.add(l);
            }
        }
        return arr;
    }

    public static int[][] solve1(int[] A) {
        int n = A.length;
        int[][] arr = new int[n * (n + 1) / 2][];
        int x = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int len = j - i + 1;
                int[] mat = new int[len];
                int l = 0;
                for (int k = i; k <= j; k++) {
                    mat[l] = A[k];
                    l++;
                }
                arr[x] = mat;
                x++;
            }
        }
        return arr;
    }

    public static void print(int[][] A) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            int m = A[i].length;
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j]+" ");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Collections.addAll(al, 1, 2, 3);
        int[]A = {1,2,3};
        System.out.println(solve(al));
        print(solve1(A));
    }
}
