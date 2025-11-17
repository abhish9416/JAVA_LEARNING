package CLASS.DSA_MODULE_1.DSA_Arrays_Prefix_Sum;

import java.util.Arrays;

public class Equilibrium_index_of_an_array {
    public static int solve(int[] A) {
        int n = A.length;
        int[] sf = new int[n];
        sf[n-1] = A[n-1];
        for(int i=n-2;i>=0;i--){
            sf[i] = sf[i+1] + A[i];
        }
        System.out.println(Arrays.toString(sf));
        //creating the prefix sum array
        int[] pf = new int[n];
        pf[0] = A[0];
        for(int i=1;i<n;i++){
            pf[i] = pf[i-1]+A[i];

        }
        System.out.println(Arrays.toString(pf));
        for(int i=0;i<n;i++){
            if(pf[i]==sf[i]){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(solve(A));
    }
}
