package STRIVERS.PATTERNS;

public class Pattern8 {
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i <=n;i++){
            //printing spaces
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            //printing the stars
            for(int j=1;j<=2*n-2*i+1;j++){
                System.out.print("*");
            }
            //printing spaces
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
