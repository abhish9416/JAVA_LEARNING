package CLASS.DSA_MODULE_1.Bit_Manupulations;

public class Decimal_to_Binary {
    public static int tonumber(String s){
        int num = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            num = num*10+(ch-'0');
        }
        return num;
    }
    public static void main(String[] args){
        int n = 10;
        String binary = "";
        while(n > 0){
            int remainder = n % 2;
            binary = remainder+binary;
            n/=2;
        }
        System.out.println(tonumber(binary));
    }
}
