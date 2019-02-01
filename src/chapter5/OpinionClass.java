package chapter5;

public class OpinionClass {
    public static void main(String[] args){
        String a =new String("abc");
        String b = new String("ABC");
        String c =new String("abc");
        boolean b1= a.equalsIgnoreCase(b);
        boolean b2 = a.equals(c);
        boolean b3 = a==c;
        System.out.println(b1+"" +b2+""+b3);
    }
}
