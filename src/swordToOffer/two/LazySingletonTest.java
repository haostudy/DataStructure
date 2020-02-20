package swordToOffer.two;

public class LazySingletonTest {
    private static class SingletonHolder{
        private static LazySingletonTest instace =new LazySingletonTest();
    }
    private static LazySingletonTest getInstance(){
        return SingletonHolder.instace;
    }
    private LazySingletonTest(){}
}
