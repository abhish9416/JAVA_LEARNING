package CLASS.DSA_MODULE_1.Two_Dimensionall_Array;

public class Anti_Diagonals {
    public static int[] printDiagonal(int[][] A, int i, int j) {
        int n = A.length;
        int m = A[0].length;
        int[] arr = new int[m];
        int k = 0;
        while (i < n && j >= 0) {
            arr[k] = A[i][j];
            i++;j--;
            k++;
        }
        return arr;
    }

    public static int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] arr = new int[n + m - 1][m];
        int k = 0;

        //printing the diagonal starting from the row 0;
        for(int j=0;j<m;j++){
            arr[k] = printDiagonal(A,0,j);
            k++;
        }
        for(int i=1;i<n;i++){
            arr[k] = printDiagonal(A,i,m-1);
            k++;

        }
        return arr;
    }
    public static void print(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int m = A[i].length;
            System.out.print("[");
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.print("]");
        }
    }
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}};
        print(solve(A));
    }
}
