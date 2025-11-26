package CLASS.DSA_MODULE_1.DSA_Arrays_Sliding_Window_Contribution_Technique;


public class Print_Start_and_indices_of_lengthk {
    public static void solve(int[]A,int k){
        int n =  A.length;
        int start = 0;
        int end = k-1;
        while (end < n){
            System.out.println(start+" "+end);
            start++;
            end++;
        }
    }
    public static void main(String[] args){
        int[]A = {0,1,2,3,4,5,6,7};
        solve(A,3);
    }
}
