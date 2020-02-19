package chapter11;

import java.util.Random;
import static java.lang.System.out;

public class FinalStaticData {
    private static Random random =new Random();
    private static int a1=random.nextInt(10);
    public static final int a2=random.nextInt(10);

    public static void main(String args[]){
        FinalStaticData fdata = new FinalStaticData();
        out.println(fdata.a1);
        out.println(fdata.a2);
        FinalStaticData fdata2 = new FinalStaticData();
        out.println(fdata2.a1);
        out.println(fdata2.a2);
    }

}
