package chapter10.polymorphic;

public class Quarange {
    private Quarange[] qtrest =new Quarange[6];
    private int nextIndex= 0;
    public void draw(Quarange q){
        if (nextIndex<qtrest.length){
            qtrest[nextIndex] = q;
            System.out.println(nextIndex);
            nextIndex++;
        }
    }
    public static void main(String args[]){
        Quarange q =new Quarange();
        q.draw(new Square());
        q.draw(new Parallelograngle());
    }
}
