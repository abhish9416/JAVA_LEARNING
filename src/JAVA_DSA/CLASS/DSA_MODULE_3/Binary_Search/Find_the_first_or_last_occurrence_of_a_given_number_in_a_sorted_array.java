package CLASS.DSA_MODULE_3.Binary_Search;

import java.util.Arrays;

public class Find_the_first_or_last_occurrence_of_a_given_number_in_a_sorted_array {
    public static int[] bruteforce(int[]A,int K){
        int n = A.length;
        int first = -1;
        int last = -1;

        //first Occurance
        for(int i=0;i<n;i++){
            if(A[i]==K){
                first = i;
                break;
            }
        }

        //last occurance
        for(int i=0;i<n;i++){
           if(A[i]==K){
               last = i;
           }
        }
        return new int[]{first,last};
    }
    public static int first(int[]A,int K){
        int n = A.length;
        int start = 0,end = n-1,ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(A[mid]==K){
                ans = mid;
                end = mid-1;
            }else if(A[mid]<K){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static int last(int[]A,int K){
        int n = A.length;
        int start = 0,end = n-1,ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(A[mid]==K){
                ans = mid;
                start = mid+1;
            }else if(A[mid]<K){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    public static int[] solve(int[]A,int K){
        int first = first(A,K);
        int last = last(A,K);
        return new int[]{first,last};
    }
    public static void main(String[] args) {
        int[]A = {3, 4, 13, 13, 13, 20, 40};
        int K = 13;
        System.out.println(Arrays.toString(bruteforce(A,K)));
        System.out.println(Arrays.toString(solve(A,K)));
    }
}
