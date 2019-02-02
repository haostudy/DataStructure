package chapter6;

import java.util.Arrays;

public class SearchClass {
    public static void main(String arg[]){
        int arr[] = new int[]{4,25,10};
        Arrays.sort(arr);
        int index =Arrays.binarySearch(arr,0,1,8);
    }
}
