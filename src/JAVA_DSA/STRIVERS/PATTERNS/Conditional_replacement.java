package STRIVERS.PATTERNS;

import java.util.Scanner;

public class Conditional_replacement {
    public static void main(String[] args){
        String s = "aeiOUz";

        String B = s+s;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<B.length();i++){
            char ch = B.charAt(i);
            if(ch>='a'&&ch<='z'){
                sb.append(ch);
            }
        }
        String vowels = "aeiou";
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(vowels.indexOf(ch)>=0){
                sb.setCharAt(i,'#');
            }
        }
        System.out.println(sb.toString());
    }
}
