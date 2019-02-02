package chapter6;

import java.util.Arrays;

public class Displace {
    public static void main(String args[]){
        int arr[] = new int[]{45,12,2,10};
        Arrays.fill(arr,1,2,6);
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
