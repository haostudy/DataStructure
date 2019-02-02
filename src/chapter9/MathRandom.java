package chapter9;

public class MathRandom {
    public int GetEvenNum(int num1,int num2){
        int temp = num1+(int)Math.random()*(num2-num1);
        if(temp%2==0){
            return temp;
        }else return temp+1;
    }

    public static void main(String args[]){
        MathRandom mathRandom =new MathRandom();
        System.out.println(mathRandom.GetEvenNum(1,5));
    }
}
