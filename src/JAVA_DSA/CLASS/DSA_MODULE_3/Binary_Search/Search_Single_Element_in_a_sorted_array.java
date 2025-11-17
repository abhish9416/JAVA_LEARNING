package JAVA_DSA.CLASS.DSA_MODULE_3.Binary_Search;

public class Search_Single_Element_in_a_sorted_array {
    public static int safeget(int[]A,int i){
        int n = A.length;
        if(i>=0&&i<n){
            return A[i];
        }
        return Integer.MAX_VALUE;
    }
    public static int solve(int[]A){
        int n = A.length;
        int start = 0,end = n-1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if(A[mid]!=safeget(A,mid-1)&&A[mid]!=safeget(A,mid+1)){
                return A[mid];
            }
            if(A[mid]==safeget(A,mid-1)){
                mid = mid-1;
            }
            if(mid%2==0){
                start = mid+2;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]A = {1,1,2,2,3,3,4,5,5,6,6};
        //        0 1 2 3 4 5 6 7 8 9 10
        System.out.println(solve(A));
    }
}
