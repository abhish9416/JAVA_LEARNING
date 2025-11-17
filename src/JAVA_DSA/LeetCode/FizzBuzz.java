package LeetCode;
import java.util.ArrayList;

public class FizzBuzz {
    public static ArrayList<String> solve(int n){
        ArrayList<String> al = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                al.add("FizzBuzz");
            }else if(i%3==0){
                al.add("Fizz");
            } else if (i%5==0) {
                al.add("Buzz");
            }else{
                al.add(String.valueOf(i));
            }
        }
        return al;
    }
    public static void main(String[] args){
        int n = 3;
        System.out.println(solve(n));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
