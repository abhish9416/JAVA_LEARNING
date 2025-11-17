package STRIVERS.PATTERNS;

public class Pattern19 {
    public static void main(String[] args){
        int n = 5;
        for(int i=1;i<=n;i++){

            //printing the stars
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*");
            }
            //printing the spaces
            for(int j=1;j<=2*i-2;j++){
                System.out.print(" ");
            }
            //printing the stars
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            //printing the stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //printing the spaces
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            //printing the stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
