package overloading;

public class testJava {
    public void test(String name){}
    public void test(int num){}
    public double test(double num){
        return num;
    }

    public static void main(String args[]){
        testJava o = new testJava();
        o.test(5);
        o.test(5.0);
        o.test("name");
    }
}
