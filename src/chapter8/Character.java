package chapter8;

public class Character {
    public Character(char value){
        System.out.println("调用了构造方法的方法啦");
    }
    public static void main(String args[]){
        Character mychar = new Character('s');
    }
}
