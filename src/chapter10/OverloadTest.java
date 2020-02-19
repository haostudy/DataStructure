package chapter10;

public class OverloadTest {
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
    public static int add(int a){
        return a;
    }
    public static int add(int a ,double b ){
        return 1;
    }
    public static int add(double a, int b){
        return 1;
    }
    public static int add(int[] a){
        int s =0;
        for (int i = 0; i < a.length; i++) {
            s=s+a[i];
        }
        return s;
    }

    public static void main(String args[]){
        System.out.println(add(5,6));
        System.out.println(add(3.2,5));
        System.out.println(add(2));
    }
}
