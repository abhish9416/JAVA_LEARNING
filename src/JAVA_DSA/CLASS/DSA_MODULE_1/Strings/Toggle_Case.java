package CLASS.DSA_MODULE_1.Strings;

public class Toggle_Case {
    public static String solve(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch>='A'&&ch<='Z'){
                sb.append((char)(ch+32));
            } else if (ch>='a'&&ch<='z') {
                sb.append((char)(ch-32));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(solve(s));
    }
}
