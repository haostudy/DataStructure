package chapter7;

public class Compare {
    public static void main(String args[]){
        String c1 = new String("abc");
        String c2 = new String("abc");
        String c3 = c1;

        System.out.println("c1 = c2"+(c1==c2));
        System.out.println("c1 equals c2"+(c1.equals(c2)));
        System.out.println("c1 = c3"+(c1==c3));
        System.out.println("c1 equals c3"+(c1.equals(c3)));
        //186/605
    }
}
