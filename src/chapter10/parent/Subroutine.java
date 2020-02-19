package chapter10.parent;

public class Subroutine extends SubParent {
    Subroutine(){
        System.out.println("调用子类的Subroutine构造方法");
    }
    public static void main(String args[]){
        Subroutine s =new Subroutine();
    }
}
