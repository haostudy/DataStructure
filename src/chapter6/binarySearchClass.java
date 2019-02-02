package chapter6;

import java.util.Arrays;

public class binarySearchClass {
    public static void main(String args[]){
        int ia[] = new int[]{1,8,9,4,6};
        Arrays.sort(ia);
        int index = Arrays.binarySearch(ia,8);
        System.out.println(index);
    }

}
