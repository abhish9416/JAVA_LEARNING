package CLASS.DSA_MODULE_1.DSA_Interview_Problems_1;

public class Length_of_longest_consecutive_ones {
    public static int solve(String s) {
        int n = s.length();
        int ans = Integer.MIN_VALUE;
        int countOnes = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '1') {
                countOnes++;
            }
        }
        if (countOnes == n) {
            return n;
        }
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                int total = 0;
                int leftCount = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if (s.charAt(j) == '1') {
                        leftCount++;
                    } else {
                        break;
                    }
                }
                int rightCount = 0;
                for (int j = i + 1; j < n; j++) {
                    if(s.charAt(j)=='1'){
                        rightCount++;
                    }else{
                        break;
                    }
                }
                if(leftCount+rightCount < countOnes){
                    total = leftCount+rightCount+1;
                }else{
                    total= leftCount+rightCount;
                }
                ans = Math.max(ans,total);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "111000";
        System.out.println(solve(s));
    }
}
