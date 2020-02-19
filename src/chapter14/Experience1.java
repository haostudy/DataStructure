package chapter14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Experience1 {
    public static void main(String args[]){
        List list = new LinkedList();
        for (int i = 1; i < 101; i++) {
            list.add(i);
        }
        list.remove(10);

    }
}
