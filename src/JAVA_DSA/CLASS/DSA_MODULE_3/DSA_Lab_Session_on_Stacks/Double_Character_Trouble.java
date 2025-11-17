package CLASS.DSA_MODULE_3.DSA_Lab_Session_on_Stacks;

import java.util.Stack;

public class Double_Character_Trouble {
    public static String solve(String A){
        int n = A.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = A.charAt(i);
            if(!stack.isEmpty()&&stack.peek()==ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        System.out.println(stack);
        String str = "";
        while(!stack.isEmpty()){
            char ch = stack.pop();
            str = ch+str;

        }
        return str;
    }
    public static void main(String[] args){
        String A = "abccbc";
        System.out.println(solve(A));
    }
}
