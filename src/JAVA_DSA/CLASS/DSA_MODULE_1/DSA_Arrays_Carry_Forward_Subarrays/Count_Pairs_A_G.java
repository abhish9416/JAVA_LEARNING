package CLASS.DSA_MODULE_1.DSA_Arrays_Carry_Forward_Subarrays;

public class Count_Pairs_A_G {
    public static int bruteforce(char[] A) {
        int count = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (A[i] == 'A') {
                for (int j = i + 1; j < n; j++) {
                    if (A[j] == 'G') count++;
                }
            }
        }
        return count;
    }

    public static int solve(char[] ch) {
        int n = ch.length;
        int count = 0;
        int countg = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (ch[i] == 'G') {
                countg++;
            }
            if (ch[i] == 'A') {
                count += countg;
            }
        }
        return count;
    }

    public static int solve1(String A) {
        int n = A.length();
        int countg = 0;
        int counta = 0;
        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if(ch=='A'){
                counta++;
            }
            if(ch=='G'){
                countg+=counta;
            }
        }
        return countg;
    }

    public static void main(String[] args) {
        char[] ch = {'A', 'D', 'G', 'A', 'G', 'A', 'G', 'F', 'G'};
        System.out.println(bruteforce(ch));
        System.out.println(solve(ch));
        String s = "ABCGAG";
        System.out.println(solve1(s));
    }
}
