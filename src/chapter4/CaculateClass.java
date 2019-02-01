package chapter4;

import java.util.Scanner;

public class CaculateClass {
    public static void main(String[] args){
        double sum=0;int i=1;double temp=1;
        while(i<=20){
            sum=sum+temp;
            i++;
            temp=temp*(1.0/i);


//            sum=sum+temp;
//            i=i+1;
//            temp=temp*(1.0/i);
        }
        System.out.println(sum);
    }
}
