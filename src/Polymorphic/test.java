package Polymorphic;

public class test {
    public static void main(String args[]){
        show(new Cat());
        show(new Dog());

        Animal a = new Cat();
        a.eat();
        Cat c = (Cat)a;
        c.work();
    }
    public static void show(Animal a){
        a.eat();
        if(a instanceof Cat){
            Cat c =(Cat)a;
            c.work();
        }
        if(a instanceof Dog){
            Dog d = (Dog)a;
            d.work();
        }
    }
}
