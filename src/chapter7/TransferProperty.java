package chapter7;

public class TransferProperty {
    static int i=47;
    public void call(){
        System.out.println("调用call方法");
        for (i = 0;i  < 3; i++) {
            System.out.print(i+" ");
            if(i==2)
                System.out.println("\n");
        }
    }
    public TransferProperty(){

    }
    public static void main(String args[]){
        TransferProperty p1= new TransferProperty();
        TransferProperty p2= new TransferProperty();
        p2.i=60;
        System.out.println("第一个实例对象调用call is "+p1.i++);
        p1.call();
        System.out.println("第二个实例对象调用call is "+p2.i);
        p2.call();
    }


}
