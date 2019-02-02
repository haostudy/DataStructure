package chapter7;

public class Anything {
    public Anything(){
        this("this调用有参构造方法");
        System.out.println("无参构造方法");
    }
    public Anything(String name){
        System.out.println("有参构造方法");
    }
}
