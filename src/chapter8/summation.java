package chapter8;

import java.lang.Integer;

public class summation {
    public static void main(String args[]){
        String[] ex = {"12","89","10","18","35"};
        int sum=0;
        for(String i : ex){
            int myNum = Integer.parseInt(i);
            sum+=myNum;
        }
        System.out.println(sum);
    }
}
