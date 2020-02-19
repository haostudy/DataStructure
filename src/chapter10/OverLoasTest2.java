package chapter10;

public class OverLoasTest2 {
    public static int add1(int a ,int b){
        return a+b;
    }
    public double add1(double a,double b){
        return a+b;
    }
    public static int add(int a){
        return 1;
    }
    public static int add(int a,double b){
        return 1;
    }
    public static int add(int... a){
        int s =0;
        int len=a.length;
        for (int i = 0; i < len; i++) {
            s=s+i;
        }
        return s;
    }

    public static void main(String args[]){
        OverLoasTest2 overLoasTest2 =new OverLoasTest2();
        System.out.println(add(1,2));
        System.out.println(overLoasTest2.add1(2.0,2.0));
        System.out.println(add(1));
        System.out.println(add(1,2,3,4,5,6));
    }
}
