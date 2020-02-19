package chapter12;

public class Captor {
    static int quotient(int x,int y)throws MmyException{
        if(y<0){
            throw new MmyException("除数不能为负额");
        }
        return x/y;
    }

    public static void main(String args[]){
        try {
//            int result= quotient(3,-1);
            int result =quotient(5,0);
        }catch (MmyException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }catch (Exception e){
            System.out.println("其他异常");
        }
    }
}
