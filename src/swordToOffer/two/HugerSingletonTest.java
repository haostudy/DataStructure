package swordToOffer.two;

public class HugerSingletonTest {
    private static final HugerSingletonTest instance = new HugerSingletonTest();

    public static HugerSingletonTest getInstance(){
        return instance;
    }

    private HugerSingletonTest(){}
}
