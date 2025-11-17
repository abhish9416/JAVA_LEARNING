package STRIVERS.RECURSION;

public class Recursion_Understanding {
    public static void main(String[] args){
        message();
    }
    public static void message(){
        System.out.println("Hello World");
        message1();
    }
    public static void message1(){
        System.out.println("Hello World");
        message2();
    }
    public static void message2(){
        System.out.println("Hello World");
    }
}
