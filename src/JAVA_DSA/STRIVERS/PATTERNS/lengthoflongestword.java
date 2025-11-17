package STRIVERS.PATTERNS;

public class lengthoflongestword {
    public static void main(String[] args){
        String s = "coding is awesome";
//        String[] words = s.split(" ");
//        int maxLength = Integer.MIN_VALUE;
//        for(int i=0;i<words.length;i++){
//            maxLength = Math.max(maxLength,words[i].length());
//        }
//        System.out.println(maxLength);
        int count = 0;
        int maxLength = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==' '){
                maxLength = Math.max(maxLength,count);
                count = 0;
            }else{
                count++;
            }
        }
        maxLength = Math.max(maxLength,count);
        System.out.println(maxLength);
    }
}
