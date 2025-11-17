package STRIVERS.PATTERNS;

public class Pattern12 {
    public static void main(String[] args){
        int n = 4;
        for(int i=1;i<=n;i++){
            //printing the Number
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //printing the spaces
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            //printing the numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
