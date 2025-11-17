package CLASS.DSA_MODULE_1.DSA_Interview_Problems_1;

import java.util.HashMap;

public class Majority_Element_n_2 {
    public static int bruteforce(int[]A){
        int n = A.length;
        for(int i=0;i<n;i++){
            int count= 0;
            for(int j=0;j<n;j++){
                if(A[j]==A[i]){
                    count++;
                }
            }
            if(count>n/2){
                return A[i];
            }
        }
        return -1;
    }
    public static int better(int[]A){
        int n = A.length;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<n;i++){
            int ele = A[i];
            hs.put(ele, hs.getOrDefault(ele,0)+1);
        }
        //iterating again to check the Frequency
        for(int i=0;i<n;i++){
            int ele = A[i];
            if(hs.get(ele) > n/2){
                return ele;
            }
        }
        return -1;
    }
    public static int solve(int[]A){
        int n = A.length;
        int count = 1;
        int ele = A[0];
        for(int i=1;i<n;i++){
            if(count==0){
                count = 1;
                ele = A[i];
            } else if (A[i]==ele) {
                    count++;
            }else {
                count--;
            }
        }
        int total = 0;
        for(int i=0;i<n;i++){
            if(A[i]==ele){
                total++;
            }
        }
        if(total > n/2){
            return ele;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] A = {2,2,3,3,1,2,2};
        System.out.println(bruteforce(A));
        System.out.println(better(A));
        System.out.println(solve(A));
    }
}
