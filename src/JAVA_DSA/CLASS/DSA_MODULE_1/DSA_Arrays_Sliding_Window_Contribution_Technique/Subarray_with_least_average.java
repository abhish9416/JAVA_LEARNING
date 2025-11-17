package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;

public class Subarray_with_least_average {
    public static int solve(int[]A,int B){
        int n = A.length;
        int index = -1;
        int sum = 0;
        double least = Double.MAX_VALUE;
        for(int i=0;i<B;i++){
            sum+=A[i];
        }
        double average = (double) sum / B;
        if(average < least){
            least = average;
            index = 0;
        }
        int start = 1;
        int end = B;
        while (end < n){
            sum = sum - A[start-1] + A[end];
            average = (double) sum / B;
            if(average < least){
                least = average;
                index = start;
            }
            start++;end++;
        }
        return index;
    }
    public static void main(String[] args){
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        int B = 3;
        System.out.println(solve(A,B));
    }
}
