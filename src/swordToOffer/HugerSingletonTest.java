package swordToOffer;

public class HugerSingletonTest {
    private static final HugerSingletonTest instance =new HugerSingletonTest();

    private HugerSingletonTest(){};

    public static HugerSingletonTest getInstance(){
        return instance;
    }
}
