package chapter11.Final;

public class FinalMethod {
    public static void main(String args[]){
        Sub s = new Sub();
        s.doIt();
        Parent p =(Parent)s;
        p.doIt2();
        p.doIt3();
    }
}
