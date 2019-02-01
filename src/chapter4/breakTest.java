package chapter4;

public class breakTest {
    public static void main(String[] args){
        for (int i=1;i<=100;i++){
            System.out.println(i);
            if(i==6){
                System.out.println("end");
                break;
            }
        }
    }
}
