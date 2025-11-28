package STRIVERS.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element {
    public static int[] solve(int[]A){
        int n = A.length;
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&st.peek()<=A[i]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i] = -1;
            }else{
                arr[i] = st.peek();
            }
            st.push(A[i]);
        }
        System.out.println(st);
        return arr;
    }
    public static void main(String[] args){
        int[] A = {2,1,3};
        System.out.println(Arrays.toString(solve(A)));
    }
}
