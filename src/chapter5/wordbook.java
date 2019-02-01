package chapter5;

public class wordbook {
    public static void main(String[] args){
        String str=new String("a");
        String str1=new String("b");
        String str2=new String("c");

        System.out.println(str.compareTo(str1));
        System.out.println(str2.compareTo(str1));
        String strEx = str.toUpperCase();
    }
}
