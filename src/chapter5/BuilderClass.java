package chapter5;

public class BuilderClass {
    public static void main(String args[]){
        StringBuilder bf = new StringBuilder("hello");
        bf.append(" world");
        bf.insert(11," goods");
        System.out.println(bf);
        bf.delete(11,17);
        System.out.println(bf);
    }
}
