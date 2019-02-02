package chapter8;

public class Integer {
    public Integer(int i) {
        System.out.println("输出整数");
    }
    public Integer(String name){
        System.out.println("输出字符串");
    }
    public static void main(String args[]){
        Integer number = new Integer(7);
        Integer num =new Integer("12");
    }


}
