package STRIVERS.PATTERNS;

import java.util.Scanner;

public class Longest_Common_Prefix {
    //Brute force with two Loops
    public static String common(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int n = Math.min(s1.length(),s2.length());
        for(int i=0;i<n;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }
    public static String LongestCommonPrefix(String[] strs) {
        String result = strs[0];
        for(int i=1;i<strs.length;i++){
            result = common(result, strs[i]);
        }
        return result;
    }
    public static void main(String[] args){
        String[] s = {"abcdefgh", "aefghijk", "abcefgh"};
    }
}
