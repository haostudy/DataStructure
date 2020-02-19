package chapter10.InstanceOfEx;

public class Parallelogram extends Quadrangle {
    public static void main(String args[]){
        Quadrangle q = new Quadrangle();
        Parallelogram P = new Parallelogram();

        if(P instanceof Parallelogram){
            System.out.println("this is real p");
        }

        if(q instanceof Parallelogram){
            Parallelogram p = (Parallelogram) q;
        }
        if(q instanceof Square){
            Square s =(Square)q;
        }
        //System.out.println(q instanceof Anything);
    }

}
