package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Experience2 {
    public static void main(String args[]){
        Set<String > set =new TreeSet();
        set.add("A");
        set.add("a");
        set.add("c");
        set.add("C");
        set.add("a");
        for(String i:set){
            System.out.print(i+" ");
        }
        System.out.println(" ");
        List<String> list =new ArrayList();
        list.add("A");
        list.add("a");
        list.add("c");
        list.add("C");
        list.add("a");
        for(String i:list){
            System.out.print(i+ " ");
        }
    }
}
