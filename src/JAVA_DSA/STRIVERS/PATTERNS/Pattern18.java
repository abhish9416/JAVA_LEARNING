package STRIVERS.PATTERNS;

public class Pattern18 {
    public static void main(String[] args){
        int n = 5;
        int ch = 69;
        for(int i=1;i<=n;i++){
            int cj = ch;
            for(int j=1;j<=i;j++){
                System.out.print((char)cj+" ");
                cj++;
            }
            ch--;
            System.out.println();
        }
    }
}
