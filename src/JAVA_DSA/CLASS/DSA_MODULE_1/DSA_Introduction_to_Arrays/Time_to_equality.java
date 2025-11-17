package CLASS.DSA_MODULE_1.DSA_Introduction_to_Arrays;

public class Time_to_equality {
    public static int main(int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max,A[i]);
        }
        int total = 0;
        for(int i=0;i<n;i++){
            total+= max - A[i];
        }
        return total;
    }

    public static void main(String[] args) {

    }
}
