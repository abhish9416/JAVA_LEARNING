package STRIVERS.PATTERNS;

public class Pattern17 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            //printing spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int code = 65;
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print((char)code);
                if(j<i){
                    code++;
                }else{
                    code--;
                }
            }
            //printing spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}