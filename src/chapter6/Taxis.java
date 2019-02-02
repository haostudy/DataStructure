package chapter6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Taxis {
    public static void main(String args[]){
        int arr[] = new int[]{1,5,6,2,42,54,6};
        Arrays.sort(arr);
        int len=arr.length;
        for (int i=0;i<len;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
