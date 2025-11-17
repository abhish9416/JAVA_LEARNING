package STRIVERS.RECURSION;

import java.util.Scanner;

public class Print_Name_N_times {
    public static void solve(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Abhishek");
        solve(i+1,n);
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        solve(1,n);
    }
}
