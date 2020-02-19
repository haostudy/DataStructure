package chapter11.innerClassUse;

public class InterfaceInner {
    public static void main(String args[]){
        OuterClass2 out = new OuterClass2();//out外部类
        OutInterface outInterface =out.doit();//内部类
        outInterface.f();
    }
}
class OuterClass2{
    private class InnerClass implements OutInterface{
        InnerClass(String s){
            System.out.println(s);
        }
        public void f(){
            System.out.println("访问内部类f方法");
        }
    }
    public OutInterface doit(){
        return new InnerClass("访问内部类构造方法");
    }
}