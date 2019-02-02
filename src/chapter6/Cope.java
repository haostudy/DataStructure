package chapter6;

import java.util.Arrays;

public class Cope {
    public static void main(String args[]){
        int arr[] = new int[]{1,5,3,2};
        int newTempArray[] = Arrays.copyOf(arr,3);
        int newArray[] = Arrays.copyOfRange(arr,3,4);
        int len = newArray.length;
        for (int i = 0; i < len ; i++) {
            System.out.print(newArray[i]+" ");
        }
    }
}
