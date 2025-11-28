package STRIVERS.Stacks;
import java.util.*;
public class Maximum_Frequency_Stack {
    public static int[] solve(int[][]A,int n){
        int[] res = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Stack<Integer>> group = new HashMap<>();
        int maxFreq = 0;
        for(int i=0;i<n;i++){
            if(A[i][0]==1){
                int x = A[i][1];
                int freq = map.getOrDefault(x,0)+1;
                maxFreq = Math.max(maxFreq,freq);
                if(!group.containsKey(freq)){
                    group.put(freq,new Stack<>());
                }
                group.get(freq).push(x);
                res[i] = -1;
            }else{
                Stack<Integer> st = group.get(maxFreq);
                int x = st.pop();
                res[i] = x;
                map.put(x,map.get(x)-1);
                if(st.isEmpty()){
                    maxFreq--;
                }
            }
        }
        return res;
    }
}
