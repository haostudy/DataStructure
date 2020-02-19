package chapter14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class entrySet {
    public static void main(String args[]){
        Map map =new HashMap();
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
        }
    }

}
