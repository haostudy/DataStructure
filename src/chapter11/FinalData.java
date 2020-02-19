package chapter11;

import static java.lang.System.out;
import java.util.Random;

class Test {
    int i=0;
}
public class FinalData{
    static Random random = new Random();
    private final int VALUE_1 =9;
    private static final int VALUE_2=10;
    private final Test test = new Test();
    private Test test2= new Test();
    private final int[]a={1,2,3,4,5,6};
    private final int i4 =random.nextInt(20);
    private static final int Aaa = random.nextInt(20);
    public String toString(){
        return i4+""+Aaa+"";
    }
    public static void main(String args[]){
        FinalData finalData = new FinalData();
        finalData.test2=new Test();
        //finalData.VALUE_1++;
        for (int i = 0; i < finalData.a.length; i++) {
            //a[i]=9;
        }
        out.println(finalData);
        out.println("data2");
        out.println(new FinalData());
        out.println(finalData);
    }
}
