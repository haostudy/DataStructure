package override;

public class testDog {
    public static void main(String args[]){
        Animal animal = new Animal();
        Dog dog = new Dog();

        //调用方法
        animal.move();
        dog.move();
        dog.bark();
    }
}
