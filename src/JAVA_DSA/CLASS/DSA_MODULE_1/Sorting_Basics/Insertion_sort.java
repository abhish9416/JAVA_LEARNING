package CLASS.DSA_MODULE_1.Sorting_Basics;

public class Insertion_sort {
    public static int[] solve(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            int curEle = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > curEle){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = curEle;
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {3, 5, 2, 4};
    }
}
