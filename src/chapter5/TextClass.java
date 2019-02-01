package chapter5;

public class TextClass {
    public static void main(String[] args){
        String ex = "we are students";
        int size = ex.lastIndexOf("");
        System.out.println("索引位置"+size);
        System.out.println("字符串长度"+ex.length());
        //---------------------------------------------
        System.out.println(ex.charAt(1));
    }
}
