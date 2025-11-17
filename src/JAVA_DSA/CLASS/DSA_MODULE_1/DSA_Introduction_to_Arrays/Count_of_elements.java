package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

public class Count_of_elements {
    public static int solve(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, A[i]);
        }
        for (int i = 0; i < n; i++) {
            if(A[i] < max){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){

    }
}
