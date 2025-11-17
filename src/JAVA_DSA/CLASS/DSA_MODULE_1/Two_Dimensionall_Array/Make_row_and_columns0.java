package CLASS.DSA_MODULE_1.Two_Dimensionall_Array;

public class Make_row_and_columns0 {
    public static int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == 0) {
                    for (int k = 0; k < m; k++) {
                        if (A[i][k] != 0) {
                            A[i][k] = -1;
                        }
                    }
                }
            }
        }
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if(A[i][j]==0){
                    for(int k=0;k<n;k++){
                        if(A[k][j]!=0){
                            A[k][j] = -1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A[i][j]==-1){
                    A[i][j] = 0;
                }
            }
        }
        return A;
    }

    public static void print(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4}, {5, 6, 7, 0}, {9, 2, 0, 4}};
        print(solve(A));
    }
}
