package chapter10;

public class Test2 extends Test{
    public Test2(){
        super();
        super.dosomething();
    }
    public void doSomethingnew(){}
    public void doSomething(){}
    protected Test2 doIt(){
        return this;
    }
}
