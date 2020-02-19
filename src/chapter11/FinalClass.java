package chapter11;

public class FinalClass {
    final int a=3;
    void doIt(){
        System.out.println("调用方法");
    }
    public static void main(String args[]){
        FinalClass finalClass = new FinalClass();
        //finalClass.a=finalClass.a+1;
        System.out.println(finalClass.a);
        finalClass.doIt();
    }
}
