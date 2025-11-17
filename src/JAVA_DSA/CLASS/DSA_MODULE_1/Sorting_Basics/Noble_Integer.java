package CLASS.DSA_MODULE_1.Sorting_Basics;

public class Noble_Integer {
    public static int solve(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for(int j=0;j<n;j++){
                if(A[j] > A[i]){
                    count++;
                }
            }
            if(count==A[i]){
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {3, 2, 1, 3};
        System.out.println(solve(A));
    }
}
