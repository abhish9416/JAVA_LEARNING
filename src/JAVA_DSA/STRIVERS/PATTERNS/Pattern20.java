package STRIVERS.PATTERNS;

public class Pattern20 {
    public static void main(String[] args){
        int n = 5;
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*n-2*i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }else{
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*i-2*n;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
