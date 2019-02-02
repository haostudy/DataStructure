package chapter6;

import java.util.Arrays;

public class Rakel {
    public static void main(String args[]){
        String str[] = new String[]{"ab","ef","cd","yz"};
        Arrays.sort(str);

        int index = Arrays.binarySearch(str,0,2,"yz");
        System.out.println(index);
    }
}
