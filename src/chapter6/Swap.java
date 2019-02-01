package chapter6;

import java.util.Arrays;

public class Swap {
    public static void main(String args[]){
        int[] array = new int[5];
        Arrays.fill(array,8);
        int len = array.length;
        for (int i = 0; i < len; i++) {
            System.out.print(array[i]);
        }
    }
}
