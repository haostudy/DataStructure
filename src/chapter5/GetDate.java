package chapter5;

import java.util.Date;

public class GetDate {
    public static void main(String args[]){
        Date date = new Date();
        String hour = String.format("%tH",date);
        String minute = String.format("%tM",date);
        String second = String.format("%tS",date);
        System.out.println("具体时间"+hour+"点"+minute+"分"+second+"秒");
    }
}
