package override;

public class Dog extends Animal{
    public void move(){
        super.move();
        System.out.println("狗会移动！");
    }
    public void bark(){
        System.out.println("狗会叫！");
    }
}
