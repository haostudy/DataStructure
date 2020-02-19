package chapter11;

public class StaticInnerClass {
    int x=100;
    static class Inner{
        void doItInner(){
            //System.out.println("外部类"+x);
        }
        public static void main(String args[]){
            System.out.println("a");
        }
    }
}
