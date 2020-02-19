package chapter10.Interface;

public class QuadrangleUseInterface {
    public void doAnything(){
    }

    public static void main(String args[]){
        drawTest[] d ={new SquareUseInterface(),new ParallelogramgleUseInterface()};
        for (int i = 0; i < d.length; i++) {
            d[i].draw();
        }
    }
}
